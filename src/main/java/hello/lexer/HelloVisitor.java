// Generated from D:/javaProject/antlrv4Lean/src/main/java\Hello.g4 by ANTLR 4.7.2
package hello.lexer;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic hello.visitor for a parse tree produced
 * by {@link HelloParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HelloVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HelloParser#prule}.
	 * @param ctx the parse tree
	 * @return the hello.visitor result
	 */
	T visitPrule(HelloParser.PruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#dfafrule}.
	 * @param ctx the parse tree
	 * @return the hello.visitor result
	 */
	T visitDfafrule(HelloParser.DfafruleContext ctx);
}