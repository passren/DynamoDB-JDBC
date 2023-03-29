package org.passren.dynamodb;

import software.amazon.awssdk.services.dynamodb.model.DynamoDbException;

public class DbException extends DynamoDbException {

    protected DbException(String message) {
        super(DynamoDbException.builder().message(message));
    }

    protected DbException(Builder builder) {
        super(builder);
    }
    
}
