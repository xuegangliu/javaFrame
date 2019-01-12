package org.lxg.frame.antlr.rule.visitors;

import org.lxg.frame.antlr.rule.antlr.RuleBaseVisitor;
import org.lxg.frame.antlr.rule.constant.VisitorStats;

import java.util.HashMap;

/**
 * @author: xuegangliu
 * @date: 5/31/2018 3:36 PM
 * @DES:
 * @version: v1.0
 */
public class BaseVisitor extends RuleBaseVisitor implements IBaseVisitor {
    @Override
    public VisitorStats getStats() {
        return null;
    }

    @Override
    public void setStats(VisitorStats stats) {

    }

    @Override
    public HashMap<String, String> getEquationScriptMap() {
        return null;
    }

    @Override
    public void setEquationScriptMap(HashMap<String, String> equationScriptMap) {

    }
}
