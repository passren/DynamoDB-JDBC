package org.passren.dynamodb.engine;

import java.util.List;
import java.util.Map;

import org.passren.dynamodb.sql.DynamoSqlAst;

import software.amazon.awssdk.services.dynamodb.model.DynamoDbRequest;
import software.amazon.awssdk.services.dynamodb.model.ExecuteStatementRequest;

public class DmlUpdateSql extends BaseSql {
    
    private String table;
    private Map<String, String> updatedElements;
    private List<String> removedElements;

    public DmlUpdateSql(String sql, DynamoSqlAst v) {
        super(sql, v);

        table = visitor.getTable();
        updatedElements = visitor.getUpdateElements();
        removedElements = visitor.getRemoveElements();
    }

    public String getTable() {
        return table;
    }

    public Map<String, String> getUpdatedElements() {
        return updatedElements;
    }

    public List<String> getRemovedElements() {
        return removedElements;
    }

    @Override
    protected DynamoDbRequest.Builder transform() {
        return ExecuteStatementRequest.builder()
                                        .statement(originalSql);
    }
}
