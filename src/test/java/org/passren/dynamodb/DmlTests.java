package org.passren.dynamodb;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(OrderAnnotation.class)
@DisplayName("Test DML Select Operations with PartiQL syntax")
public class DmlTests extends BaseTests {
    
    @Test
    @Order(1)
    void insertSimpleData() throws SQLException {
        Statement statement = conn.createStatement();
        
        String sql = """
            INSERT INTO ddbjdbc01 VALUE {
                'pk': 'testcase01', 'sk': 0,
                'col1': 'this is a string'
            }
        """;
        int affected = statement.executeUpdate(sql);

        // DynamoDB can't return affected rows from backend
        assertEquals(0, affected);
    }

    @Test
    @Order(2)
    void queryByPKSK() throws SQLException {
        Statement statement = conn.createStatement();

        String sql = """
            SELECT pk, sk, col1 FROM ddbjdbc01
            WHERE pk='testcase01'
            AND sk=0
        """;
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()) {
            assertEquals("testcase01", rs.getString(0));
            assertEquals(0, rs.getInt(1));
            assertEquals("this is a string", rs.getString(2));
        }
        assertEquals(0, rs.getRow());
    }

    @Test
    @Order(3)
    void insertDataWithParameters() throws SQLException {
        String sql = """
            INSERT INTO ddbjdbc01 VALUE {
                'pk': ?, 'sk': ?,
                'col1': ?
            }
        """;

        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, "testcase01");
        statement.setInt(2, 1);
        statement.setString(3, "this is another string");
        
        statement.executeUpdate();
    }

    @Test
    @Order(4)
    void queryByPK() throws SQLException {
        String sql = """
            SELECT pk, sk, col1 FROM ddbjdbc01
            WHERE pk=?
        """;

        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, "testcase01");

        ResultSet rs = statement.executeQuery();
        List<String> expectedResult = Arrays.asList(
                new String[] {"this is a string", "this is another string"}
        );
        while (rs.next()) {
            assertTrue(expectedResult.contains(rs.getString(2)));
        }

        assertEquals(1, rs.getRow());
    }

    @Test
    @Order(5)
    void deleteSimpleData() throws SQLException {
        Statement statement = conn.createStatement();
        String deleteSql = """
            DELETE FROM ddbjdbc01
            WHERE pk='testcase01'
            AND sk=0
        """;
        int deleted = statement.executeUpdate(deleteSql);
        assertEquals(0, deleted);

        String selectSql = """
            SELECT pk, sk, col1 FROM ddbjdbc01
            WHERE pk='testcase01'
            AND sk=0
        """;
        ResultSet rs = statement.executeQuery(selectSql);
        assertFalse(rs.next());

        String sql = """
            INSERT INTO ddbjdbc01 VALUE {
                'pk': 'testcase01', 'sk': 0,
                'col1': 'this is a string'
            }
        """;
        statement.executeUpdate(sql);

        String deleteWithReturnSql = """
            DELETE FROM ddbjdbc01
            WHERE pk='testcase01'
            AND sk=0 RETURNING ALL OLD *
        """;
        rs = statement.executeQuery(deleteWithReturnSql);
        while (rs.next()) {
            assertEquals("testcase01", rs.getString("pk"));
            assertEquals(0, rs.getInt("sk"));
            assertEquals("this is a string", rs.getString("col1"));
        }
        assertEquals(0, rs.getRow());
    }

    @Test
    @Order(6)
    void deleteWithParameters() throws SQLException {
        Statement statement = conn.createStatement();
        String simpleInsertSql = """
            INSERT INTO ddbjdbc01 VALUE {
                'pk': 'testcase01', 'sk': 0,
                'col1': 'this is a string'
            }
        """;
        statement.executeUpdate(simpleInsertSql);

        String deleteSql = """
            DELETE FROM ddbjdbc01
            WHERE pk=? AND sk=?
        """;
        PreparedStatement delPs = conn.prepareStatement(deleteSql);
        delPs.setString(1, "testcase01");
        delPs.setInt(2, 0);
        boolean result = delPs.execute();
        assertTrue(result);

        String deleteSqlWithReturn = """
            DELETE FROM ddbjdbc01
            WHERE pk=? AND sk=? RETURNING ALL OLD *
        """;
        statement.executeUpdate(simpleInsertSql);
        delPs = conn.prepareStatement(deleteSqlWithReturn);
        delPs.setString(1, "testcase01");
        delPs.setInt(2, -1);

        ResultSet rs = delPs.executeQuery();
        assertFalse(rs.next());

        delPs.setInt(2, 0);
        rs = delPs.executeQuery();
        while (rs.next()) {
            assertEquals("testcase01", rs.getString("pk"));
            assertEquals(0, rs.getInt("sk"));
            assertEquals("this is a string", rs.getString("col1"));
        }
        assertEquals(0, rs.getRow());
    }
}
