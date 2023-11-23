grammar Hello;
r  : 'hello' ID ;
ID : [a-z]+ ;
WS : [ \t\r\n]+ -> skip ;

variableDeclaration
    : 'var' ID '=' expression ';'
    ;

forLoop
    : 'for' '(' variableDeclaration condition ';' increment ')' block
    ;
