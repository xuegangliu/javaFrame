grammar Demo;

import Common,Expr;

/****************生成文件设置********************/
options {
language=Java;
}

/****************生成文件的包名********************/
@header {
package org.lxg.frame.antlr.demo.antlr;
}

prog
    :stat+
;

stat
    : expr NEWLINE                        # printExpr
    | ID '=' expr NEWLINE                 # assign
    | NEWLINE                             # blank
    ;
