package org.passren.dynamodb;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.NClob;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLXML;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.passren.dynamodb.engine.BaseSql;
import org.passren.dynamodb.engine.DmlExecutor;
import org.passren.dynamodb.engine.SqlFactory;
import org.passren.dynamodb.engine.Types;
import org.passren.dynamodb.util.StringUtils;

import software.amazon.awssdk.core.SdkBytes;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;

public class JdbcPreparedStatement extends JdbcStatement implements PreparedStatement {

    List<AttributeValue> parameters;
    BaseSql sql;

    JdbcPreparedStatement(JdbcConnection conn, String s, int resultSetType, int resultSetConcurrency) {
        super(conn, resultSetType, resultSetConcurrency);
        sql = SqlFactory.create(s);
        AttributeValue[] initParams = new AttributeValue[sql.getPlaceholders()];
        Arrays.fill(initParams, null);
        parameters = Arrays.asList(initParams);
    }

    @Override
    public ResultSet executeQuery() throws SQLException {
        return new JdbcResultSet(this, sql, parameters);
    }

    @Override
    public int executeUpdate() throws SQLException {
        executor = new DmlExecutor(this, sql, parameters);
        LinkedList<Map<String, AttributeValue>> responseData = executor.getResponseData();
        return responseData == null ? 0: responseData.size();
    }

    @Override
    public boolean execute() throws SQLException {
        executor = new DmlExecutor(this, sql, parameters);
        return true;
    }

    @Override
    public void addBatch() throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    private void setParameter(int parameterIndex, AttributeValue value) {
        parameterIndex--;
        if (parameterIndex < 0 || parameterIndex >= parameters.size()) {
            throw new DbException("Invalid parameter index");
        }

        parameters.set(parameterIndex, value);        
    }

    @Override
    public void setNull(int parameterIndex, int sqlType) throws SQLException {
        boolean isNull = sqlType == Types.NUL;
        AttributeValue av = AttributeValue.builder().nul(isNull).build();
        setParameter(parameterIndex, av);
    }

    @Override
    public void setBoolean(int parameterIndex, boolean x) throws SQLException {
        AttributeValue av = AttributeValue.builder().bool(x).build();
        setParameter(parameterIndex, av);
    }

    @Override
    public void setByte(int parameterIndex, byte x) throws SQLException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setShort(int parameterIndex, short x) throws SQLException {
        AttributeValue av = AttributeValue.builder().n(String.valueOf(x)).build();
        setParameter(parameterIndex, av);
    }

    @Override
    public void setInt(int parameterIndex, int x) throws SQLException {
        AttributeValue av = AttributeValue.builder().n(String.valueOf(x)).build();
        setParameter(parameterIndex, av);
    }

    @Override
    public void setLong(int parameterIndex, long x) throws SQLException {
        AttributeValue av = AttributeValue.builder().n(String.valueOf(x)).build();
        setParameter(parameterIndex, av);
    }

    @Override
    public void setFloat(int parameterIndex, float x) throws SQLException {
        AttributeValue av = AttributeValue.builder().n(String.valueOf(x)).build();
        setParameter(parameterIndex, av);
    }

    @Override
    public void setDouble(int parameterIndex, double x) throws SQLException {
        AttributeValue av = AttributeValue.builder().n(String.valueOf(x)).build();
        setParameter(parameterIndex, av);
    }

    @Override
    public void setBigDecimal(int parameterIndex, BigDecimal x) throws SQLException {
        AttributeValue av = AttributeValue.builder().n(String.valueOf(x)).build();
        setParameter(parameterIndex, av);
    }

    @Override
    public void setString(int parameterIndex, String x) throws SQLException {
        AttributeValue av = AttributeValue.builder().s(x).build();
        setParameter(parameterIndex, av);
    }

    @Override
    public void setBytes(int parameterIndex, byte[] x) throws SQLException {
        AttributeValue av = AttributeValue.builder().b(SdkBytes.fromByteArray(x)).build();
        setParameter(parameterIndex, av);
    }

    @Override
    public void setDate(int parameterIndex, Date x) throws SQLException {
        AttributeValue av = AttributeValue.builder().s(
            StringUtils.getISODateString(x)
        ).build();
        setParameter(parameterIndex, av);
    }

    @Override
    public void setTime(int parameterIndex, Time x) throws SQLException {
        AttributeValue av = AttributeValue.builder().s(
            StringUtils.getISOTimeString(x)
        ).build();
        setParameter(parameterIndex, av);
    }

    @Override
    public void setTimestamp(int parameterIndex, Timestamp x) throws SQLException {
        AttributeValue av = AttributeValue.builder().s(String.valueOf(x.getTime())).build();
        setParameter(parameterIndex, av);
    }

    @Override
    public void setAsciiStream(int parameterIndex, InputStream x, int length) throws SQLException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setUnicodeStream(int parameterIndex, InputStream x, int length) throws SQLException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setBinaryStream(int parameterIndex, InputStream x, int length) throws SQLException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clearParameters() throws SQLException {
        parameters.clear();
    }

    @Override
    @SuppressWarnings("unchecked") 
    public void setObject(int parameterIndex, Object x, int targetSqlType) throws SQLException {
        switch (targetSqlType) {
            case Types.B:
                setBytes(parameterIndex, (byte[])x);
            case Types.BOOL:
                setBoolean(parameterIndex, (boolean)x);
            case Types.BS:
                setBytesSet(parameterIndex, (Set<byte[]>)x);
            case Types.L:
                setList(parameterIndex, (List<AttributeValue>)x);
            case Types.M:
                setMap(parameterIndex, (Map<String, AttributeValue>)x);
            case Types.N:
                setNumber(parameterIndex, (String)x);
            case Types.NS:
                setNumberSet(parameterIndex, (Set<String>)x);
            case Types.NUL:
                setNull(parameterIndex, targetSqlType);
            case Types.S:
                setString(parameterIndex, (String)x);
            case Types.SS:
                setStringSet(parameterIndex, (Set<String>)x);
        }
    }

    @Override
    public void setObject(int parameterIndex, Object x) throws SQLException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setCharacterStream(int parameterIndex, Reader reader, int length) throws SQLException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setRef(int parameterIndex, Ref x) throws SQLException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setBlob(int parameterIndex, Blob x) throws SQLException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setClob(int parameterIndex, Clob x) throws SQLException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setArray(int parameterIndex, Array x) throws SQLException {
        throw new UnsupportedOperationException();
    }

    public void setNumber(int parameterIndex, String n) throws SQLException {
        AttributeValue av = AttributeValue.builder().n(n).build();
        setParameter(parameterIndex, av);
    }

    public void setNumberSet(int parameterIndex, Set<String> ns) throws SQLException {
        AttributeValue av = AttributeValue.builder().ns(ns).build();
        setParameter(parameterIndex, av);
    }

    public void setStringSet(int parameterIndex, Set<String> ss) throws SQLException {
        AttributeValue av = AttributeValue.builder().ss(ss).build();
        setParameter(parameterIndex, av);
    }

    public void setBytesSet(int parameterIndex, Set<byte[]> bs) throws SQLException {
        AttributeValue av = AttributeValue.builder().bs(
            bs.stream().map(SdkBytes::fromByteArray).toList()
        ).build();
        setParameter(parameterIndex, av);
    }

    public void setList(int parameterIndex, List<AttributeValue> l) throws SQLException {
        AttributeValue av = AttributeValue.builder().l(l).build();
        setParameter(parameterIndex, av);
    }

    public void setMap(int parameterIndex, Map<String, AttributeValue> m) throws SQLException {
        AttributeValue av = AttributeValue.builder().m(m).build();
        setParameter(parameterIndex, av);
    }

    @Override
    public ResultSetMetaData getMetaData() throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void setDate(int parameterIndex, Date x, Calendar cal) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void setTime(int parameterIndex, Time x, Calendar cal) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void setTimestamp(int parameterIndex, Timestamp x, Calendar cal) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void setNull(int parameterIndex, int sqlType, String typeName) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void setURL(int parameterIndex, URL x) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public ParameterMetaData getParameterMetaData() throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void setRowId(int parameterIndex, RowId x) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void setNString(int parameterIndex, String value) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void setNCharacterStream(int parameterIndex, Reader value, long length) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void setNClob(int parameterIndex, NClob value) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void setClob(int parameterIndex, Reader reader, long length) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void setBlob(int parameterIndex, InputStream inputStream, long length) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void setNClob(int parameterIndex, Reader reader, long length) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void setSQLXML(int parameterIndex, SQLXML xmlObject) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void setObject(int parameterIndex, Object x, int targetSqlType, int scaleOrLength) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void setAsciiStream(int parameterIndex, InputStream x, long length) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void setBinaryStream(int parameterIndex, InputStream x, long length) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void setCharacterStream(int parameterIndex, Reader reader, long length) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void setAsciiStream(int parameterIndex, InputStream x) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void setBinaryStream(int parameterIndex, InputStream x) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void setCharacterStream(int parameterIndex, Reader reader) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void setNCharacterStream(int parameterIndex, Reader value) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void setClob(int parameterIndex, Reader reader) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void setBlob(int parameterIndex, InputStream inputStream) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }

    @Override
    public void setNClob(int parameterIndex, Reader reader) throws SQLException {
        throw new UnsupportedOperationException("Not Supported");
    }
    
}
