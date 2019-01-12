package org.lxg.frame.antlr.demo.listener;

import org.lxg.frame.antlr.demo.antlr.DemoBaseListener;
import org.lxg.frame.antlr.demo.antlr.DemoParser;

/**
 * Created by Administrator on 2017/7/31.
 */
public class SampleListener extends DemoBaseListener {
    @Override
    public void exitPrintExpr(DemoParser.PrintExprContext ctx) {
        System.out.println("PrintExpr");
    }

    @Override
    public void exitAssign(DemoParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        System.out.println("Assign " + id);
    }

    @Override
    public void exitMulDiv(DemoParser.MulDivContext ctx) {
        if (ctx.op.getType() == DemoParser.MUL) {
            System.out.println("Mul"+ctx.op.getText());
        } else {
            System.out.println("Div"+ctx.op.getText());
        }
    }

    @Override
    public void exitAddSub(DemoParser.AddSubContext ctx) {
        if (ctx.op.getType() == DemoParser.ADD) {
            System.out.println("Add"+ctx.op.getText());
        } else {
            System.out.println("Sub"+ctx.op.getText());
        }
    }

    @Override
    public void exitId(DemoParser.IdContext ctx) {
        System.out.println("Id " + ctx.ID().getText());
    }

    @Override
    public void exitInt(DemoParser.IntContext ctx) {
        System.out.println("Int " + ctx.INT().getText());
    }
}
