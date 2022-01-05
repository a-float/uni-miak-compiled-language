grammar Coolang;

@header {
package me.miak.parser;
}

parse
 : block EOF
 ;

block
 : stat*
 ;

stat
 : assignment
 | funDefinition
 | declaration
 | declarationWithAssignment
 | ifStat
 | outStat
 | whileStat
 | forStat
 | funCall SCOL
 | returnStat
 | BREAK SCOL
 | OTHER {System.err.println("unknown character: " + $OTHER.text);}
 ;

returnStat: RETURN expr? SCOL;

funDefinition: (FUN | mutability?) ID COL OPAR funDefinitionArgs? CPAR ARROW funRetType ASSIGN funDefBody;

funRetType: type | VOID_TYPE;

funDefBody: statBlock | expr SCOL;

lambda: OPAR funDefinitionArgs? CPAR ARROW lambdaBody;
// because assignment as well as funDefBody require expr to end with semicolon I end up wth double semicolons
// to solve it, I split funBody into two separate rules
lambdaBody: statBlock | expr;

funDefinitionArgs
 : ID COL type (COMMA ID COL type)*
 ;

funCall : ID OPAR funArgs? CPAR;

funArgs
 : expr
 | expr (COMMA expr)*
 ;

outStat: PRINT expr SCOL;

assignment
 : ID ASSIGN expr SCOL
 ;

declaration
 : mutability? ID COL type SCOL
 ;

declarationWithAssignment
 : mutability? ID COL type ASSIGN expr SCOL
 ;

type: INT_TYPE | STRING_TYPE | BOOL_TYPE | funType;

funType: OPAR (type (COMMA type)*)? CPAR ARROW type;

mutability : MUTABLE | CONST;

ifStat
 : IF conditionBlock (ELIF conditionBlock)* (ELSE statBlock)?
 ;

conditionBlock
 : expr statBlock
 ;

statBlock
 : OBRACE block CBRACE
 ;

whileStat
 : WHILE expr statBlock
 ;

forStat: FOR ID IN range statBlock;

range : expr TO expr BY expr;

expr
 :<assoc=right> expr POW expr           #powExpr
 | NOT expr                             #notExpr
 | expr op=(MULT | DIV | MOD) expr      #multiplicationExpr
 | expr op=(PLUS | MINUS) expr          #additiveExpr
 | expr op=(LTEQ | GTEQ | LT | GT) expr #relationalExpr
 | expr op=(EQ | NEQ) expr              #equalityExpr
 | expr AND expr                        #andExpr
 | expr OR expr                         #orExpr
 | OPAR expr CPAR                       #parExpr
 | expr OSQR index CSQR                 #indexedExpr
 | funCall                              #funExpr
 | atom                                 #atomExpr
 | MINUS expr                           #unaryMinusExpr
 ;

index
 : expr     #indexSingle
 | range    #indexRange
 ;

atom
 : INT                          #intAtom
 | (TRUE | FALSE)               #booleanAtom
 | ID                           #idAtom
 | STRING                       #stringAtom
 | lambda                       #lambdaAtom
// | NIL                          #nilAtom
 ;

FUN: 'fun';
CONST : 'const';
MUTABLE : 'mut';
VAR : 'let';
OR : 'or';
AND : 'and';
EQ : '==';
NEQ : '!=';
GT : '>';
LT : '<';
GTEQ : '>=';
LTEQ : '<=';
PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
MOD : '%';
POW : '^';
NOT : 'not';
HASH: '#';
BY: 'by';
TO: 'to';

INT_TYPE: 'int';
STRING_TYPE: 'string';
BOOL_TYPE: 'bool';
VOID_TYPE: 'void';

THROUGH: '::';
COL : ':';
SCOL : ';';
ASSIGN : '=';
OPAR : '(';
CPAR : ')';
OBRACE : '{';
CBRACE : '}';
OSQR : '[';
CSQR : ']';
DQUOTE : '"';
ARROW : '->';
COMMA :',';
RETURN : 'ret';

FOR : 'for';
IN : 'in';
BREAK : 'break';
IF : 'if';
ELIF : 'elif';
ELSE : 'else';
WHILE : 'while';

TRUE : 'true';
FALSE : 'false';
NIL : 'nil';
PRINT : 'print';

ID
 : [a-zA-Z_] [a-zA-Z_0-9]*
 ;

INT
 : MINUS?[0-9]+
 ;

FLOAT
 : [0-9]+ '.' [0-9]*
 | '.' [0-9]+
 ;

STRING
 : DQUOTE ( ~["\r\n] | '""')* DQUOTE
 ;

COMMENT
 : '//' ~[\r\n]* -> skip
 ;

SPACE
 : [ \t\r\n] -> skip
 ;

OTHER
 : .
 ;