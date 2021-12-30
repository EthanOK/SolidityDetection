package my.smartdec.detect.app;

//import lombok.EqualsAndHashCode;
import lombok.EqualsAndHashCode;
import my.smartdec.detect.ParseTree;
import my.smartdec.detect.ParseTreeBasicSolidity;
import my.smartdec.detect.ParseTreeBasicVyper;
import my.smartdec.detect.SolidityParser;
import my.smartdec.detect.Source;
import my.smartdec.detect.VyperParser;

import java.nio.file.Path;

/**
 *
 */
public final class SourceLanguages {

    /**
     *
     */
    private SourceLanguages() { }

    /**
     *
     */
    @EqualsAndHashCode
    public static final class Solidity implements SourceLanguage {
        @Override
        public ParseTree createParseTree(final Source src) {
            return new ParseTreeBasicSolidity(src);
        }

        @Override
        public String[] getRuleNames() {
            return SolidityParser.ruleNames;
        }

        @Override
        public String fileExtension() {
            return ".sol";
        }

        @Override
        public String rulesFileName() {
            return "/solidity-rules.xml";
        }
    }

    /**
     *
     */
    @EqualsAndHashCode
    public static final class Vyper implements SourceLanguage {
        @Override
        public ParseTree createParseTree(final Source src) {
            return new ParseTreeBasicVyper(src);
        }

        @Override
        public String[] getRuleNames() {
            return VyperParser.ruleNames;
        }

        @Override
        public String fileExtension() {
            return ".vy";
        }

        @Override
        public String rulesFileName() {
            return "/vyper-rules.xml";
        }
    }

    /**
     *
     * @param file file
     * @return source language
     */
    public static SourceLanguage fromFileName(final Path file) {
        final SourceLanguage solidity = new Solidity();
        if (file.toString().endsWith(solidity.fileExtension())) {
            return solidity;
        }
        final SourceLanguage vyper = new Vyper();
        if (file.toString().endsWith(vyper.fileExtension())) {
            return vyper;
        }
        return null;
    }
}
