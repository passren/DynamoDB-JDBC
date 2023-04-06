package org.passren.dynamodb.engine;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.passren.dynamodb.engine.Common.QueryType;
import org.passren.dynamodb.sql.DynamoSqlAst;
import org.passren.dynamodb.sql.DynamoSqlLexer;
import org.passren.dynamodb.sql.DynamoSqlParser;

public class SqlFactory {
    
    public static BaseSql create(String sql) {
        DynamoSqlLexer lexer = new DynamoSqlLexer(CharStreams.fromString(sql));
        DynamoSqlParser parser = new DynamoSqlParser(new CommonTokenStream(lexer));
        parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
        DynamoSqlAst visitor = new DynamoSqlAst();
        visitor.visit(parser.root());
        QueryType queryType = visitor.getQueryType();

        return switch (queryType) {
            case SELECT -> new DmlSelectSql(sql, visitor);
            case INSERT -> new DmlInsertSql(sql, visitor);
            case UPDATE -> new DmlUpdateSql(sql, visitor);
            case DELETE -> new DmlDeleteSql(sql, visitor);
            case NONE, default -> throw new InvalidSqlException();
        };
    }
}
