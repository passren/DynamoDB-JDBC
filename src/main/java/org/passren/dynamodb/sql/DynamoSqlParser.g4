parser grammar DynamoSqlParser;

options { tokenVocab=DynamoSqlLexer; }

// Top Level Description

root
    : sqlStatements? (MINUS MINUS)? EOF
    ;

sqlStatements
    : (sqlStatement (MINUS MINUS)? SEMI? | emptyStatement_)*
    (sqlStatement ((MINUS MINUS)? SEMI)? | emptyStatement_)
    ;

sqlStatement
    // : ddlStatement | transactionStatement
    : dmlStatement
    ;

emptyStatement_
    : SEMI
    ;

// ddlStatement
//     : createTable | alterTable | dropTable
//     ;

// transactionStatement
//     : startTransaction
//     | beginWork | commitWork | rollbackWork
//     ;

dmlStatement
    : selectStatement | insertStatement | updateStatement
    | deleteStatement
    ;

selectStatement
    : SELECT selectElements
        fromClause limitClause?
    ;

selectElements
    : (star='*' | selectElement ) (',' selectElement)*
    ;

selectElement
    : fullId (AS? uid)?
    ;

fromClause
    : FROM tableName
      (WHERE whereExpr=expression)?
    ;

expression
    : notOperator=(NOT | '!') expression                            #notExpression
    | expression logicalOperator expression                         #logicalExpression
    | predicate IS NOT? testValue=(TRUE | FALSE | MISSING)          #isExpression
    | predicate                                                     #predicateExpression
    ;

predicate
    : predicate IS nullNotnull                                      #isNullPredicate
    | left=predicate comparisonOperator right=predicate             #binaryComparisonPredicate
    | predicate NOT? BETWEEN predicate AND predicate                #betweenPredicate
    | predicate NOT? LIKE predicate                                 #likePredicate
    | expressionAtom                                                #expressionAtomPredicate
    ;

expressionAtom
    : constant                                                      #constantExpressionAtom
    | fullColumnName                                                #fullColumnNameExpressionAtom
    | '?'                                                           #placeholderExpressionAtom
    ;

insertStatement
    : INSERT
      INTO? tableName insertStatementValues
    ;

insertStatementValues
    : insertFormat=(VALUES | VALUE)
        '{' insertValuePair (',' insertValuePair)* '}'
    ;

insertValuePair
    : constant ':' (constant | '?')
    ;

updateStatement
    : singleUpdateStatement
    ;

deleteStatement
    : singleDeleteStatement
    ;   

singleDeleteStatement
    : DELETE
      FROM tableName
      WHERE expression
      (RETURNING RETURNING_ALL_OLD STAR)?
    ;

// singleUpdateStatement
//     : UPDATE tableName (AS? uid)?
//       SET updatedElement (',' updatedElement)*
//       (WHERE expression)? limitClause?
//     ;

// updatedElement
//     : fullColumnName '=' expression
//     ;

singleUpdateStatement
    : UPDATE tableName (AS? uid)?
      (SET|REMOVE) updatedElement ((SET|REMOVE) updatedElement)*
      (WHERE expression)?
      (RETURNING RETURN_VALUES STAR)?
    ;

updatedElement
    : fullColumnName '=' expression
    ;

fullColumnName
    : fullId
    ;

constant
    : stringLiteral
    | decimalLiteral
    | '-' decimalLiteral
    | booleanLiteral
    | REAL_LITERAL
    | BIT_STRING
    | NOT? nullLiteral=NULL_LITERAL
    ;

decimalLiteral
    : DECIMAL_LITERAL | ZERO_DECIMAL | ONE_DECIMAL | TWO_DECIMAL | REAL_LITERAL
    ;

booleanLiteral
    : TRUE | FALSE;

stringLiteral
    : STRING_LITERAL+
    ;

nullNotnull
    : NOT? NULL_LITERAL
    ;

comparisonOperator
    : '=' | '>' | '<' | '<' '=' | '>' '='
    | '<' '>' | '!' '=' | '<' '=' '>'
    ;

logicalOperator
    : AND | OR
    ;

limitClause
    : LIMIT limit=limitClauseAtom
    ;

limitClauseAtom
	: decimalLiteral
	;

fullId
    : uid dotted_id?
    ;

tableName
    : uid
    ;

uid
    : ID
    | SINGLE_QUOTE_ID
    | DOUBLE_QUOTE_ID
    ;

dotted_id
    : '.' ID
    | '.' SINGLE_QUOTE_ID
    | '.' DOUBLE_QUOTE_ID
    ;

fullColumnNameList
    : fullColumnName (',' fullColumnName)*
    ;