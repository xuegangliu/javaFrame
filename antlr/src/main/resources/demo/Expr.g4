grammar Expr;

expr
    : <assoc=right> expr POW expr       # POW
    | expr op=(MUL|DIV) expr            # MulDiv
    | expr op=('+'|'-') expr            # AddSub
    | NUMERIC                           # double
    | INT                               # int
    | ID                                # id
    | '(' expr ')'                      # parens
    ;
