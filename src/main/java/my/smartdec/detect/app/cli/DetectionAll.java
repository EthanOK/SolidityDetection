package my.smartdec.detect.app.cli;

import my.smartdec.detect.RulesCached;
import my.smartdec.detect.RulesXml;
import my.smartdec.detect.app.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPathFactory;
import java.io.*;
import java.net.URI;
import java.nio.file.*;
import java.util.*;
import java.util.function.Function;

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

        /*Path src = arguments
                .value("-p", "--path")
                .map(Paths::get)
                .filter(Files::exists)
                .orElseThrow(IllegalArgumentException::new);*/

        Function<SourceLanguage, RulesXml.Source> defaultRules =
                sourceLanguage -> () -> {
            String rulesFileName = sourceLanguage.rulesFileName();
            URI uri = RulesXml
                    .class
                    .getResource(rulesFileName)
                    .toURI();
            System.out.println(uri);

            return Paths.get(uri);
        };

        Function<SourceLanguage, RulesXml.Source> rules = arguments
                .value("-r", "--rules")
                .map(Paths::get)
                .filter(Files::isRegularFile)
                .<Function<SourceLanguage, RulesXml.Source>>
                        map(path -> language -> () -> path)
                .orElse(defaultRules);

        //new Tooltest(src, rules).run();

        //测试代码文件夹路径
        // code1 result1200
        // code2 result28800
        ///code3 result1
        String fpath = "E:\\SmartContract\\mytest\\code3\\";
        //获取文件夹下的文件目录
        String[] filelists = getFileNames(fpath);
        //输出结果的保存路径
        String outpath = "E:\\SmartContract\\mytest\\result\\";
        PrintWriter printWriter = new PrintWriter(new FileWriter( outpath + "result1.txt"));
        //遍历批量测试
        for (String itemName : filelists) {
            //获取文件路径 例如：E:\SmartContract\codetest\0x1d4c723c9dfd9feb1cef39e2899693ccbc839fbe.sol
            String erch = fpath + itemName;
            //System.out.println(erch);

            new DetectionAll(Paths.get(erch), rules).run(itemName.substring(0,42), printWriter);
        }
        printWriter.close();
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
     * @throws Exception exception
     */
    public void run(String name, PrintWriter pw) throws Exception {
        
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
                    // 统计违反规则
                    result.forEach((k, v) -> System.out.println(k + " : " + v));
                    System.out.println();
                    //pw.println(name);
                    result.forEach(
                            (k, v) ->pw.println(name + " : " + k + " : " + v )

                    );
                }
        ).print();
    }
    //获取文件路径目录
    public static String[] getFileNames(String fpath) {
        File filepath = new File(fpath);
        if(!filepath.exists()){
            System.out.println("路径不存在");
        }
        return filepath.list();
    }

}
