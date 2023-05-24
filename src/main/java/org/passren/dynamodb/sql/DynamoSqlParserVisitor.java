// Generated from DynamoSqlParser.g4 by ANTLR 4.12.0
package org.passren.dynamodb.sql;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DynamoSqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DynamoSqlParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DynamoSqlParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(DynamoSqlParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamoSqlParser#sqlStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlStatements(DynamoSqlParser.SqlStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamoSqlParser#sqlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlStatement(DynamoSqlParser.SqlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamoSqlParser#emptyStatement_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement_(DynamoSqlParser.EmptyStatement_Context ctx);
	/**
	 * Visit a parse tree produced by {@link DynamoSqlParser#dmlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDmlStatement(DynamoSqlParser.DmlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamoSqlParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStatement(DynamoSqlParser.SelectStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamoSqlParser#selectElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectElements(DynamoSqlParser.SelectElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamoSqlParser#selectElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectElement(DynamoSqlParser.SelectElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamoSqlParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(DynamoSqlParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isExpression}
	 * labeled alternative in {@link DynamoSqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsExpression(DynamoSqlParser.IsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link DynamoSqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(DynamoSqlParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link DynamoSqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(DynamoSqlParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code predicateExpression}
	 * labeled alternative in {@link DynamoSqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateExpression(DynamoSqlParser.PredicateExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionAtomPredicate}
	 * labeled alternative in {@link DynamoSqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAtomPredicate(DynamoSqlParser.ExpressionAtomPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryComparisonPredicate}
	 * labeled alternative in {@link DynamoSqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryComparisonPredicate(DynamoSqlParser.BinaryComparisonPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code betweenPredicate}
	 * labeled alternative in {@link DynamoSqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetweenPredicate(DynamoSqlParser.BetweenPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isNullPredicate}
	 * labeled alternative in {@link DynamoSqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsNullPredicate(DynamoSqlParser.IsNullPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code likePredicate}
	 * labeled alternative in {@link DynamoSqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikePredicate(DynamoSqlParser.LikePredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantExpressionAtom}
	 * labeled alternative in {@link DynamoSqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpressionAtom(DynamoSqlParser.ConstantExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fullColumnNameExpressionAtom}
	 * labeled alternative in {@link DynamoSqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullColumnNameExpressionAtom(DynamoSqlParser.FullColumnNameExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code placeholderExpressionAtom}
	 * labeled alternative in {@link DynamoSqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlaceholderExpressionAtom(DynamoSqlParser.PlaceholderExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamoSqlParser#insertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertStatement(DynamoSqlParser.InsertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamoSqlParser#insertStatementValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertStatementValues(DynamoSqlParser.InsertStatementValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamoSqlParser#insertValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertValuePair(DynamoSqlParser.InsertValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamoSqlParser#updateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateStatement(DynamoSqlParser.UpdateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamoSqlParser#deleteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStatement(DynamoSqlParser.DeleteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamoSqlParser#singleDeleteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleDeleteStatement(DynamoSqlParser.SingleDeleteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamoSqlParser#singleUpdateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleUpdateStatement(DynamoSqlParser.SingleUpdateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamoSqlParser#updateStatementElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateStatementElement(DynamoSqlParser.UpdateStatementElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamoSqlParser#updatedElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdatedElement(DynamoSqlParser.UpdatedElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamoSqlParser#removeElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemoveElement(DynamoSqlParser.RemoveElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamoSqlParser#fullColumnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullColumnName(DynamoSqlParser.FullColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamoSqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(DynamoSqlParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamoSqlParser#valueConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueConstant(DynamoSqlParser.ValueConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamoSqlParser#decimalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(DynamoSqlParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamoSqlParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(DynamoSqlParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamoSqlParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(DynamoSqlParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamoSqlParser#listLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListLiteral(DynamoSqlParser.ListLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamoSqlParser#mapLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapLiteral(DynamoSqlParser.MapLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamoSqlParser#valuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuePair(DynamoSqlParser.ValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamoSqlParser#numberSetLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberSetLiteral(DynamoSqlParser.NumberSetLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamoSqlParser#stringSetLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringSetLiteral(DynamoSqlParser.StringSetLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamoSqlParser#nullNotnull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullNotnull(DynamoSqlParser.NullNotnullContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamoSqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(DynamoSqlParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamoSqlParser#logicalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperator(DynamoSqlParser.LogicalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamoSqlParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(DynamoSqlParser.LimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamoSqlParser#limitClauseAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClauseAtom(DynamoSqlParser.LimitClauseAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamoSqlParser#fullId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullId(DynamoSqlParser.FullIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamoSqlParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(DynamoSqlParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamoSqlParser#uid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUid(DynamoSqlParser.UidContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamoSqlParser#dotted_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_id(DynamoSqlParser.Dotted_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamoSqlParser#fullColumnNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullColumnNameList(DynamoSqlParser.FullColumnNameListContext ctx);
}