package my.smartdec.detect.app.cli;

import my.smartdec.detect.RulesCached;
import my.smartdec.detect.RulesXml;
import my.smartdec.detect.app.DirectoryAnalysis;
import my.smartdec.detect.app.DirectoryAnalysisCombined;
import my.smartdec.detect.app.DirectoryAnalysisDefault;
import my.smartdec.detect.app.ReportDefault;
import my.smartdec.detect.app.SourceLanguage;
import my.smartdec.detect.app.SourceLanguages;
import my.smartdec.detect.app.TreeFactoryDefault;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPathFactory;
import java.io.PrintWriter;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 *
 */
public final class DetectionAll {

    /**
     * @param args args
     * @throws Exception exception
     */
    public static void main(final String... args) throws Exception {
        DetectionAll.main(new ArgumentsDefault(args));
    }

    /**
     * @param arguments args
     * @throws Exception exception
     */
    public static void main(final Arguments arguments) throws Exception {
        Path src = arguments
                .value("-p", "--path")
                .map(Paths::get)
                .filter(Files::exists)
                .filter(Files::isDirectory)
                .orElseThrow(IllegalArgumentException::new);

        Function<SourceLanguage, RulesXml.Source> defaultRules =
                sourceLanguage -> () -> {
            String rulesFileName = sourceLanguage.rulesFileName();
            InputStream inputStream = RulesXml
                    .class
                    .getResourceAsStream(rulesFileName);
            if (inputStream == null) {
                throw new java.io.FileNotFoundException(rulesFileName);
            }
            System.out.println(rulesFileName);

            return inputStream;
        };

        Function<SourceLanguage, RulesXml.Source> rules = arguments
                .value("-r", "--rules")
                .map(Paths::get)
                .filter(Files::isRegularFile)
                .<Function<SourceLanguage, RulesXml.Source>>
                        map(path -> language -> () -> Files.newInputStream(path))
                .orElse(defaultRules);

        Optional<PrintWriter> printWriter = arguments
                .value("-o", "--output")
                .map(Paths::get)
                .map(output -> {
                    try {
                        Path parent = output.getParent();
                        if (parent != null && !Files.exists(parent)) {
                            Files.createDirectories(parent);
                        }
                        return new PrintWriter(Files.newBufferedWriter(output));
                    } catch (Exception ex) {
                        throw new IllegalArgumentException(ex);
                    }
                });

        try {
            new DetectionAll(src, rules).runAll(printWriter.orElse(null));
        } finally {
            if (printWriter.isPresent()) {
                printWriter.get().close();
            }
        }
    }

    /**
     *
     */
    private final Path source;
    /**
     *
     */
    private final Function<
            ? super SourceLanguage,
            ? extends RulesXml.Source
    > rules;

    /**
     * @param src source
     * @param rs rules
     */
    public DetectionAll(
            final Path src,
            final Function<
                    ? super SourceLanguage,
                    ? extends RulesXml.Source
            > rs
    ) {
        this.source = src;
        this.rules = rs;
    }

    /**
     * @param pw output writer
     * @throws Exception exception
     */
    public void runAll(final PrintWriter pw) throws Exception {
        try (Stream<Path> files = Files.list(this.source)) {
            files.filter(Files::isRegularFile)
                    .filter(DetectionAll::isContractFile)
                    .sorted()
                    .forEach(file -> {
                        try {
                            new DetectionAll(file, this.rules)
                                    .run(contractName(file), pw);
                        } catch (Exception ex) {
                            throw new RuntimeException(ex);
                        }
                    });
        }
    }

    /**
     * @param file file
     * @return contract name
     */
    private static String contractName(final Path file) {
        String name = file.getFileName().toString();
        int dot = name.lastIndexOf('.');
        return dot > 0 ? name.substring(0, dot) : name;
    }

    /**
     * @param file file
     * @return true if contract file
     */
    private static boolean isContractFile(final Path file) {
        String name = file.getFileName().toString();
        return name.endsWith(".sol") || name.endsWith(".vy");
    }

    /**
     *
     * @param sourceLanguage source language
     * @return directory analysis
     * @throws Exception exception
     */
    private DirectoryAnalysis makeDirectoryAnalysis(
            final SourceLanguage sourceLanguage
    ) throws Exception {
        return new DirectoryAnalysisDefault(
                this.source,
                p -> p.toString().endsWith(sourceLanguage.fileExtension()),
                new TreeFactoryDefault(
                        DocumentBuilderFactory
                                .newInstance()
                                .newDocumentBuilder(),
                        sourceLanguage
                ),
                new RulesCached(
                        new RulesXml(
                                this.rules.apply(sourceLanguage),
                                XPathFactory.newInstance().newXPath(),
                                Throwable::printStackTrace
                        )
                )
        );
    }

    /**
     * @param name contract name
     * @param pw print writer
     * @throws Exception exception
     */
    public void run(final String name, final PrintWriter pw) throws Exception {
        new ReportDefault(
                new DirectoryAnalysisCombined(
                    makeDirectoryAnalysis(new SourceLanguages.Solidity()),
                    makeDirectoryAnalysis(new SourceLanguages.Vyper())
                ),
                info -> {
                    System.out.println("````````````````````````````````````````````````");
                    System.out.println(info.file());
                    Map<String, Integer> result = new HashMap<>();
                    info.treeReport().streamUnchecked().forEach(
                            tree -> tree.contexts().forEach(
                                    context -> {
                                        System.out.printf(
                                                "ruleId: %s%n"
                                                      + "patternId: %s%n"
                                                      + "severity: %d%n"
                                                      + "line: %d%ncolumn: %d%n"
                                                      + "content: %s%n%n",
                                                tree.rule().id(),
                                                tree.pattern().id(),
                                                tree.pattern().severity(),
                                                context.getStart().getLine(),
                                                context
                                                       .getStart()
                                                       .getCharPositionInLine(),
                                                context.getText()
                                        );
                                        result.compute(
                                                tree.rule().id(),
                                                (k, v) -> Optional
                                                        .ofNullable(v)
                                                        .map(i -> i + 1)
                                                        .orElse(1)
                                        );
                                    }
                            )
                    );
                    result.forEach((k, v) -> System.out.println(k + " : " + v));
                    System.out.println();
                    if (pw != null) {
                        result.forEach(
                                (k, v) -> pw.println(name + " : " + k + " : " + v)
                        );
                    }
                }
        ).print();
    }
}
