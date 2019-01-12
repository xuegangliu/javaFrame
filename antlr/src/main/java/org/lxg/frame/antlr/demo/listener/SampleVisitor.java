package org.lxg.frame.antlr.demo.listener;


import org.lxg.frame.antlr.demo.antlr.DemoBaseVisitor;
import org.lxg.frame.antlr.demo.antlr.DemoParser;

/**
 * Created by Administrator on 2017/7/31.
 */
public class SampleVisitor extends DemoBaseVisitor<Double> {
    @Override
    public Double visitPrintExpr(DemoParser.PrintExprContext ctx) {
        // TODO Auto-generatedmethod stub
        Double value = visit(ctx.expr()); // evaluate the exprchild
        System.out.println(value); // print theresult
        return 0.0; // return dummyvalue
    }

    @Override
    public Double visitAssign(DemoParser.AssignContext ctx) {
        // TODO Auto-generatedmethod stub
        String id = ctx.ID().getText(); // id is left-hand side of '='
        Double value = visit(ctx.expr()); // compute valueof expression on right
        return value;
    }

    @Override
    public Double visitBlank(DemoParser.BlankContext ctx) {
        // TODO Auto-generatedmethod stub
        return super.visitBlank(ctx);
    }

    @Override
    public Double visitParens(DemoParser.ParensContext ctx) {
        // TODO Auto-generatedmethod stub
        return visit(ctx.expr()); // return childexpr's value
    }

    @Override
    public Double visitPOW(DemoParser.POWContext ctx) {
        Double left = visit(ctx.expr(0));
        Double right = visit(ctx.expr(1));

        Double temp = left;

        if(right == 0){
            return 1.0;
        }else {
            for (int i = 1; i < right; i++) {
                temp = temp * left ;
            }
            return temp;
        }
    }

    @Override
    public Double visitMulDiv(DemoParser.MulDivContext ctx) {
        // TODO Auto-generatedmethod stub
        Double left = visit(ctx.expr(0)); // get value ofleft subexpression
        Double right = visit(ctx.expr(1)); // get value ofright subexpression
        if ( ctx.op.getType() == DemoParser.MUL ) return left * right;
        return left / right; // must be DIV
    }

    @Override
    public Double visitAddSub(DemoParser.AddSubContext ctx) {
        // TODO Auto-generatedmethod stub
        Double left = visit(ctx.expr(0)); // get value ofleft subexpression
        Double right = visit(ctx.expr(1)); // get value ofright subexpression
        if ( ctx.op.getType() == DemoParser.ADD ) return left + right;
        return left - right; // must be SUB
    }

    @Override
    public Double visitId(DemoParser.IdContext ctx) {
        // TODO Auto-generatedmethod stub
        String id = ctx.ID().getText();
        System.out.println(id);
        return 0.0;
    }

    @Override
    public Double visitInt(DemoParser.IntContext ctx) {
        // TODO Auto-generatedmethod stub
        return Double.valueOf(ctx.INT().getText());
    }

    @Override
    public Double visitDouble(DemoParser.DoubleContext ctx) {
        return Double.valueOf(ctx.NUMERIC().getText());
    }

}
