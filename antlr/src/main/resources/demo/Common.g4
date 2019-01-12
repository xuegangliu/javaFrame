grammar Common;

ID : [a-zA-Z]+ ;                             // match identifiers
INT : [0-9]+ ;
DOT : '.';
NUMERIC : INT DOT INT+;                     // match integers
NEWLINE:'\r'? '\n' ;                        // return newlines to parser(end-statement signal)
WS : [ \t\r\n]+ -> skip ;                   // toss out whitespace
MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
POW : '^' ;