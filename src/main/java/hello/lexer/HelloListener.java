// Generated from D:/javaProject/antlrv4Lean/src/main/java\Hello.g4 by ANTLR 4.7.2
package hello.lexer;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#prule}.
	 * @param ctx the parse tree
	 */
	void enterPrule(HelloParser.PruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#prule}.
	 * @param ctx the parse tree
	 */
	void exitPrule(HelloParser.PruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#dfafrule}.
	 * @param ctx the parse tree
	 */
	void enterDfafrule(HelloParser.DfafruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#dfafrule}.
	 * @param ctx the parse tree
	 */
	void exitDfafrule(HelloParser.DfafruleContext ctx);
}