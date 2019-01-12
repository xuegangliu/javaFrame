grammar EAL;
@header{
package org.lxg.frame.antlr.eal.antlr;
}




eal: basicQuery | basicQuery (DELIMITER ealQuerys)* EOF;
basicQuery: ID_BASICQUERY*;
ealQuerys: searchModule;

//==================================================查询模块================================================================//
searchModule: loopSearchModule
              |noloopSearchModule
              |loopSearchModule DELIMITER noloopSearchModule
              ;

//可循环调用模块
loopSearchModule: evalModule;

//不可循环调用模块
noloopSearchModule: statsModule
                    |sortModule
                    |limitModule
                    |whereModule
                    |renameModule
                    |calculateModule
                    |filterModule
                    |lookupModule
                    |chartModule
                    ;


//==================================================eval查询模块==============================================================//
evalModule: EVAL_KEY ID EQUAL evalExpression;

evalExpression:
    evalExpression ADDSUB evalExpression        #evalAddSubFun
    |evalExpression MULDIV evalExpression       #evalMulDivFun
    |evalFunction                               #evalFunctionNon
    |ID                                         #evalIdFun
    |STRING                                     #evalStringFun
    |NUMBER                                     #evalNumberFun
    ;

evalFunction: evalFunName LEFT_BRACKET evalParameter RIGHT_BRACKET;
evalFunName: ID;
evalParameter: evalField (COMMA evalField)*;
evalField:
    evalConditionExpression
    |STRING
    |ID
    |NUMBER
    ;

evalConditionExpression:
    evalIfExpression
    |evalCaseExpression
    ;

//if表达式
evalIfExpression: ﬁeld=ID logicOperation compareValue COMMA trueValue=STRING COMMA falseValue=STRING;
compareValue: STRING|NUMBER;
logicOperation: EQUALOPERATION|COMPAREOPERATION;
//case表达式
evalCaseExpression:  caseStructure (COMMA caseStructure)*;
//case结构
caseStructure: ﬁeld=ID logicOperation compareValue COMMA outputValue=STRING;


//=====================================================stats查询模块==========================================================//
statsModule: STATS_KEY (statsFunctionOperation)+ statsTopFun? (BY_KEY fields)?;

statsFunctionOperation: statsFunName LEFT_BRACKET statsParameter RIGHT_BRACKET asFun?;
statsFunName: ID;
statsParameter: statsField (COMMA statsField)*;
statsField:
    ID
    |STRING
    |NUMBER
    ;

//top函数
statsTopFun: TOP_KEY LEFT_BRACKET ID COMMA NUMBER RIGHT_BRACKET;

//by 字段
fields: ID (',' ID)*;

//as
asFun: (AS_KEY STRING);

//==================================================id 兼容 id(id) 类型的规则================================================//
field:
    ID
    |ID LEFT_BRACKET ID RIGHT_BRACKET
    ;

//==================================================sort模块================================================================//
sortModule: SORT_KEY sortExpression (COMMA sortExpression)*;
sortExpression: field (sortOrder=ID)?;


//=================================================limit模块================================================================//
limitModule: LIMIT_KEY leftValue=NUMBER COMMA rightValue=NUMBER;


//=================================================where模块================================================================//
whereModule: WHERE_KEY whereLastExpression;
whereLastExpression: whereLastExpression whereOperator whereLastExpression
                    | LEFT_BRACKET  whereLastExpression RIGHT_BRACKET
                    | whereExpression;
whereExpression: whereString | whereBoolean | whereDouble;
whereString: field EQUALOPERATION STRING;
whereBoolean: field EQUALOPERATION BOOLEAN;
whereDouble: field logicOperation NUMBER;
whereOperator: '&&' | '||';


//================================================rename模块===============================================================//
renameModule: RENAME_KEY renameExpression (COMMA renameExpression)*;
renameExpression: field AS_KEY renameValue=STRING;

//================================================calculateModule模块====================================================//
calculateModule: CALCULATE_KEY STRING;

//================================================filterModule模块====================================================//
filterModule: FILTER_KEY filterMethod? filterField+;
filterMethod: ADDSUB;
filterField: field;

//================================================lookupModule模块====================================================//
lookupModule: LOOKUP_KEY lookupExpression ;
lookupExpression:
    lookupExpression COMMA lookupExpression
    | field COLON lookupKey=ID
    ;

//================================================transaction模块=======================================================//
transactionModule: TRANSACTION_KEY transactionFields transactionOpt+;
transactionFields: field (COMMA field)*;
transactionOpt: ID EQUAL transactionOptValue;
transactionOptValue:
    ID
    |NUMBER
    |STRING
    |BOOLEAN
    ;


//================================================图表模块================================================================//
chartModule:
    chartFunName=(CHART_BAR_KEY|CHART_PIE_KEY|CHART_LINE_KEY|CHART_SCATTER_KEY|CHART_SANKEY_KEY|CHART_DIGITAL_KEY|CHART_LIQUID_KEY)
    chartParameterExpre+
    ;
chartParameterExpre: chartParameterName EQUAL chartParameterValues;
chartParameterName: ID;
chartParameterValues: chartParameterValue (COMMA chartParameterValue)*;
chartParameterValue:
    field
    |STRING
    |NUMBER
    ;
//================================================函数关键字===============================================================//
//eval模块
EVAL_KEY: [Ee][Vv][Aa][Ll];     //eval

//stats模块
STATS_KEY: [Ss][Tt][Aa][Tt][Ss];     //stats
BY_KEY: [Bb][Yy];
TOP_KEY: [Tt][Oo][Pp];   //top
AS_KEY: [Aa][Ss];

//sort模块
SORT_KEY: [Ss][Oo][Rr][Tt];

//limit模块
LIMIT_KEY: [Ll][Ii][Mm][Ii][Tt];

//where模块
WHERE_KEY: [Ww][Hh][Ee][Rr][Ee];

//rename模块
RENAME_KEY: [Rr][Ee][Nn][Aa][Mm][Ee];

//calculate模块
CALCULATE_KEY: [Cc][Aa][Ll][Cc][Uu][Ll][Aa][Tt][Ee];

//filter模块
FILTER_KEY: [Ff][Ii][Ll][Tt][Ee][Rr];

//lookup模块
LOOKUP_KEY: [Ll][Oo][Oo][Kk][Uu][Pp];

//transaction模块
TRANSACTION_KEY: [Tt][Rr][Aa][Nn][Ss][Aa][Cc][Tt][Ii][Oo][Nn];

//图表模块
CHART_BAR_KEY: [Bb][Aa][Rr];
CHART_PIE_KEY: [Pp][Ii][Ee];
CHART_SCATTER_KEY: [Ss][Cc][Aa][Tt][Tt][Ee][Rr];
CHART_LINE_KEY: [Ll][Ii][Nn][Ee];
CHART_SANKEY_KEY: [Ss][Aa][Nn][Kk][Ee][Yy];
CHART_DIGITAL_KEY:[Dd][Ii][Gg][Ii][Tt][Aa][Ll];
CHART_LIQUID_KEY:[Ll][Ii][Qq][Uu][Ii][Dd];


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
