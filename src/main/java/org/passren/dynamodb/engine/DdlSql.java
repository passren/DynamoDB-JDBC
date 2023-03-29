package org.passren.dynamodb.engine;

import org.passren.dynamodb.sql.DynamoSqlAst;

import software.amazon.awssdk.services.dynamodb.model.DynamoDbRequest;

public class DdlSql extends BaseSql {

    public DdlSql(String sql, DynamoSqlAst v) {
        super(sql, v);
    }

    @Override
    protected DynamoDbRequest.Builder transform() {
        throw new UnsupportedOperationException();
    }

}
