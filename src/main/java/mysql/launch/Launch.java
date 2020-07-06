package mysql.launch;

import mysql.lexer.MysqlQueryLexer;
import mysql.lexer.MysqlQueryParser;
import mysql.visitor.MyMysqlQueryVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Launch {
    public static void main(String[] args) {
        try{
            String source="mysqlquerytest.txt";
            CharStream cs = fromFileName(source);
            MysqlQueryLexer lexer=new MysqlQueryLexer(cs);
            CommonTokenStream tokenStream=new CommonTokenStream(lexer);
            MysqlQueryParser parser=new MysqlQueryParser(tokenStream);
            ParseTree tree=parser.selectStatement();
            MyMysqlQueryVisitor visitor=new MyMysqlQueryVisitor();
            visitor.visit(tree);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
