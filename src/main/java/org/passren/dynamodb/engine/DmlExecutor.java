package org.passren.dynamodb.engine;

import java.sql.SQLException;
import java.util.List;

import org.passren.dynamodb.JdbcStatement;

import software.amazon.awssdk.services.dynamodb.model.AttributeValue;
import software.amazon.awssdk.services.dynamodb.model.ExecuteStatementResponse;


public class DmlExecutor extends BaseExecutor {

    public DmlExecutor(JdbcStatement stmt, BaseSql s) throws SQLException {
        this(stmt, s, null);
    }

    public DmlExecutor(JdbcStatement stmt, BaseSql s, List<AttributeValue> params) throws SQLException {
        super(stmt, s, params);

        execute();
    }

    @Override
    public void execute() {
        switch (sql.getQueryType()) {
            case SELECT:
                Integer limit = ((DmlSelectSql)sql).getLimit();
                if (limit != null) {
                    builder = builder.limit(limit);
                }
            case INSERT:
                break;
            case UPDATE:
                break;
            case DELETE:
                break;
            default:
                break;
        }

        if (nextToken != null) {
            builder = builder.nextToken(nextToken);
        }

        if (parameters != null) {
            builder = builder.parameters(parameters);
        }
    
        ExecuteStatementResponse response = ddbClient.executeStatement(builder.build());
        responseData.addAll(response.items());
        nextToken = response.nextToken();
    }
}
