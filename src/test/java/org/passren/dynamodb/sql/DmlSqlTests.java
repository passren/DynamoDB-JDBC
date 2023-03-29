package org.passren.dynamodb.sql;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.AbstractMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.passren.dynamodb.engine.DmlInsertSql;
import org.passren.dynamodb.engine.DmlSelectSql;
import org.passren.dynamodb.engine.SqlFactory;
import org.passren.dynamodb.engine.Common.QueryType;

public class DmlSqlTests<T> {

    @Test
    void simpleSelectSqlParser() {
        DmlSelectSql sql = (DmlSelectSql) SqlFactory.create("SELECT a, b FROM table1");
        assertEquals(QueryType.SELECT, sql.getQueryType());
        assertEquals("table1", sql.getTable());
        assertEquals(Map.ofEntries(
            new AbstractMap.SimpleEntry<Integer, String>(0, "a"),
            new AbstractMap.SimpleEntry<Integer, String>(1, "b")
        ), sql.getColumns());

        sql = (DmlSelectSql) SqlFactory.create("SELECT * FROM table1");
        assertEquals(QueryType.SELECT, sql.getQueryType());
        assertEquals("table1", sql.getTable());
        assertEquals(Map.ofEntries(
            new AbstractMap.SimpleEntry<Integer, String>(0, "*")
        ), sql.getColumns());
    }

    @Test
    void selectSqlWithPlaceholderParser() {
        DmlSelectSql sql = (DmlSelectSql) SqlFactory.create("""
            SELECT a, b FROM table1 WHERE col1=? AND col2=?
        """);
        assertEquals(QueryType.SELECT, sql.getQueryType());
        assertEquals("table1", sql.getTable());
        assertEquals(Map.ofEntries(
            new AbstractMap.SimpleEntry<Integer, String>(0, "a"),
            new AbstractMap.SimpleEntry<Integer, String>(1, "b")
        ), sql.getColumns());
        assertEquals(2, sql.getPlaceholders());
    }

    @Test
    void simpleInsertSqlParser() {
        DmlInsertSql sql = (DmlInsertSql) SqlFactory.create("INSERT INTO table1 VALUE {'col1': 'a', 'col2': 'b'}");
        assertEquals(QueryType.INSERT, sql.getQueryType());
        assertEquals("table1", sql.getTable());
        assertEquals(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, String>("'col1'", "'a'"),
            new AbstractMap.SimpleEntry<String, String>("'col2'", "'b'")
        ), sql.getValues());
    }
    

    @Test
    void insertSqlWithPlaceholderParser() {
        DmlInsertSql sql = (DmlInsertSql) SqlFactory.create("INSERT INTO table1 VALUE {'col1': ?, 'col2': ?}");
        assertEquals(QueryType.INSERT, sql.getQueryType());
        assertEquals("table1", sql.getTable());
        assertEquals(2, sql.getPlaceholders());
    }
}
