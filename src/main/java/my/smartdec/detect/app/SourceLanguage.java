package my.smartdec.detect.app;

import my.smartdec.detect.ParseTree;
import my.smartdec.detect.Source;

/**
 *
 */
public interface SourceLanguage {
    /**
     *
     * @param src src
     * @return ParseTree
     */
    ParseTree createParseTree(Source src);

    /**
     *
     * @return rule names
     */
    String[] getRuleNames();

    /**
     *
     * @return file extension
     */
    String fileExtension();

    /**
     *
     * @return rules file name
     */
    String rulesFileName();
}
