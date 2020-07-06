package mysql.visitor;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import mysql.lexer.MysqlQueryBaseVisitor;
import mysql.lexer.MysqlQueryParser;
import org.antlr.v4.runtime.CharStream;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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
        info("visitTableName:"+ctx.getText());
        return tableName;
    }

    @Override
    public Object visitColumn_name(MysqlQueryParser.Column_nameContext ctx) {

        info(ctx.getText());
        return super.visitColumn_name(ctx);
    }

    @Override
    public Object visitFunction_name(MysqlQueryParser.Function_nameContext ctx) {
        info(ctx.getText());
        return super.visitFunction_name(ctx);
    }

    @Override
    public Object visitSelectStatement(MysqlQueryParser.SelectStatementContext ctx) {
        info(ctx.getText());
        return super.visitSelectStatement(ctx);
    }

    @Override
    public Object visitSelectElements(MysqlQueryParser.SelectElementsContext ctx) {
        info(ctx.getText());
        return super.visitSelectElements(ctx);
    }

    @Override
    public Object visitTableSources(MysqlQueryParser.TableSourcesContext ctx) {
        info(ctx.getText());
        return super.visitTableSources(ctx);
    }

    @Override
    public Object visitWhereClause(MysqlQueryParser.WhereClauseContext ctx) {
        info(ctx.getText());
        Object whereResult=super.visitWhereClause(ctx);
        System.out.println("whereResult:"+whereResult);
        return whereResult;
    }

    @Override
    public Object visitLogicExpression(MysqlQueryParser.LogicExpressionContext ctx) {
        boolean result1,result2;
        if (ctx.logicalOperator()!=null&&ctx.logicalOperator().AND()!=null){
            result1=Boolean.TRUE.equals(visit(ctx.logicExpression(0)));
            result2=Boolean.TRUE.equals(visit(ctx.logicExpression(1)));
            if(result1&&result2){
                return Boolean.TRUE;
            }
        }else if(ctx.logicalOperator()!=null&&ctx.logicalOperator().OR()!=null){
            result1=Boolean.TRUE.equals(visit(ctx.logicExpression(0)));
            if(result1){
                return Boolean.TRUE;
            }else if(Boolean.TRUE.equals(visit(ctx.logicExpression(1)))){
                return Boolean.TRUE;
            }
        }else if(ctx.comparisonOperator()!=null){
            if(ctx.value(0).decimalLiteral()!=null){
                return ctx.getChild(2).getText().equals(jsonObject.getString(ctx.getChild(0).getText()));
            }else if(ctx.value(0).textLiteral()!=null){
                String valueStr=ctx.value(0).textLiteral().TEXT_STRING().getSymbol().getText();
                valueStr=valueStr.substring(1,valueStr.length()-1);
                return valueStr.equals(jsonObject.getString(ctx.getChild(0).getText()));
            }
        }else {
            visitChildren(ctx);
        }
        /*
        switch (ctx.getChild(1).getText().toLowerCase()){
            case "and":
                result1=Boolean.TRUE.equals(visit(ctx.logicExpression(0)));
                result2=Boolean.TRUE.equals(visit(ctx.logicExpression(1)));
                if(result1&&result2){
                    return Boolean.TRUE;
                }
                break;
            case "or":
                result1=Boolean.TRUE.equals(visit(ctx.getChild(0)));
                if(result1){
                    return Boolean.TRUE;
                }else if(Boolean.TRUE.equals(visit(ctx.getChild(2)))){
                    return Boolean.TRUE;
                }
                break;
            case "=":
                return ctx.getChild(1).getText().equals(jsonObject.getString(ctx.getChild(0).getText()));
            case "in":
                break;
            case "not":
                break;
            case "!=":
                return !ctx.getChild(1).getText().equals(jsonObject.getString(ctx.getChild(0).getText()));
            default:
                super.visitLogicExpression(ctx);
        }*/
        //info("visitLogicExpression result:"+super.visitLogicExpression(ctx));
        return Boolean.FALSE;
    }

    @Override
    public Object visitGroupByCaluse(MysqlQueryParser.GroupByCaluseContext ctx) {
        info(ctx.getText());
        return super.visitGroupByCaluse(ctx);
    }

    @Override
    public Object visitHavingCaluse(MysqlQueryParser.HavingCaluseContext ctx) {
        info(ctx.getText());
        return super.visitHavingCaluse(ctx);
    }

    @Override
    public Object visitOrderByClause(MysqlQueryParser.OrderByClauseContext ctx) {
        info(ctx.getText());
        return super.visitOrderByClause(ctx);
    }

    @Override
    public Object visitLimitClause(MysqlQueryParser.LimitClauseContext ctx) {
        info(ctx.getText());
        return super.visitLimitClause(ctx);
    }

    @Override
    public Object visitOrderByExpression(MysqlQueryParser.OrderByExpressionContext ctx) {
        info(ctx.getText());
        return super.visitOrderByExpression(ctx);
    }

    @Override
    public Object visitGroupByItem(MysqlQueryParser.GroupByItemContext ctx) {
        info(ctx.getText());
        return super.visitGroupByItem(ctx);
    }

    @Override
    public Object visitLogicalOperator(MysqlQueryParser.LogicalOperatorContext ctx) {
        info(ctx.getText());
        return super.visitLogicalOperator(ctx);
    }

    @Override
    public Object visitComparisonOperator(MysqlQueryParser.ComparisonOperatorContext ctx) {
        info(ctx.getText());
        return super.visitComparisonOperator(ctx);
    }

    @Override
    public Object visitValue(MysqlQueryParser.ValueContext ctx) {
        info(ctx.getText());
        return super.visitValue(ctx);
    }

    @Override
    public Object visitDecimalLiteral(MysqlQueryParser.DecimalLiteralContext ctx) {
        info(ctx.getText());
        return super.visitDecimalLiteral(ctx);
    }

    @Override
    public Object visitTextLiteral(MysqlQueryParser.TextLiteralContext ctx) {
        info(ctx.getText());
        return super.visitTextLiteral(ctx);
    }

    @Override
    public Object visitSelectColumnElement(MysqlQueryParser.SelectColumnElementContext ctx) {
        info(ctx.getText());
        queryField.put(ctx.getChild(0).getText(),ctx.getChild(2).getText());
        return queryField;
    }

    @Override
    public Object visitSelectFunctionElement(MysqlQueryParser.SelectFunctionElementContext ctx) {
        info(ctx.getText());
        return super.visitSelectFunctionElement(ctx);
    }

    @Override
    public Object visitFullColumnName(MysqlQueryParser.FullColumnNameContext ctx) {
        info(ctx.getText());
        return super.visitFullColumnName(ctx);
    }

    @Override
    public Object visitAggregateFunctionCall(MysqlQueryParser.AggregateFunctionCallContext ctx) {
        info(ctx.getText());
        return super.visitAggregateFunctionCall(ctx);
    }

    @Override
    public Object visitAggregateWindowedFunction(MysqlQueryParser.AggregateWindowedFunctionContext ctx) {
        info(ctx.getText());
        return super.visitAggregateWindowedFunction(ctx);
    }

    @Override
    public Object visitFunctionArg(MysqlQueryParser.FunctionArgContext ctx) {
        info(ctx.getText());
        return super.visitFunctionArg(ctx);
    }

    @Override
    public Object visitFunctionArgs(MysqlQueryParser.FunctionArgsContext ctx) {
        info(ctx.getText());
        return super.visitFunctionArgs(ctx);
    }

    @Override
    public Object visitUid(MysqlQueryParser.UidContext ctx) {
        info(ctx.getText());
        return super.visitUid(ctx);
    }
}
