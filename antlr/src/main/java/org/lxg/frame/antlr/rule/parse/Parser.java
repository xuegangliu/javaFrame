package org.lxg.frame.antlr.rule.parse;

import org.lxg.frame.antlr.rule.bean.ResultJsonModel;
import org.lxg.frame.antlr.rule.visitors.IBaseVisitor;

public interface Parser {
    boolean beforeExecute(IBaseVisitor b);
    ResultJsonModel parse(IBaseVisitor b);
}
