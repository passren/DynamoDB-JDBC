package org.passren.dynamodb.engine;

import java.util.Map;

import org.passren.dynamodb.sql.DynamoSqlAst;

import software.amazon.awssdk.services.dynamodb.model.DynamoDbRequest;
import software.amazon.awssdk.services.dynamodb.model.ExecuteStatementRequest;

public class DmlDeleteSql extends BaseSql {
    
    private String table;

    public DmlDeleteSql(String sql, DynamoSqlAst v) {
        super(sql, v);

        table = visitor.getTable();
    }

    public String getTable() {
        return table;
    }

    @Override
    protected DynamoDbRequest.Builder transform() {
        return ExecuteStatementRequest.builder()
                                        .statement(originalSql);
    }
}
