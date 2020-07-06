package mysql.visitor;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import mysql.lexer.MysqlQueryBaseVisitor;
import mysql.lexer.MysqlQueryLexer;
import mysql.lexer.MysqlQueryParser;
import org.antlr.v4.runtime.CharStream;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

import static org.antlr.v4.runtime.CharStreams.fromFileName;
import static util.Util.info;

public class MyMysqlQueryVisitor extends MysqlQueryBaseVisitor {
    {
        String source="queryconditiontest.json";
        CharStream cs = null;
        try {
            cs = fromFileName(source);
        } catch (IOException e) {
            e.printStackTrace();
        }
        jsonObject=JSON.parseObject(cs.toString());
    }
    Map<String,String> queryField=new HashMap<>();
    String tableName="";
    JSONObject jsonObject;

    @Override
    public Object visitTableName(MysqlQueryParser.TableNameContext ctx) {
        tableName=ctx.getText();
        return tableName;
    }

    @Override
    public Object visitColumn_name(MysqlQueryParser.Column_nameContext ctx) {
        if(ctx.getChildCount()==3){
            queryField.put(ctx.getChild(0).getText(),ctx.getChild(2).getText());
        }else {
            queryField.put(ctx.getChild(0).getText(),ctx.getChild(0).getText());
        }
        return super.visitColumn_name(ctx);
    }

    @Override
    public Object visitFunction_name(MysqlQueryParser.Function_nameContext ctx) {
        return super.visitFunction_name(ctx);
    }

    @Override
    public Object visitSelectStatement(MysqlQueryParser.SelectStatementContext ctx) {
        return super.visitSelectStatement(ctx);
    }

    @Override
    public Object visitSelectElements(MysqlQueryParser.SelectElementsContext ctx) {
        return super.visitSelectElements(ctx);
    }

    @Override
    public Object visitTableSources(MysqlQueryParser.TableSourcesContext ctx) {
        return super.visitTableSources(ctx);
    }

    @Override
    public Object visitWhereClause(MysqlQueryParser.WhereClauseContext ctx) {
        Object o=super.visitWhereClause(ctx);
        System.out.println(o);
        return o;
    }

    @Override
    public Object visitLogicExpression(MysqlQueryParser.LogicExpressionContext ctx) {
        if(ctx.comparisonOperator()!=null){
            switch (ctx.getChild(1).getText()){
                case "=":
                    if(ctx.value(0).textLiteral()!=null){
                        String valueStr=ctx.value(0).textLiteral().TEXT_STRING().getText();
                        valueStr=valueStr.substring(1,valueStr.length()-1);
                        return valueStr.equals(jsonObject.getString(ctx.getChild(0).getText()));
                    }else if(ctx.value(0).decimalLiteral()!=null){
                        BigDecimal bigDecimal=new BigDecimal(ctx.value(0).decimalLiteral().DECIMAL_LITERAL().getText());
                        return bigDecimal.equals(jsonObject.getBigDecimal(ctx.fullColumnName().getText()));
                    }
            }
        }else if(ctx.IN()!=null){
            boolean isNot=false;
            boolean isContain=false;
            if(ctx.NOT()!=null){
                isNot=true;
            }

            Set<MysqlQueryParser.ValueContext> inValueSet=new HashSet<>(ctx.value()) ;

            if(ctx.value(0).textLiteral()!=null){
                Set<String> stringValues=new HashSet<>();
                ctx.value().forEach(p->{
                    stringValues.add(p.getText().substring(1,p.getText().length()-1));
                });
                isContain=stringValues.contains(jsonObject.getString(ctx.fullColumnName().getText()));
            }else if(ctx.value(0).decimalLiteral()!=null){
                Set<BigDecimal> bigDecimals=new HashSet<>();
                ctx.value().forEach(p->{
                    bigDecimals.add(new BigDecimal(p.getText()));
                });
                isContain=bigDecimals.contains(jsonObject.getBigDecimal(ctx.fullColumnName().getText()));
            }
            if(isNot){
                return !isContain;
            }else {
                return isContain;
            }
        }
        if(ctx.op.getType()== MysqlQueryLexer.AND){
            return (Boolean)visit(ctx.getChild(0))&&(Boolean) visit(ctx.getChild(2));
        }else if(ctx.op.getType()==MysqlQueryLexer.OR){
            return ((Boolean)visit(ctx.getChild(0)))||((Boolean) visit(ctx.getChild(2)));
        }
        return super.visitLogicExpression(ctx);
    }

    @Override
    public Object visitGroupByCaluse(MysqlQueryParser.GroupByCaluseContext ctx) {
        return super.visitGroupByCaluse(ctx);
    }

    @Override
    public Object visitHavingCaluse(MysqlQueryParser.HavingCaluseContext ctx) {
        return super.visitHavingCaluse(ctx);
    }

    @Override
    public Object visitOrderByClause(MysqlQueryParser.OrderByClauseContext ctx) {
        return super.visitOrderByClause(ctx);
    }

    @Override
    public Object visitLimitClause(MysqlQueryParser.LimitClauseContext ctx) {
        return super.visitLimitClause(ctx);
    }

    @Override
    public Object visitOrderByExpression(MysqlQueryParser.OrderByExpressionContext ctx) {
        return super.visitOrderByExpression(ctx);
    }

    @Override
    public Object visitGroupByItem(MysqlQueryParser.GroupByItemContext ctx) {
        return super.visitGroupByItem(ctx);
    }

    @Override
    public Object visitComparisonOperator(MysqlQueryParser.ComparisonOperatorContext ctx) {
        return super.visitComparisonOperator(ctx);
    }

    @Override
    public Object visitValue(MysqlQueryParser.ValueContext ctx) {
        return super.visitValue(ctx);
    }

    @Override
    public Object visitDecimalLiteral(MysqlQueryParser.DecimalLiteralContext ctx) {
        return super.visitDecimalLiteral(ctx);
    }

    @Override
    public Object visitTextLiteral(MysqlQueryParser.TextLiteralContext ctx) {
        return super.visitTextLiteral(ctx);
    }

    @Override
    public Object visitSelectColumnElement(MysqlQueryParser.SelectColumnElementContext ctx) {
        return super.visitSelectColumnElement(ctx);
    }

    @Override
    public Object visitSelectFunctionElement(MysqlQueryParser.SelectFunctionElementContext ctx) {
        return super.visitSelectFunctionElement(ctx);
    }

    @Override
    public Object visitFullColumnName(MysqlQueryParser.FullColumnNameContext ctx) {
        return super.visitFullColumnName(ctx);
    }

    @Override
    public Object visitAggregateFunctionCall(MysqlQueryParser.AggregateFunctionCallContext ctx) {
        return super.visitAggregateFunctionCall(ctx);
    }

    @Override
    public Object visitAggregateWindowedFunction(MysqlQueryParser.AggregateWindowedFunctionContext ctx) {
        return super.visitAggregateWindowedFunction(ctx);
    }

    @Override
    public Object visitFunctionArg(MysqlQueryParser.FunctionArgContext ctx) {
        return super.visitFunctionArg(ctx);
    }

    @Override
    public Object visitFunctionArgs(MysqlQueryParser.FunctionArgsContext ctx) {
        return super.visitFunctionArgs(ctx);
    }

    @Override
    public Object visitUid(MysqlQueryParser.UidContext ctx) {
        return super.visitUid(ctx);
    }
}
