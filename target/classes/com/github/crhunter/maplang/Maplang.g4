grammar Maplang;

topUnit
	: statement+
;

statement
    : (moveStatement | concatStatement | ifStatement)
 ;
 
 moveStatement
    : MOVE moveToStatement
 ;
 
 moveToStatement
    : moveToSendingArea TO identifier
 ;
 
 moveToSendingArea
    : identifier | literal
;

concatStatement
    : CONCAT concatToStatement (concatExtraToStatement)* concatAsStatement
;

concatToStatement
    : concatToSendingArea TO concatToSendingArea
;

concatExtraToStatement
    : TO concatToSendingArea
;

concatToSendingArea
    : identifier | literal
;

concatAsStatement
    : AS concatAsSendingArea
;

concatAsSendingArea
    : identifier
;

//ifStatement
ifStatement
    : IF condition ifThen ifElse? END_IF
;

ifThen
    : THEN? statement+
;

ifElse
    : ELSE statement*
;

condition
    : simpleCondition andOrCondition*
;

andOrCondition
    : (AND | OR) simpleCondition
;

simpleCondition
    : NOT? (LEFTPAREN condition RIGHTPAREN | relationCondition)
;

relationCondition
    : relationArithmeticComparison | relationCombinedComparison
;

relationArithmeticComparison
    : arithmeticExpression relationalOperator arithmeticExpression
;

relationCombinedComparison
    : arithmeticExpression relationalOperator LEFTPAREN            relationCombinedCondition RIGHTPAREN
;

relationCombinedCondition
    : arithmeticExpression ((AND | OR) arithmeticExpression)+
;

relationalOperator
    : (NOT? (GREATERTHAN | LESSTHAN | EQUALCHAR | GREATEREQUAL | LESSEQUAL | NOTEQUAL))
;

computeStatement
    : COMPUTE identifier EQUALCHAR arithmeticExpression END_COMPUTE
;

//arithmetic expression
arithmeticExpression
    : multDivs plusMinus*
;

plusMinus
    : (PLUSCHAR | MINUSCHAR) multDivs
;

multDivs
    : powers multDiv*
;

multDiv
    : (ASTERISK | SLASHCHAR) powers
;

powers
    : (PLUSCHAR | MINUSCHAR)? basis power*
;

power
    : DOUBLEASTERISK basis
;

basis
    : LEFTPAREN arithmeticExpression RIGHTPAREN | identifier | literal
;

identifier
    : IDENTIFIER | refIdentifier | arrayIdentifier
;

refIdentifier
    : IDENTIFIER POS INTEGERLITERAL THRU INTEGERLITERAL
;

arrayIdentifier
    : IDENTIFIER LEFTPAREN INTEGERLITERAL RIGHTPAREN
;

literal
    : STRINGLITERAL | numericLiteral
;

numericLiteral
    : NUMERICLITERAL | INTEGERLITERAL
;

//operators
AND : A N D;
COMPUTE : C O M P U T E;
END_COMPUTE : E N D MINUSCHAR C O M P U T E;
OR : O R;
IF : I F;
END_IF : E N D MINUSCHAR I F;
ELSE : E L S E;
MOVE : M O V E;
THEN : T H E N;
TO : T O;
CONCAT : C O N C A T;
AS : A S;
NOT : N O T;
POS : P O S;
THRU : T H R U;

EQUALCHAR :         '=';
NOTEQUAL :          '<>'|'!=';
GREATERTHAN :       '>';
LESSTHAN :          '<';
GREATEREQUAL :      '>=';
LESSEQUAL :         '<=';
PLUSCHAR :          '+';
MINUSCHAR :         '-';
ASTERISK :          '*';
DOUBLEASTERISK :    '**';
SLASHCHAR :         '/';
LEFTPAREN :         '(';
RIGHTPAREN :        ')';
DOT :               '.';

STRINGLITERAL :
        '"' ~["\n\r]* '"'
        | '\'' ~['\n\r] '\''
;
INTEGERLITERAL : (PLUSCHAR | MINUSCHAR)? [0-9]+;

NUMERICLITERAL : (PLUSCHAR | MINUSCHAR)? [0-9]* DOT [0-9]+;

IDENTIFIER : [a-zA-Z0-9]+ ([-_]+ [a-zA-Z0-9]+)*
;

// whitespace, line breaks, comments, ...
NEWLINE : '\r'? '\n' -> channel(HIDDEN);
//COMMENTLINE : COMMENTTAG WS ~('\n' | '\r')* -> channel(HIDDEN);

WS : [ \t\f;]+ -> channel(HIDDEN); 

// case insensitive chars
fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');


