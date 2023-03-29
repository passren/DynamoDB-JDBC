package org.passren.dynamodb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * JDBC URL for AWS DynamoDB:
 * jdbc:dynamodb://dynamodb.{region}.amazonaws.com?
 *      aws_access_key_id={aws_access_key_id}&aws_secret_access_key={aws_secret_access_key}&...
 */
public class Driver implements java.sql.Driver {

    private static final Driver INSTANCE = new Driver();

    private static boolean registered;

    static {
        load();
    }

    @Override
    public Connection connect(String url, Properties info) throws SQLException {
        if (url == null) {
            throw new JdbcException();
        } else if (url.startsWith(Constants.START_URL)) {
            return new JdbcConnection(url, info);
        } else {
            return null;
        }
    }

    @Override
    public boolean acceptsURL(String url) throws SQLException {
        if (url == null) {
            throw new JdbcException();
        } else if (url.startsWith(Constants.START_URL)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Get the list of supported properties.
     * This method should not be called by an application.
     *
     * @param url the database URL
     * @param info the connection properties
     * @return a zero length array
     */
    @Override
    public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
        return new DriverPropertyInfo[0];
    }

    @Override
    public int getMajorVersion() {
        return Constants.VERSION_MAJOR;
    }

    @Override
    public int getMinorVersion() {
        return Constants.VERSION_MINOR;
    }

    /**
     * This driver is not fully compliant to the JDBC specification.
     * This method should not be called by an application.
     *
     * @return false
     */
    @Override
    public boolean jdbcCompliant() {
        return false;
    }

    /**
     * [Not supported]
     */
    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException("Not supported");
    }

    /**
     * INTERNAL
     * @return instance of the driver registered with the DriverManager
     */
    public static synchronized Driver load() {
        try {
            if (!registered) {
                registered = true;
                DriverManager.registerDriver(INSTANCE);
            }
        } catch (SQLException e) {
            // DbException.traceThrowable(e);
        }
        return INSTANCE;
    }

    /**
     * INTERNAL
     */
    public static synchronized void unload() {
        try {
            if (registered) {
                registered = false;
                DriverManager.deregisterDriver(INSTANCE);
            }
        } catch (SQLException e) {
            // DbException.traceThrowable(e);
        }
    }

}