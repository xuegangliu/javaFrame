package org.lxg.frame.antlr.rule.parse;

import org.lxg.frame.antlr.rule.bean.ResultJsonModel;
import org.lxg.frame.antlr.rule.constant.VisitorStats;
import org.lxg.frame.antlr.rule.visitors.IBaseVisitor;

/**
 * @author: xuegangliu
 * @date: 5/31/2018 3:29 PM
 * @DES:
 * @version: v1.0
 */
public class StatsParser implements Parser {
    public static final VisitorStats STATS = VisitorStats.OnlyEquation;

    @Override
    public boolean beforeExecute(IBaseVisitor b) {
        return true;
    }

    @Override
    public ResultJsonModel parse(IBaseVisitor b) {
        return null;
    }
}

