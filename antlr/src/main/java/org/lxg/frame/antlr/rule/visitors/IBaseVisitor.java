package org.lxg.frame.antlr.rule.visitors;

import org.lxg.frame.antlr.rule.antlr.RuleVisitor;
import org.lxg.frame.antlr.rule.constant.VisitorStats;

import java.util.HashMap;

/**
 * @author: xuegangliu
 * @date: 5/31/2018 3:15 PM
 * @DES:
 * @version: v1.0
 */
public interface IBaseVisitor extends RuleVisitor {

    @Deprecated
    VisitorStats getStats();

    @Deprecated
     void setStats(VisitorStats stats);

     HashMap<String, String> getEquationScriptMap();

     void setEquationScriptMap(HashMap<String, String> equationScriptMap);
}
