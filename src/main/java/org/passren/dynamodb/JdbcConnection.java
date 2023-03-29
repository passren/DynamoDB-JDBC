package org.passren.dynamodb;

import java.net.URI;
import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.DynamoDbClientBuilder;

public class JdbcConnection implements Connection {

    private DynamoDbClient ddbClient;
    private boolean isClosed = true;

    /**
     * INTERNAL
     * @param url of this connection
     * @param info of this connection
     * @throws SQLException on failure
     */
    public JdbcConnection(String url, Properties info) throws SQLException {
        ConnectionInfo ci = new ConnectionInfo(url, info);

        AwsBasicCredentials awsCreds = AwsBasicCredentials.create(
            ci.getProperty("AWS_ACCESS_KEY_ID"),
            ci.getProperty("AWS_SECRET_ACCESS_KEY")
        );

        DynamoDbClientBuilder clientBuilder = DynamoDbClient.builder();
        clientBuilder.region(Region.of(ci.getRegion()));
        clientBuilder.credentialsProvider(StaticCredentialsProvider.create(awsCreds));

        String endpoint = ci.getProperty("ENDPOINT_URL");
        if (endpoint != null) {
            clientBuilder.endpointOverride(URI.create(endpoint));
        }
        ddbClient = clientBuilder.build();
        isClosed = true;
    }

    /**
     * INTERNAL
     * @return session
     */
    public DynamoDbClient getClient() {
        return ddbClient;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public Statement createStatement() throws SQLException {
        return new JdbcStatement(this, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
    }

    @Override
    public PreparedStatement prepareStatement(String sql) throws SQLException {
        return new JdbcPreparedStatement(this, sql, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
    }

    @Override
    public CallableStatement prepareCall(String sql) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public String nativeSQL(String sql) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void setAutoCommit(boolean autoCommit) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public boolean getAutoCommit() throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void commit() throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void rollback() throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void close() throws SQLException {
        if (!isClosed && ddbClient != null) {
            ddbClient.close();
            isClosed = true;
        };
    }

    @Override
    public boolean isClosed() throws SQLException {
        return isClosed;
    }

    @Override
    public DatabaseMetaData getMetaData() throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void setReadOnly(boolean readOnly) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public boolean isReadOnly() throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void setCatalog(String catalog) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public String getCatalog() throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void setTransactionIsolation(int level) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public int getTransactionIsolation() throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public SQLWarning getWarnings() throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void clearWarnings() throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public Statement createStatement(int resultSetType, int resultSetConcurrency) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency)
            throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public Map<String, Class<?>> getTypeMap() throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void setTypeMap(Map<String, Class<?>> map) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void setHoldability(int holdability) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public int getHoldability() throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public Savepoint setSavepoint() throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public Savepoint setSavepoint(String name) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void rollback(Savepoint savepoint) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void releaseSavepoint(Savepoint savepoint) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public Statement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability)
            throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency,
            int resultSetHoldability) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency,
            int resultSetHoldability) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int[] columnIndexes) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public PreparedStatement prepareStatement(String sql, String[] columnNames) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public Clob createClob() throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public Blob createBlob() throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public NClob createNClob() throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public SQLXML createSQLXML() throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public boolean isValid(int timeout) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void setClientInfo(String name, String value) throws SQLClientInfoException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void setClientInfo(Properties properties) throws SQLClientInfoException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public String getClientInfo(String name) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public Properties getClientInfo() throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public Array createArrayOf(String typeName, Object[] elements) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public Struct createStruct(String typeName, Object[] attributes) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void setSchema(String schema) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public String getSchema() throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void abort(Executor executor) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void setNetworkTimeout(Executor executor, int milliseconds) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public int getNetworkTimeout() throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }
    
}
