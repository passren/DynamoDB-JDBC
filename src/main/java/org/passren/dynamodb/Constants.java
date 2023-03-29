package org.passren.dynamodb;

public class Constants {
    
    /**
     * The major version of this driver.
     */
    public static final int VERSION_MAJOR = 1;

    /**
     * The minor version of this driver.
     */
    public static final int VERSION_MINOR = 0;

    /**
     * The database URL prefix of this driver.
     */
    public static final String START_URL = "jdbc:dynamodb:";

    public static final String URL_SERVER = "dynamodb.<region>.amazonaws.com";

    /**
     * The database URL format.
     */
    public static final String URL_FORMAT = String.format(
        "%s://%s[?key=value[&key=value...]]", START_URL, URL_SERVER
    );
}
