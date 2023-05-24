package org.passren.dynamodb;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(OrderAnnotation.class)
@DisplayName("Test DML Update Operations with PartiQL syntax")
public class UpdateStatementTests extends BaseTests {
    
    @Test
    @Order(1)
    void updateSimpleData() throws SQLException {
        Statement statement = conn.createStatement();
        
        String sql = """
            INSERT INTO ddbjdbc01 VALUE {
                'pk': 'pk1', 
                'sk': 0,
                'col1': 'col1'
            }
        """;
        statement.executeUpdate(sql);

        String querySql = """
            SELECT pk, sk, col1 FROM ddbjdbc01
            WHERE pk='pk1'
            AND sk=0
        """;
        ResultSet rs = statement.executeQuery(querySql);
        while (rs.next()) {
            assertEquals("pk1", rs.getString(0));
            assertEquals(0, rs.getInt(1));
            assertEquals("col1", rs.getString(2));
        }

        String updateSql = """
            UPDATE ddbjdbc01
            SET col1='changed'
            WHERE pk='pk1' AND sk=0
        """;
        // execute update
        statement.executeUpdate(updateSql);

        // check updated value
        ResultSet rs2 = statement.executeQuery(querySql);
        while (rs2.next()) {
            assertEquals("changed", rs2.getString(2));
        }
    }
    @Test
    @Order(2)
    void updateDataWithPlaceholder() throws SQLException {
        Statement statement = conn.createStatement();

        String sql = """
            INSERT INTO ddbjdbc01 VALUE {
                'pk': 'pk1', 
                'sk': 0,
                'col1': 'col1'
            }
        """;
        statement.executeUpdate(sql);

        String querySql = """
            SELECT pk, sk, col1 FROM ddbjdbc01
            WHERE pk='pk1'
            AND sk=0
        """;

        String updateSql = """
            UPDATE ddbjdbc01
            SET col1=?
            WHERE pk=? AND sk=?
        """;
        PreparedStatement preparedStatement = conn.prepareStatement(updateSql);
        preparedStatement.setString(1, "col1_modified");
        preparedStatement.setString(2, "pk1");
        preparedStatement.setInt(3, 0);
        // execute update
        preparedStatement.executeUpdate();

        // check updated value
        ResultSet rs2 = statement.executeQuery(querySql);
        while (rs2.next()) {
            assertEquals("col1_modified", rs2.getString(2));
        }
    }

}
