package org.passren.dynamodb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.AttributeDefinition;
import software.amazon.awssdk.services.dynamodb.model.BillingMode;
import software.amazon.awssdk.services.dynamodb.model.CreateTableRequest;
import software.amazon.awssdk.services.dynamodb.model.DeleteTableRequest;
import software.amazon.awssdk.services.dynamodb.model.KeySchemaElement;
import software.amazon.awssdk.services.dynamodb.model.KeyType;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTests {

    protected static final String URL = "jdbc:dynamodb://dynamodb.cn-north-1.amazonaws.com?"
                                        + "aws_access_key_id=dummy_key_id"
                                        + "&aws_secret_access_key=dummy_secret_key"
                                        + "&endpoint_url=http://localhost:8000";
    
    protected Connection conn;
    private String[] testTables = {"ddbjdbc01", "ddbjdbc02"};

    @BeforeAll
    void setup() throws SQLException, ClassNotFoundException {
        Class.forName("org.passren.dynamodb.Driver");
        conn = DriverManager.getConnection(URL);
        initTestTables();
    }

    @AfterAll
    void teardown() throws SQLException {
        deleteTestTables();
        conn.close();
    }

    void initTestTables() {
        Arrays.asList(testTables).forEach(tableName -> {
            createTestTable(tableName);
        });;
    }

    void deleteTestTables() {
        Arrays.asList(testTables).forEach(tableName -> {
            deleteTestTable(tableName);
        });;
    }

    void createTestTable(String tableName) {
        JdbcConnection jdbcConn = (JdbcConnection)conn;
        DynamoDbClient client = jdbcConn.getClient();

        AttributeDefinition[] attrs = {
            AttributeDefinition.builder()
                .attributeName("pk")
                .attributeType("S").build(),
            AttributeDefinition.builder()
                .attributeName("sk")
                .attributeType("N").build(),
        };

        KeySchemaElement[] keySchemas = {
            KeySchemaElement.builder()
            .attributeName("pk")
            .keyType(KeyType.HASH).build(),
            KeySchemaElement.builder()
            .attributeName("sk")
            .keyType(KeyType.RANGE).build()
        };

        client.createTable(
            CreateTableRequest.builder()
                .tableName(tableName)
                .attributeDefinitions(attrs)
                .keySchema(keySchemas)
                .billingMode(BillingMode.PAY_PER_REQUEST)
                .build());
    }

    void deleteTestTable(String tableName) {
        JdbcConnection jdbcConn = (JdbcConnection)conn;
        DynamoDbClient client = jdbcConn.getClient();

        client.deleteTable(
            DeleteTableRequest.builder()
                .tableName(tableName).build()
        );
    }

}
