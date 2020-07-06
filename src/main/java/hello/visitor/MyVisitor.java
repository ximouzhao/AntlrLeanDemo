package hello.visitor;

import hello.lexer.HelloBaseVisitor;
import hello.lexer.HelloParser;

public class MyVisitor extends HelloBaseVisitor<Object> {
    @Override
    public Object visitPrule(HelloParser.PruleContext ctx) {
        System.out.println(ctx.getText());
        return super.visitPrule(ctx);
    }

    @Override
    public Object visitDfafrule(HelloParser.DfafruleContext ctx) {
        System.out.println(ctx.getText());
        return super.visitDfafrule(ctx);
    }
}
