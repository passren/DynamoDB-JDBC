package org.passren.dynamodb;

import org.junit.jupiter.api.DisplayName;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@SelectClasses({DmlTests.class})
@DisplayName("Test Suite for DynamoDB JDBC Project")
@Suite
public class DynamoDBJdbcTestSuite {
    
}
