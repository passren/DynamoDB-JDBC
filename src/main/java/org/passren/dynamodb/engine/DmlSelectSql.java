package org.passren.dynamodb.engine;

import java.util.Map;

import org.passren.dynamodb.sql.DynamoSqlAst;

import software.amazon.awssdk.services.dynamodb.model.DynamoDbRequest;
import software.amazon.awssdk.services.dynamodb.model.ExecuteStatementRequest;

public class DmlSelectSql extends BaseSql {

    private String table;
    private Map<Integer, String> columns;
    private Integer limit;

    public String getTable() {
        return table;
    }

    public Map<Integer, String> getColumns() {
        return columns;
    }

    public Integer getLimit() {
        return limit;
    }

    public DmlSelectSql(String sql, DynamoSqlAst v) {
        super(sql, v);
        table = visitor.getTable();
        columns = visitor.getAttributes();
    }

    protected DynamoDbRequest.Builder transform() {
        return ExecuteStatementRequest.builder()
                                        .statement(originalSql);
    }
}
