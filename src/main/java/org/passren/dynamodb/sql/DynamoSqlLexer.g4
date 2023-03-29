lexer grammar DynamoSqlLexer;

options { caseInsensitive = true; }

channels { ERRORCHANNEL }

// SKIP

SPACE:                               [ \t\r\n]+    -> channel(HIDDEN);
COMMENT_INPUT:                       '/*' .*? '*/' -> channel(HIDDEN);
LINE_COMMENT:                        (
                                       ('--' [ \t]* | '#') ~[\r\n]* ('\r'? '\n' | EOF)
                                       | '--' ('\r'? '\n' | EOF)
                                     ) -> channel(HIDDEN);

// Keywords
// Common Keywords

ALTER:                               'ALTER';
AND:                                 'AND';
AS:                                  'AS';
ASC:                                 'ASC';
BETWEEN:                             'BETWEEN';
BY:                                  'BY';
COLUMN:                              'COLUMN';
CONDITION:                           'CONDITION';
CONSTRAINT:                          'CONSTRAINT';
CONTINUE:                            'CONTINUE';
CREATE:                              'CREATE';
CURSOR:                              'CURSOR';
DATABASE:                            'DATABASE';
DATABASES:                           'DATABASES';
DEFAULT:                             'DEFAULT';
DELETE:                              'DELETE';
DESC:                                'DESC';
DESCRIBE:                            'DESCRIBE';
DISTINCT:                            'DISTINCT';
DISTINCTROW:                         'DISTINCTROW';
DROP:                                'DROP';
EXISTS:                              'EXISTS';
FROM:                                'FROM';
IN:                                  'IN';
INDEX:                               'INDEX';
INSERT:                              'INSERT';
INTO:                                'INTO';
IS:                                  'IS';
LIKE:                                'LIKE';
LIMIT:                               'LIMIT';
NOT:                                 'NOT';
NULL_LITERAL:                        'NULL';
NUMBER:                              'NUMBER';
ON:                                  'ON';
OR:                                  'OR';
ORDER:                               'ORDER';
PARTITION:                           'PARTITION';
PRIMARY:                             'PRIMARY';
PURGE:                               'PURGE';
SELECT:                              'SELECT';
SET:                                 'SET';
SEPARATOR:                           'SEPARATOR';
SHOW:                                'SHOW';
STATEMENT:                           'STATEMENT';
TABLE:                               'TABLE';
UNION:                               'UNION';
UPDATE:                              'UPDATE';
VALUES:                              'VALUES';
VALUE:                               'VALUE';
WHERE:                               'WHERE';
TRUE:                                'TRUE';
FALSE:                               'FALSE';
MISSING:                             'MISSING';

// DATA TYPE Keywords

INT:                                 'INT';
INTEGER:                             'INTEGER';
BIGINT:                              'BIGINT';
REAL:                                'REAL';
DOUBLE:                              'DOUBLE';
FLOAT:                               'FLOAT';
DECIMAL:                             'DECIMAL';
NUMERIC:                             'NUMERIC';
DATE:                                'DATE';
TIME:                                'TIME';
TIMESTAMP:                           'TIMESTAMP';
DATETIME:                            'DATETIME';
YEAR:                                'YEAR';
CHAR:                                'CHAR';
VARCHAR:                             'VARCHAR';


// Keywords, but can be ID
// Common Keywords, but can be ID

BEGIN:                               'BEGIN';
CONTAINS:                            'CONTAINS';
COMPRESSION:                         'COMPRESSION' | QUOTE_SYMB? 'COMPRESSION' QUOTE_SYMB?;


// Interval type Keywords

QUARTER:                             'QUARTER';
MONTH:                               'MONTH';
DAY:                                 'DAY';
HOUR:                                'HOUR';
MINUTE:                              'MINUTE';
WEEK:                                'WEEK';
SECOND:                              'SECOND';
MICROSECOND:                         'MICROSECOND';


// Operators. Arithmetics

STAR:                                '*';
DIVIDE:                              '/';
MODULE:                              '%';
PLUS:                                '+';
MINUS:                               '-';
DIV:                                 'DIV';
MOD:                                 'MOD';


// Operators. Comparation

EQUAL_SYMBOL:                        '=';
GREATER_SYMBOL:                      '>';
LESS_SYMBOL:                         '<';
EXCLAMATION_SYMBOL:                  '!';


// Operators. Bit

BIT_NOT_OP:                          '~';
BIT_OR_OP:                           '|';
BIT_AND_OP:                          '&';
BIT_XOR_OP:                          '^';


// Constructors symbols

DOT:                                 '.';
LR_BRACKET:                          '(';
RR_BRACKET:                          ')';
LR_BRACE:                            '{';
RR_BRACE:                            '}';
COMMA:                               ',';
SEMI:                                ';';
AT_SIGN:                             '@';
ZERO_DECIMAL:                        '0';
ONE_DECIMAL:                         '1';
TWO_DECIMAL:                         '2';
SINGLE_QUOTE_SYMB:                   '\'';
DOUBLE_QUOTE_SYMB:                   '"';
REVERSE_QUOTE_SYMB:                  '`';
COLON_SYMB:                          ':';
QUESTION_MARK_SYMB:                  '?';

fragment QUOTE_SYMB
    : SINGLE_QUOTE_SYMB | DOUBLE_QUOTE_SYMB | REVERSE_QUOTE_SYMB
    ;


// Literal Primitives

STRING_LITERAL:                      DQUOTA_STRING | SQUOTA_STRING | BQUOTA_STRING;
DECIMAL_LITERAL:                     DEC_DIGIT+;
REAL_LITERAL:                        (DEC_DIGIT+)? '.' DEC_DIGIT+
                                     | DEC_DIGIT+ '.' EXPONENT_NUM_PART
                                     | (DEC_DIGIT+)? '.' (DEC_DIGIT+ EXPONENT_NUM_PART)
                                     | DEC_DIGIT+ EXPONENT_NUM_PART;
BIT_STRING:                          BIT_STRING_L;


// Identifiers

ID:                                  ID_LITERAL;
SINGLE_QUOTE_ID:                     SQUOTA_STRING;
DOUBLE_QUOTE_ID:                     DQUOTA_STRING;


// Fragments for Literal primitives

fragment EXPONENT_NUM_PART:          'E' [-+]? DEC_DIGIT+;
fragment ID_LITERAL:                 [A-Z_$0-9\u0080-\uFFFF]*?[A-Z_$\u0080-\uFFFF]+?[A-Z_$0-9\u0080-\uFFFF]*;
fragment DQUOTA_STRING:              '"' ( '\\'. | '""' | ~('"'| '\\') )* '"';
fragment SQUOTA_STRING:              '\'' ('\\'. | '\'\'' | ~('\'' | '\\'))* '\'';
fragment BQUOTA_STRING:              '`' ( '\\'. | '``' | ~('`'|'\\'))* '`';
fragment HEX_DIGIT:                  [0-9A-F];
fragment DEC_DIGIT:                  [0-9];
fragment BIT_STRING_L:               'B' '\'' [01]+ '\'';



// Last tokens must generate Errors

ERROR_RECONGNIGION:                  .    -> channel(ERRORCHANNEL);