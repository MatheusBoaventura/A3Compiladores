grammar Calculadora;

program : (statement ';')* EOF ;

statement : declaration
          | assignment
          | ifStatement
          | whileStatement
          | doWhileStatement
          | forStatement
          | printStatement
          | scanStatement
          ;

declaration : type ID ('=' (expression | STRING))? ;

type : 'int' | 'float' | 'string' ;

assignment : ID '=' (expression | STRING) ;

ifStatement : 'if' '(' condition ')' '{' (statement ';')* '}' ('else' '{' (statement ';')* '}')? ;

whileStatement : 'while' '(' condition ')' '{' (statement ';')* '}' ;

doWhileStatement : 'do' '{' (statement ';')* '}' 'while' '(' condition ')' ;

forStatement : 'for' '(' (declaration | assignment)? ';' condition? ';' assignment? ')' '{' (statement ';')* '}' ;

printStatement : 'printf' '(' STRING ','? (ID (',' ID)*)? ')' ;

scanStatement : 'scanf' '(' STRING ',' ('&' ID) (',' '&' ID)* ')' ;

condition : expression ('==' | '!=' | '<' | '<=' | '>' | '>=') expression ;

expression : expression ('*' | '/') expression
           | expression ('+' | '-') expression
           | '(' expression ')'
           | ID
           | NUMBER
           ;

ID : [a-zA-Z]+ ;

NUMBER : [0-9]+ ('.' [0-9]+)? ;

STRING : '"' .*? '"' ;

WS : [ \t\r\n]+ -> skip ;
