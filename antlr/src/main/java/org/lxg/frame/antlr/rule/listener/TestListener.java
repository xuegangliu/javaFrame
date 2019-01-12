package org.lxg.frame.antlr.rule.listener;

import org.lxg.frame.antlr.rule.antlr.RuleBaseListener;
import org.lxg.frame.antlr.rule.antlr.RuleParser;

/**
 * @author: xuegangliu
 * @date: 5/31/2018 5:00 PM
 * @DES:
 * @version: v1.0
 */
public class TestListener extends RuleBaseListener {

    @Override
    public void enterRegulation(RuleParser.RegulationContext ctx) {
        System.out.println("ttt");
    }

    @Override
    public void enterEquationModule(RuleParser.EquationModuleContext ctx) {
        System.out.println(ctx.ID());
    }
}
