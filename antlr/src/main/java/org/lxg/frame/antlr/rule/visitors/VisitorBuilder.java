package org.lxg.frame.antlr.rule.visitors;

public class VisitorBuilder {

    public static VisitorBuilder builder() {
        return new VisitorBuilder();
    }

    public IBaseVisitor build() {
        return new BaseVisitor();
    }
}
