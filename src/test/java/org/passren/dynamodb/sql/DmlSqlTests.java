package org.passren.dynamodb.sql;

import org.junit.jupiter.api.Test;
import org.passren.dynamodb.engine.Common.QueryType;
import org.passren.dynamodb.engine.*;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DmlSqlTests<T> {

    @Test
    void simpleSelectSqlParser() {
        DmlSelectSql sql = (DmlSelectSql) SqlFactory.create("SELECT a, b FROM table1");
        assertEquals(QueryType.SELECT, sql.getQueryType());
        assertEquals("table1", sql.getTable());
        assertEquals(Map.ofEntries(
            Map.entry(0, "a"),
            Map.entry(1, "b")
        ), sql.getColumns());

        sql = (DmlSelectSql) SqlFactory.create("SELECT * FROM table1");
        assertEquals(QueryType.SELECT, sql.getQueryType());
        assertEquals("table1", sql.getTable());
        assertEquals(Map.ofEntries(
            Map.entry(0, "*")
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
            Map.entry(0, "a"),
            Map.entry(1, "b")
        ), sql.getColumns());
        assertEquals(2, sql.getPlaceholders());
    }

    @Test
    void simpleInsertSqlParser() {
        DmlInsertSql sql = (DmlInsertSql) SqlFactory.create("INSERT INTO table1 VALUE {'col1': 'a', 'col2': 'b'}");
        assertEquals(QueryType.INSERT, sql.getQueryType());
        assertEquals("table1", sql.getTable());
        assertEquals(Map.ofEntries(
            Map.entry("'col1'", "'a'"),
            Map.entry("'col2'", "'b'")
        ), sql.getValues());
    }
    

    @Test
    void insertSqlWithPlaceholderParser() {
        DmlInsertSql sql = (DmlInsertSql) SqlFactory.create("INSERT INTO table1 VALUE {'col1': ?, 'col2': ?}");
        assertEquals(QueryType.INSERT, sql.getQueryType());
        assertEquals("table1", sql.getTable());
        assertEquals(2, sql.getPlaceholders());
    }

    @Test
    void simpleUpdateSqlParser() {
        DmlUpdateSql sql = (DmlUpdateSql) SqlFactory.create("""
            UPDATE Music
            SET AwardsWon=1
            SET AwardDetail='Grammys'
            WHERE Artist='Acme Band' AND SongTitle='PartiQL Rocks'
        """);
        assertEquals(QueryType.UPDATE, sql.getQueryType());
        Map<String, String> expected = new HashMap<String, String>();
        expected.put("AwardsWon", "1");
        expected.put("AwardDetail", "'Grammys'");
        assertEquals(sql.getUpdatedElements(), expected);
    }

    @Test
    void simpleDeleteSqlParser() {
        String testSql = """
            DELETE FROM Music WHERE Artist = 'Acme Band' AND SongTitle = 'PartiQL Rocks'
        """;

        DmlDeleteSql sql = (DmlDeleteSql) SqlFactory.create(testSql);
        assertEquals(QueryType.DELETE, sql.getQueryType());
        assertEquals("Music", sql.getTable());

        String testSqlWithoutWhere = "DELETE FROM Music";
        assertThrows(InvalidSqlException.class, () -> SqlFactory.create(testSqlWithoutWhere));

        String testSqlWithErrorReturn = "DELETE FROM Music WHERE Artist = 'Acme Band' RETURNING bad value";
        assertThrows(InvalidSqlException.class, () -> SqlFactory.create(testSqlWithErrorReturn));
    }
    @Test
    void deleteSqlWithReturningParser() {
        String testSql = """
            DELETE FROM Music WHERE Artist = 'Acme Band' AND SongTitle = 'PartiQL Rocks' RETURNING ALL OLD *
        """;
        DmlDeleteSql sql = (DmlDeleteSql) SqlFactory.create(testSql);
        assertEquals(QueryType.DELETE, sql.getQueryType());
        assertEquals("Music", sql.getTable());

    }

    @Test
    void deleteSqlWithPlaceholderParser() {
        DmlDeleteSql sql = (DmlDeleteSql) SqlFactory.create("""
            DELETE FROM Music WHERE Artist = ? AND SongTitle = ? RETURNING ALL OLD *
        """);
        assertEquals(QueryType.DELETE, sql.getQueryType());
        assertEquals("Music", sql.getTable());
        assertEquals(2, sql.getPlaceholders());
    }
}
