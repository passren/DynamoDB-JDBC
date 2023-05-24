// Generated from DynamoSqlParser.g4 by ANTLR 4.12.0
package org.passren.dynamodb.sql;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DynamoSqlParser}.
 */
public interface DynamoSqlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DynamoSqlParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(DynamoSqlParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoSqlParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(DynamoSqlParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoSqlParser#sqlStatements}.
	 * @param ctx the parse tree
	 */
	void enterSqlStatements(DynamoSqlParser.SqlStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoSqlParser#sqlStatements}.
	 * @param ctx the parse tree
	 */
	void exitSqlStatements(DynamoSqlParser.SqlStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoSqlParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void enterSqlStatement(DynamoSqlParser.SqlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoSqlParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void exitSqlStatement(DynamoSqlParser.SqlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoSqlParser#emptyStatement_}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement_(DynamoSqlParser.EmptyStatement_Context ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoSqlParser#emptyStatement_}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement_(DynamoSqlParser.EmptyStatement_Context ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoSqlParser#dmlStatement}.
	 * @param ctx the parse tree
	 */
	void enterDmlStatement(DynamoSqlParser.DmlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoSqlParser#dmlStatement}.
	 * @param ctx the parse tree
	 */
	void exitDmlStatement(DynamoSqlParser.DmlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoSqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStatement(DynamoSqlParser.SelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoSqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStatement(DynamoSqlParser.SelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoSqlParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void enterSelectElements(DynamoSqlParser.SelectElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoSqlParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void exitSelectElements(DynamoSqlParser.SelectElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoSqlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectElement(DynamoSqlParser.SelectElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoSqlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectElement(DynamoSqlParser.SelectElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoSqlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(DynamoSqlParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoSqlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(DynamoSqlParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isExpression}
	 * labeled alternative in {@link DynamoSqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIsExpression(DynamoSqlParser.IsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isExpression}
	 * labeled alternative in {@link DynamoSqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIsExpression(DynamoSqlParser.IsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link DynamoSqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(DynamoSqlParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link DynamoSqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(DynamoSqlParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link DynamoSqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(DynamoSqlParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link DynamoSqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(DynamoSqlParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code predicateExpression}
	 * labeled alternative in {@link DynamoSqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPredicateExpression(DynamoSqlParser.PredicateExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code predicateExpression}
	 * labeled alternative in {@link DynamoSqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPredicateExpression(DynamoSqlParser.PredicateExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionAtomPredicate}
	 * labeled alternative in {@link DynamoSqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAtomPredicate(DynamoSqlParser.ExpressionAtomPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAtomPredicate}
	 * labeled alternative in {@link DynamoSqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAtomPredicate(DynamoSqlParser.ExpressionAtomPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryComparisonPredicate}
	 * labeled alternative in {@link DynamoSqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterBinaryComparisonPredicate(DynamoSqlParser.BinaryComparisonPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryComparisonPredicate}
	 * labeled alternative in {@link DynamoSqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitBinaryComparisonPredicate(DynamoSqlParser.BinaryComparisonPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code betweenPredicate}
	 * labeled alternative in {@link DynamoSqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterBetweenPredicate(DynamoSqlParser.BetweenPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code betweenPredicate}
	 * labeled alternative in {@link DynamoSqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitBetweenPredicate(DynamoSqlParser.BetweenPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isNullPredicate}
	 * labeled alternative in {@link DynamoSqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterIsNullPredicate(DynamoSqlParser.IsNullPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isNullPredicate}
	 * labeled alternative in {@link DynamoSqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitIsNullPredicate(DynamoSqlParser.IsNullPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code likePredicate}
	 * labeled alternative in {@link DynamoSqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterLikePredicate(DynamoSqlParser.LikePredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code likePredicate}
	 * labeled alternative in {@link DynamoSqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitLikePredicate(DynamoSqlParser.LikePredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantExpressionAtom}
	 * labeled alternative in {@link DynamoSqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpressionAtom(DynamoSqlParser.ConstantExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantExpressionAtom}
	 * labeled alternative in {@link DynamoSqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpressionAtom(DynamoSqlParser.ConstantExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fullColumnNameExpressionAtom}
	 * labeled alternative in {@link DynamoSqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterFullColumnNameExpressionAtom(DynamoSqlParser.FullColumnNameExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fullColumnNameExpressionAtom}
	 * labeled alternative in {@link DynamoSqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitFullColumnNameExpressionAtom(DynamoSqlParser.FullColumnNameExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code placeholderExpressionAtom}
	 * labeled alternative in {@link DynamoSqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterPlaceholderExpressionAtom(DynamoSqlParser.PlaceholderExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code placeholderExpressionAtom}
	 * labeled alternative in {@link DynamoSqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitPlaceholderExpressionAtom(DynamoSqlParser.PlaceholderExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoSqlParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void enterInsertStatement(DynamoSqlParser.InsertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoSqlParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void exitInsertStatement(DynamoSqlParser.InsertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoSqlParser#insertStatementValues}.
	 * @param ctx the parse tree
	 */
	void enterInsertStatementValues(DynamoSqlParser.InsertStatementValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoSqlParser#insertStatementValues}.
	 * @param ctx the parse tree
	 */
	void exitInsertStatementValues(DynamoSqlParser.InsertStatementValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoSqlParser#insertValuePair}.
	 * @param ctx the parse tree
	 */
	void enterInsertValuePair(DynamoSqlParser.InsertValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoSqlParser#insertValuePair}.
	 * @param ctx the parse tree
	 */
	void exitInsertValuePair(DynamoSqlParser.InsertValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoSqlParser#updateStatement}.
	 * @param ctx the parse tree
	 */
	void enterUpdateStatement(DynamoSqlParser.UpdateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoSqlParser#updateStatement}.
	 * @param ctx the parse tree
	 */
	void exitUpdateStatement(DynamoSqlParser.UpdateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoSqlParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeleteStatement(DynamoSqlParser.DeleteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoSqlParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeleteStatement(DynamoSqlParser.DeleteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoSqlParser#singleDeleteStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleDeleteStatement(DynamoSqlParser.SingleDeleteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoSqlParser#singleDeleteStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleDeleteStatement(DynamoSqlParser.SingleDeleteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoSqlParser#singleUpdateStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleUpdateStatement(DynamoSqlParser.SingleUpdateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoSqlParser#singleUpdateStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleUpdateStatement(DynamoSqlParser.SingleUpdateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoSqlParser#updateStatementElement}.
	 * @param ctx the parse tree
	 */
	void enterUpdateStatementElement(DynamoSqlParser.UpdateStatementElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoSqlParser#updateStatementElement}.
	 * @param ctx the parse tree
	 */
	void exitUpdateStatementElement(DynamoSqlParser.UpdateStatementElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoSqlParser#updatedElement}.
	 * @param ctx the parse tree
	 */
	void enterUpdatedElement(DynamoSqlParser.UpdatedElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoSqlParser#updatedElement}.
	 * @param ctx the parse tree
	 */
	void exitUpdatedElement(DynamoSqlParser.UpdatedElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoSqlParser#removeElement}.
	 * @param ctx the parse tree
	 */
	void enterRemoveElement(DynamoSqlParser.RemoveElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoSqlParser#removeElement}.
	 * @param ctx the parse tree
	 */
	void exitRemoveElement(DynamoSqlParser.RemoveElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoSqlParser#fullColumnName}.
	 * @param ctx the parse tree
	 */
	void enterFullColumnName(DynamoSqlParser.FullColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoSqlParser#fullColumnName}.
	 * @param ctx the parse tree
	 */
	void exitFullColumnName(DynamoSqlParser.FullColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoSqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(DynamoSqlParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoSqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(DynamoSqlParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoSqlParser#valueConstant}.
	 * @param ctx the parse tree
	 */
	void enterValueConstant(DynamoSqlParser.ValueConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoSqlParser#valueConstant}.
	 * @param ctx the parse tree
	 */
	void exitValueConstant(DynamoSqlParser.ValueConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoSqlParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(DynamoSqlParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoSqlParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(DynamoSqlParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoSqlParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(DynamoSqlParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoSqlParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(DynamoSqlParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoSqlParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(DynamoSqlParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoSqlParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(DynamoSqlParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoSqlParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void enterListLiteral(DynamoSqlParser.ListLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoSqlParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void exitListLiteral(DynamoSqlParser.ListLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoSqlParser#mapLiteral}.
	 * @param ctx the parse tree
	 */
	void enterMapLiteral(DynamoSqlParser.MapLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoSqlParser#mapLiteral}.
	 * @param ctx the parse tree
	 */
	void exitMapLiteral(DynamoSqlParser.MapLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoSqlParser#valuePair}.
	 * @param ctx the parse tree
	 */
	void enterValuePair(DynamoSqlParser.ValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoSqlParser#valuePair}.
	 * @param ctx the parse tree
	 */
	void exitValuePair(DynamoSqlParser.ValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoSqlParser#numberSetLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumberSetLiteral(DynamoSqlParser.NumberSetLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoSqlParser#numberSetLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumberSetLiteral(DynamoSqlParser.NumberSetLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoSqlParser#stringSetLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringSetLiteral(DynamoSqlParser.StringSetLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoSqlParser#stringSetLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringSetLiteral(DynamoSqlParser.StringSetLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoSqlParser#nullNotnull}.
	 * @param ctx the parse tree
	 */
	void enterNullNotnull(DynamoSqlParser.NullNotnullContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoSqlParser#nullNotnull}.
	 * @param ctx the parse tree
	 */
	void exitNullNotnull(DynamoSqlParser.NullNotnullContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoSqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(DynamoSqlParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoSqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(DynamoSqlParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoSqlParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(DynamoSqlParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoSqlParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(DynamoSqlParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoSqlParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(DynamoSqlParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoSqlParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(DynamoSqlParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoSqlParser#limitClauseAtom}.
	 * @param ctx the parse tree
	 */
	void enterLimitClauseAtom(DynamoSqlParser.LimitClauseAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoSqlParser#limitClauseAtom}.
	 * @param ctx the parse tree
	 */
	void exitLimitClauseAtom(DynamoSqlParser.LimitClauseAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoSqlParser#fullId}.
	 * @param ctx the parse tree
	 */
	void enterFullId(DynamoSqlParser.FullIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoSqlParser#fullId}.
	 * @param ctx the parse tree
	 */
	void exitFullId(DynamoSqlParser.FullIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoSqlParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(DynamoSqlParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoSqlParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(DynamoSqlParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoSqlParser#uid}.
	 * @param ctx the parse tree
	 */
	void enterUid(DynamoSqlParser.UidContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoSqlParser#uid}.
	 * @param ctx the parse tree
	 */
	void exitUid(DynamoSqlParser.UidContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoSqlParser#dotted_id}.
	 * @param ctx the parse tree
	 */
	void enterDotted_id(DynamoSqlParser.Dotted_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoSqlParser#dotted_id}.
	 * @param ctx the parse tree
	 */
	void exitDotted_id(DynamoSqlParser.Dotted_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamoSqlParser#fullColumnNameList}.
	 * @param ctx the parse tree
	 */
	void enterFullColumnNameList(DynamoSqlParser.FullColumnNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamoSqlParser#fullColumnNameList}.
	 * @param ctx the parse tree
	 */
	void exitFullColumnNameList(DynamoSqlParser.FullColumnNameListContext ctx);
}