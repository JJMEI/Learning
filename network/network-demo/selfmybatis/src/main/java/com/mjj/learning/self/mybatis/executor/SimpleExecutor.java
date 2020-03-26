package com.mjj.learning.self.mybatis.executor;

import com.mjj.learning.self.mybatis.config.Configuration;
import com.mjj.learning.self.mybatis.config.MappedStatement;
import com.mjj.learning.self.mybatis.executor.parameter.DefaultParameterHandler;
import com.mjj.learning.self.mybatis.executor.parameter.ParameterHandler;
import com.mjj.learning.self.mybatis.executor.resultset.DefaultResuleSetHandler;
import com.mjj.learning.self.mybatis.executor.resultset.ResultSetHandler;
import com.mjj.learning.self.mybatis.executor.statement.DefaultStatementHandler;
import com.mjj.learning.self.mybatis.executor.statement.StatementHandler;

import java.sql.*;
import java.util.List;

public class SimpleExecutor implements Executor {

    private Configuration configuration;

    public SimpleExecutor(Configuration configuration) {
        this.configuration = configuration;
    }


    @Override
    public <E> List<E> query(MappedStatement ms, Object parameter) throws SQLException{
        MappedStatement mappedStatement = configuration.getMappedStatement(ms.getSourceId());

        // 获取数据库连接 这里可以从数据源获取
        Connection connection = getConnection();

        StatementHandler statementHandler = new DefaultStatementHandler(mappedStatement);

        PreparedStatement preparedStatement = statementHandler.prepare(connection);

        ParameterHandler parameterHandler = new DefaultParameterHandler(parameter);
        parameterHandler.setParameters(preparedStatement);

        ResultSet resultSet = statementHandler.query(preparedStatement);

        ResultSetHandler resultSetHandler = new DefaultResuleSetHandler(mappedStatement);

        return resultSetHandler.handleResultSet(resultSet);
    }

    private Connection getConnection() {
        Connection connection = null;
        try{
            Class.forName(configuration.getDbDriver());
            connection = DriverManager.getConnection(configuration.getDbUrl(),configuration.getDbUserName(),configuration.getDbPassword());
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
