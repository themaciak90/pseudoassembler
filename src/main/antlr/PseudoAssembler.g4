grammar PseudoAssembler;

//grammar rules

rule_set: (single_rule (' '| '\t')* (EOF | '\n' )) ;

single_rule: (MOV | XOR) ' ' multiarg #movxorexpr
    | PUSH ' ' singlearg #pushexpr
    | INT ' ' intexpr #intrule
    ;

multiarg
    : arthmeticexpr ' '? DELI ' '? REG;



singlearg: arthmeticexpr;

intexpr: '0x80';


arthmeticexpr
    : arthmeticexpr ' '?  MULT ' '? arthmeticexpr  #multexpr
    | arthmeticexpr ' '? (ADD|SUB) ' '? arthmeticexpr #addsubexpr
    | LPAREN ' '? arthmeticexpr ' '? RPAREN   #parenexpr
    | DIG   #digexpr
    | REG  #regexpr
    ;

// lex rules

MOV : 'mov' ;
PUSH : 'push' ;
INT : 'int' ;
XOR : 'xor' ;

ADD : '+' ;
SUB : '-' ;
MULT : '*' ;

RPAREN : ')' ;
LPAREN : '(' ;

REG: '%eax' | '%ebx' | '%ecx' | '%edx' ;

DIG : [0-9]+;

DELI: ',' ;


//NEWLINE : [\r\n]+ ;

//WS : (' '|'\t')+;


