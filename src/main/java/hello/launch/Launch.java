package hello.launch;

import hello.lexer.HelloLexer;
import hello.lexer.HelloParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import hello.visitor.MyVisitor;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Launch {
    public static void main(String[] args) {
        try{
            String source="test.txt";
            CharStream cs = fromFileName(source);
            HelloLexer lexer=new HelloLexer(cs);
            CommonTokenStream tokenStream=new CommonTokenStream(lexer);
            HelloParser parser=new HelloParser(tokenStream);
            ParseTree tree=parser.prule();
            MyVisitor visitor=new MyVisitor();
            visitor.visit(tree);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
