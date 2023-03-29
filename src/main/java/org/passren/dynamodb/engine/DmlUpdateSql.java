package org.passren.dynamodb.engine;

import java.util.Map;

import org.passren.dynamodb.sql.DynamoSqlAst;

import software.amazon.awssdk.services.dynamodb.model.DynamoDbRequest;
import software.amazon.awssdk.services.dynamodb.model.ExecuteStatementRequest;

public class DmlUpdateSql extends BaseSql {
    
    private String table;
    private Map<String, String> values;

    public DmlUpdateSql(String sql, DynamoSqlAst v) {
        super(sql, v);

        table = visitor.getTable();
        values = visitor.getValues();
    }

    public String getTable() {
        return table;
    }

    public Map<String, String> getValues() {
        return values;
    }

    @Override
    protected DynamoDbRequest.Builder transform() {
        return ExecuteStatementRequest.builder()
                                        .statement(originalSql);
    }
}
