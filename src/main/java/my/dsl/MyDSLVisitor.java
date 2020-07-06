// Generated from D:/javaProject/antlrv4Lean/src/main/java\MyDSL.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic hello.visitor for a parse tree produced
 * by {@link MyDSLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyDSLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyDSLParser#r}.
	 * @param ctx the parse tree
	 * @return the hello.visitor result
	 */
	T visitR(MyDSLParser.RContext ctx);
}