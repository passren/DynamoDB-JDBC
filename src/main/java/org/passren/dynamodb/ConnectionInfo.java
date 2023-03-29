package org.passren.dynamodb;

import java.util.Arrays;
import java.util.Properties;

import org.passren.dynamodb.util.StringUtils;

public class ConnectionInfo implements Cloneable {
    
    public static final String[] ClientPassingArgs = {
        "AWS_ACCESS_KEY_ID",
        "AWS_SECRET_ACCESS_KEY",
        "AWS_SESSION_TOKEN",
        "CONFIG",
        "API_VERSION",
        "USE_SSL",
        "VERIFY",
        "ENDPOINT_URL",
    };

    private String url;
    private String region;
    private Properties prop = new Properties();

    public ConnectionInfo(String u, Properties info) throws JdbcException {
        url = u;
        readRegionFromURL();
        readSettingsFromURL();
    }

    private void readRegionFromURL() {
        int idxServer = url.indexOf("//");
        int idxSetting = url.indexOf("?");

        if (idxServer >= 0) {
            String serverName;
            if (idxSetting >= 0) {
                serverName = url.substring(idxServer + 2, idxSetting);
            } else {
                serverName = url.substring(idxServer + 2);
            }

            String[] list = StringUtils.arraySplit(serverName, '.', false);
            if (list.length >= 2) {
                region = list[1];
            }
        }
    }

    private void readSettingsFromURL() throws JdbcException {
        int idx = url.indexOf("?");
        if (idx >= 0 && idx != url.length()) {
            String settings = url.substring(idx + 1);
            String[] list = StringUtils.arraySplit(settings, '&', false);
            for (String setting : list) {
                if (setting.isEmpty()) {
                    continue;
                }
                int equal = setting.indexOf('=');
                if (equal < 0) {
                    throw new JdbcException();
                }
                String value = setting.substring(equal + 1);
                String key = setting.substring(0, equal);
                key = key.toUpperCase();
                
                if (Arrays.asList(ClientPassingArgs).contains(key)) {
                    prop.setProperty(key, value);
                }
            }
        }
    }

    public String getRegion() {
        return region;
    }

    /**
     * Get the value of the given property.
     *
     * @param key the property key
     * @return the value as a String
     */
    String getProperty(String key) {
        Object value = prop.get(key);
        if (!(value instanceof String)) {
            return null;
        }
        return value.toString();
    }
    
    /**
     * Get the value of the given property.
     *
     * @param key the property key
     * @param defaultValue the default value
     * @return the value as a String
     */
    public String getProperty(String key, String defaultValue) {
        String s = getProperty(key);
        return s == null ? defaultValue : s;
    }

    /**
     * Overwrite a property.
     *
     * @param key the property name
     * @param value the value
     */
    public void setProperty(String key, String value) {
        // value is null if the value is an object
        if (value != null) {
            prop.setProperty(key, value);
        }
    }
}
