package my.smartdec.detect.app.cli;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import my.smartdec.detect.SolidityLexer;
import my.smartdec.detect.SolidityParser;

import javax.swing.*;
import java.io.Reader;
import java.util.Arrays;

public class mytestPS {
    public static void main(String[] args) throws Exception {
        // create a CharStream that reads from standard input
        CharStream input = CharStreams.fromFileName("test/test.sol");
        // create a lexer that feeds off of input CharStream
        SolidityLexer lexer = new SolidityLexer(input);
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // create a parser that feeds off the tokens buffer
        SolidityParser parser = new SolidityParser(tokens);

        ParseTree tree = parser.sourceUnit(); // begin parsing at init rule
        System.out.println(tree.toStringTree(parser)); // print LISP-style tree

        //show AST in GUI
        TreeViewer viewer = new TreeViewer(Arrays.asList(
                parser.getRuleNames()),tree);
        viewer.open().get().setVisible(true);

    }
}
