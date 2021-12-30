package my.smartdec.detect.app.cli;

import org.antlr.v4.gui.TreeViewer;
import my.smartdec.detect.SourceFile;
import my.smartdec.detect.app.SourceLanguage;
import my.smartdec.detect.app.SourceLanguages;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 *
 */
public final class TreeView {

    /**
     * @param args args
     * @throws Exception exception
     */
    public static void main(final String... args) throws Exception {
        ArgumentsDefault arguments = new ArgumentsDefault(args);

        Path src = arguments
                .value("-p", "--path")
                .map(Paths::get)
                .orElseThrow(IllegalArgumentException::new);

        new TreeView(src).run();
    }

    /**
     *
     */
    private final Path path;

    /**
     * @param src src
     */
    public TreeView(final Path src) {
        this.path = src;
    }

    /**
     * @throws Exception exception
     */
    public void run() throws Exception {
        final SourceLanguage sourceLanguage =
                SourceLanguages.fromFileName(this.path);
        if (sourceLanguage == null) {
            throw new IllegalArgumentException();
        }
        //sourceLanguage.getRuleNames() 是Solidity.g4 文件中的首部的语法规则 sourceUnit, pragmaDirective, pragmaSolidity
        //createParseTree 调用 ParseTreeBasicSolidity类
        new TreeViewer(
                Arrays.asList(sourceLanguage.getRuleNames()),
                sourceLanguage.createParseTree(
                        new SourceFile(this.path)
                ).root()
        )
                .open()
                .get()
                .setVisible(true);
    }
}
