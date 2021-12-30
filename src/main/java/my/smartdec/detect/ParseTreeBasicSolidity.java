package my.smartdec.detect;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.RuleNode;

/**
 *
 */
public final class ParseTreeBasicSolidity implements ParseTree {

    /**
     *
     */
    private final Source source;

    /**
     * @param src source
     */
    public ParseTreeBasicSolidity(final Source src) {
        this.source = src;
    }

    @Override
    public RuleNode root() throws Exception {
        return new my.smartdec.detect.SolidityParser(
                new CommonTokenStream(
                        new my.smartdec.detect.SolidityLexer(
                                this.source.chars()
                        )
                )
        )
                .sourceUnit();
    }
}
