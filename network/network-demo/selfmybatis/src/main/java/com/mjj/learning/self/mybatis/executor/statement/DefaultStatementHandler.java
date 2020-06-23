package com.mjj.learning.self.mybatis.executor.statement;

import com.mjj.learning.self.mybatis.config.MappedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author meijunjie
 */
public class DefaultStatementHandler implements StatementHandler {

    private MappedStatement mappedStatement;

    public DefaultStatementHandler(MappedStatement mappedStatement) {
        this.mappedStatement = mappedStatement;
    }

    @Override
    public PreparedStatement prepare(Connection connection) throws SQLException {
        return connection.prepareStatement(mappedStatement.getSql());
    }

    @Override
    public ResultSet query(PreparedStatement preparedStatement) {
        try{
            return preparedStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
