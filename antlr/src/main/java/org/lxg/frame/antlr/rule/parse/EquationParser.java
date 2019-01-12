package org.lxg.frame.antlr.rule.parse;

import org.lxg.frame.antlr.rule.bean.ResultJsonModel;
import org.lxg.frame.antlr.rule.visitors.IBaseVisitor;

/**
 * @author: xuegangliu
 * @date: 5/31/2018 3:19 PM
 * @DES:
 * @version: v1.0
 */
public class EquationParser implements Parser {
    @Override
    public boolean beforeExecute(IBaseVisitor b) {
        return false;
    }

    @Override
    public ResultJsonModel parse(IBaseVisitor b) {
        return null;
    }
}
