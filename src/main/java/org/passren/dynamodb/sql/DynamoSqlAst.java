package org.passren.dynamodb.sql;

import java.util.HashMap;
import java.util.Map;

import org.passren.dynamodb.engine.Common.QueryType;

public class DynamoSqlAst extends DynamoSqlParserBaseVisitor<Void> {

    private QueryType queryType = QueryType.NONE;
    private Map<Integer, String> attributes = new HashMap<Integer, String>();
    private Map<String, String> values = new HashMap<String, String>();
    private String table;
    private Integer columnIndex = 0;
    private int placeholders = 0;

    public QueryType getQueryType() {
        return queryType;
    }

    public Map<Integer, String> getAttributes() {
        return attributes;
    }

    public String getTable() {
        return table;
    }

    public Map<String, String> getValues() {
        return values;
    }

    public int getPlaceholders() {
        return placeholders;
    }

    @Override
    public Void visitSelectStatement(DynamoSqlParser.SelectStatementContext ctx) {
        queryType = QueryType.SELECT;
        return visitChildren(ctx);
    }

    @Override
    public Void visitInsertStatement(DynamoSqlParser.InsertStatementContext ctx) {
        queryType = QueryType.INSERT;
        return visitChildren(ctx);
    }

    @Override
    public Void visitInsertValuePair(DynamoSqlParser.InsertValuePairContext ctx) {
        String key = ctx.getChild(0).getText();
        String value = ctx.getChild(2).getText();
        values.put(key, value);

        if ("?".equals(value)) {
            placeholders++;
        }

        return visitChildren(ctx);
    }

    @Override
    public Void visitSelectElements(DynamoSqlParser.SelectElementsContext ctx) {
        if ("*".equals(ctx.getText())) {
            attributes.put(columnIndex, ctx.getText());
        }
        return visitChildren(ctx);
    }

    @Override
    public Void visitSelectElement(DynamoSqlParser.SelectElementContext ctx) {
        attributes.put(columnIndex, ctx.getText());
        columnIndex = columnIndex + 1;
        return visitChildren(ctx);
    }

    @Override
    public Void visitTableName(DynamoSqlParser.TableNameContext ctx) {
        table = ctx.getText();
        return visitChildren(ctx);
    }

    @Override
    public Void visitPlaceholderExpressionAtom(DynamoSqlParser.PlaceholderExpressionAtomContext ctx) {
        placeholders++;
        return visitChildren(ctx);
    }
	
}
