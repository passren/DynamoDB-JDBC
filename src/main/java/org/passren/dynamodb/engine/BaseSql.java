package org.passren.dynamodb.engine;

import org.passren.dynamodb.sql.DynamoSqlAst;
import org.passren.dynamodb.engine.Common.QueryType;

import software.amazon.awssdk.services.dynamodb.model.DynamoDbRequest;

public abstract class BaseSql {

    protected DynamoSqlAst visitor;
    protected String originalSql;
    protected QueryType queryType;
    protected DynamoDbRequest.Builder requestBuilder;
    protected int placeholders = 0;

    public BaseSql(String sql, DynamoSqlAst v) {
        originalSql = sql;
        visitor = v;
        placeholders = v.getPlaceholders();

        requestBuilder = transform();
    }
    
    protected abstract DynamoDbRequest.Builder transform();

    public DynamoDbRequest.Builder getRequestBuilder() {
        return requestBuilder;
    }

    public String getOriginalSql() {
        return originalSql;
    }

    public QueryType getQueryType() {
        return visitor.getQueryType();
    }

    public int getPlaceholders() {
        return placeholders;
    }
}
