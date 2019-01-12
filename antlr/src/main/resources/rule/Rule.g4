grammar Rule;

@header {
package org.lxg.frame.antlr.rule.antlr;
}
options {
language=Java;
}


//rule: equation (DELIMITER regular)* (DELIMITER regular)* (DELIMITER sql)*
//    | equation (DELIMITER equation)* (DELIMITER regular)* (DELIMITER sql)*
//    EOF;
regulation: equation;

equation: equationModule; //  a=b a!=b a>b a<b
regular: regularModule;   // [1-9]{1}[0-9]{9}  a
sql: sqlModule;

//==================================================  算式模块 =====================================================
equationModule: EQUATION_KEY ID EQUAL equExpression;

equExpression:
    equExpression ADDSUB equExpression          #equAddSubFun
    |equExpression MULDIV equExpression         #equMulDivFun
    |ID                                         #equIdFun
    |STRING                                     #equStringFun
    |NUMBER                                     #equNumberFun
    ;

//==================================================  正则模块 =====================================================
regularModule: REGU_KEY ID EQUAL regularExpression;

regularExpression:
    STRING                                     #regularString
    ;

//==================================================  正则模块 =====================================================
sqlModule: SQL_KEY ID EQUAL sqlExpression;

sqlExpression:
    STRING                                     #sqlString
    ;
//================================================函数关键字===============================================================//
EQUATION_KEY: [Ee][Qq][Uu][Aa][Tt][Ii][Oo][Nn];              // 表达式
REGU_KEY: [Rr][Ee][Gg][Uu];         // 正则
SQL_KEY: [Ss][Ql][Ll];              // sql


//==========================================================通用组件=================================================//
NUMBER: '-'? (INT | DOUBLE);  //数值型
STRING: '"'(ESC|.)*?'"';   //字符串
BOOLEAN : 'true'|'false';   //布尔型
ID: ID_LETTER (ID_LETTER | DIGIT)* ;    //标识符
//TIME: [0-9][0-9][0-9][0-9]'-'[0-1][0-9]'-'[0-3][0-9]'T'[0-2][0-9]':'[0-6][0-9]':'[0-6][0-9]'.'[0-9][0-9][0-9]'Z';  //时间
//TIMESPAN: INT('y'|'M'|'d'|'h'|'m'|'s');    //时间跨度
WS: [ \t\n\r]+ -> skip ;   //无效字符
DOUBLE: INT '.' INT;   //浮点数
INT: DIGIT+;   //整型
ID_BASICQUERY: '*';
fragment ESC: '\\"'|'\\\\';    //特殊字符
fragment ID_LETTER: 'a'..'z'|'A'..'Z'|'_' ; //单个字符
fragment DIGIT: '0'..'9'; //单个数字



//==========================================================符号=======================================================//
COMMA: ',';
LEFT_BRACKET: '(';
RIGHT_BRACKET: ')';
DELIMITER: '|';
EQUAL: '=';
UNDERLINE: '_';
COLON: ':';
CONTRARY: '^';


//=========================================================计算组件===================================================//
ADDSUB: '+'|'-';
MULDIV: '*'|'/';

//==========================================================逻辑组件==================================================//
EQUALOPERATION: '!='|'==';
COMPAREOPERATION:'>'|'<'|'<='|'>=';