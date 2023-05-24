package org.passren.dynamodb.sql;

import org.passren.dynamodb.engine.Common.QueryType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DynamoSqlAst extends DynamoSqlParserBaseVisitor<Void> {

    private QueryType queryType = QueryType.NONE;
    private Map<Integer, String> attributes = new HashMap<>();
    private Map<String, String> values = new HashMap<>();
    private Map<String, String> updateElements =  new HashMap<>();
    private List<String> removeElements =  new ArrayList<>();
    private String table;
    private Integer columnIndex = 0;
    private int placeholders = 0;
    private static final String PLACEHOLDER_SYMBOL = "?";

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

    public Map<String, String> getUpdateElements() {
        return updateElements;
    }

    public List<String> getRemoveElements() {
        return removeElements;
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
    public Void visitUpdateStatement(DynamoSqlParser.UpdateStatementContext ctx) {
        queryType = QueryType.UPDATE;
        return visitChildren(ctx);
    }

    @Override
    public Void visitDeleteStatement(DynamoSqlParser.DeleteStatementContext ctx) {
        queryType = QueryType.DELETE;
        return visitChildren(ctx);
    }

    @Override
    public Void visitInsertValuePair(DynamoSqlParser.InsertValuePairContext ctx) {
        String key = ctx.getChild(0).getText();
        String value = ctx.getChild(2).getText();
        values.put(key, value);

        if (PLACEHOLDER_SYMBOL.equals(value)) {
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

    @Override public Void visitUpdatedElement(DynamoSqlParser.UpdatedElementContext ctx) {
        // column name
        String key = ctx.getChild(0).getText();
        // value or placeholder
        String value = ctx.getChild(2).getText();
        updateElements.put(key, value);
        if (PLACEHOLDER_SYMBOL.equals(value)) {
            placeholders++;
        }
        return visitChildren(ctx);
    }

    @Override
    public Void visitRemoveElement(DynamoSqlParser.RemoveElementContext ctx) {
        String path = ctx.getChild(0).getText();
        removeElements.add(path);
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
