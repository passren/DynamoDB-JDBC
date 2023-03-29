package org.passren.dynamodb.util;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

/**
 * A few String utility functions.
 */
public class StringUtils {

    /**
     * Split a string into an array of strings using the given separator. A null
     * string will result in a null array, and an empty string in a zero element
     * array.
     *
     * @param s the string to split
     * @param separatorChar the separator character
     * @param trim whether each element should be trimmed
     * @return the array list
     */
    public static String[] arraySplit(String s, char separatorChar, boolean trim) {
        if (s == null) {
            return null;
        }
        int length = s.length();
        if (length == 0) {
            return new String[0];
        }
        ArrayList<String> list = new ArrayList<>();
        StringBuilder buff = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c == separatorChar) {
                String e = buff.toString();
                list.add(trim ? e.trim() : e);
                buff.setLength(0);
            } else if (c == '\\' && i < length - 1) {
                buff.append(s.charAt(++i));
            } else {
                buff.append(c);
            }
        }
        String e = buff.toString();
        list.add(trim ? e.trim() : e);
        return list.toArray(new String[0]);
    }

    public static Date getISODate(String datetime) {
        return Date.from(Instant.parse(datetime));
    }

    public static String getISODateString(Date date) {
        return StringUtils.getISODateString(date, TimeZone.getDefault());
    }
    
    public static String getISODateString(java.sql.Date date) {
        return StringUtils.getISODateString(date, TimeZone.getDefault());
    }

    public static String getISOTimeString(java.sql.Time time) {
        return StringUtils.getISODateString(time, TimeZone.getDefault());
    }

    public static String getISODateString(Date date, TimeZone tz) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        sdf.setTimeZone(tz);
        return sdf.format(date);
    }

    public static String getISODateString(java.sql.Date date, TimeZone tz) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        sdf.setTimeZone(tz);
        return sdf.format(date);
    }

    public static String getISOTimeString(java.sql.Time time, TimeZone tz) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSSXXX");
        sdf.setTimeZone(tz);
        return sdf.format(time);
    }
}
