package org.passren.dynamodb;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.Map;

import org.passren.dynamodb.engine.BaseSql;
import org.passren.dynamodb.engine.DmlExecutor;
import org.passren.dynamodb.engine.Executor;
import org.passren.dynamodb.engine.SqlFactory;

import software.amazon.awssdk.services.dynamodb.model.AttributeValue;

public class JdbcStatement implements Statement {

    protected JdbcConnection conn;
    protected Executor executor;
    protected final int resultSetType;
    protected final int resultSetConcurrency;

    JdbcStatement(JdbcConnection conn, int resultSetType, int resultSetConcurrency) {
        this.conn = conn;
        this.resultSetType = resultSetType;
        this.resultSetConcurrency = resultSetConcurrency;
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
    public ResultSet executeQuery(String sql) throws SQLException {
        BaseSql stmt = SqlFactory.create(sql);
        return new JdbcResultSet(this, stmt);
    }

    @Override
    public boolean execute(String sql) throws SQLException {
        BaseSql stmt = SqlFactory.create(sql);
        executor = new DmlExecutor(this, stmt);
        return true;
    }

    @Override
    public int executeUpdate(String sql) throws SQLException {
        BaseSql stmt = SqlFactory.create(sql);
        executor = new DmlExecutor(this, stmt);
        LinkedList<Map<String, AttributeValue>> responseData = executor.getResponseData();
        return responseData == null ? 0: responseData.size();
    }

    @Override
    public void close() throws SQLException {
        if (executor != null) {
            executor.close();
        }
    }

    @Override
    public int getMaxFieldSize() throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void setMaxFieldSize(int max) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public int getMaxRows() throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void setMaxRows(int max) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void setEscapeProcessing(boolean enable) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public int getQueryTimeout() throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void setQueryTimeout(int seconds) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void cancel() throws SQLException {
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
    public void setCursorName(String name) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public ResultSet getResultSet() throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public int getUpdateCount() throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public boolean getMoreResults() throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void setFetchDirection(int direction) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public int getFetchDirection() throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void setFetchSize(int rows) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public int getFetchSize() throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public int getResultSetConcurrency() throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public int getResultSetType() throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void addBatch(String sql) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void clearBatch() throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public int[] executeBatch() throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public Connection getConnection() throws SQLException {
        return conn;
    }

    @Override
    public boolean getMoreResults(int current) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public ResultSet getGeneratedKeys() throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public int executeUpdate(String sql, int autoGeneratedKeys) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public int executeUpdate(String sql, int[] columnIndexes) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public int executeUpdate(String sql, String[] columnNames) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public boolean execute(String sql, int autoGeneratedKeys) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public boolean execute(String sql, int[] columnIndexes) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public boolean execute(String sql, String[] columnNames) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public int getResultSetHoldability() throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public boolean isClosed() throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void setPoolable(boolean poolable) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public boolean isPoolable() throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void closeOnCompletion() throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public boolean isCloseOnCompletion() throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }
    
}
