package my.smartdec.detect;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.RuleNode;

/**
 *
 */
public final class ParseTreeBasicVyper implements ParseTree {

    /**
     *
     */
    private final Source source;

    /**
     * @param src source
     */
    public ParseTreeBasicVyper(final Source src) {
        this.source = src;
    }

    @Override
    public RuleNode root() throws Exception {
        return new my.smartdec.detect.VyperParser(
                new CommonTokenStream(
                        new my.smartdec.detect.VyperLexer(
                                this.source.chars()
                        )
                )
        )
                .file_input();
    }
}
