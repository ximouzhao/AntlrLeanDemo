package calc.launch;

import calc.lexer.CalcLexer;
import calc.lexer.CalcParser;
import calc.visitor.EvalVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.InputStream;

import static org.antlr.v4.runtime.CharStreams.fromFileName;


public class Calc {
    public static void main(String[] args) throws Exception {
        String source="calctest.txt";
        CharStream cs = fromFileName(source);
        CalcLexer lexer = new CalcLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalcParser parser = new CalcParser(tokens);
        ParseTree tree = parser.prog();
        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);
        System.out.println(tree.toStringTree(parser));
    }
}