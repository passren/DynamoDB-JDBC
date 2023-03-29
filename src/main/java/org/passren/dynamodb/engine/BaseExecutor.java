package org.passren.dynamodb.engine;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.passren.dynamodb.JdbcConnection;
import org.passren.dynamodb.JdbcStatement;

import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;
import software.amazon.awssdk.services.dynamodb.model.ExecuteStatementRequest;

public abstract class BaseExecutor implements Executor {
    
    protected JdbcStatement statement;
    protected DynamoDbClient ddbClient;
    protected BaseSql sql;
    protected List<AttributeValue> parameters;
    protected ExecuteStatementRequest.Builder builder;
    protected LinkedList<Map<String, AttributeValue>> responseData = new LinkedList<>();
    protected String nextToken;
    
    public BaseExecutor(JdbcStatement stmt, BaseSql s) throws SQLException {
        this(stmt, s, null);
    }

    public BaseExecutor(JdbcStatement stmt, BaseSql s, List<AttributeValue> params) throws SQLException {
        statement = stmt;
        ddbClient = ((JdbcConnection)stmt.getConnection()).getClient();
        sql = s;
        builder = (ExecuteStatementRequest.Builder)sql.getRequestBuilder();
        parameters = params;
    }

    public LinkedList<Map<String, AttributeValue>> getResponseData() {
        return responseData;
    }

    public String getNextToken() {
        return nextToken;
    }

    @Override
    public void close() {
        responseData.clear();
        responseData = null;
        nextToken = null;
    }
}
