package com.mjj.learning.self.mybatis.session;

import com.mjj.learning.self.mybatis.config.Configuration;
import com.mjj.learning.self.mybatis.config.MappedStatement;
import com.mjj.learning.self.mybatis.executor.Executor;
import com.mjj.learning.self.mybatis.executor.SimpleExecutor;

import java.sql.SQLException;
import java.util.List;

/**
 * @author meijunjie
 */
public class DefaultSqlSession implements SqlSession {

    private Configuration configuration;

    private Executor executor;

    public DefaultSqlSession(Configuration configuration) {
        this.configuration = configuration;
        this.executor = new SimpleExecutor(configuration);
    }



    @SuppressWarnings("unchecked")
    @Override
    public <T> T selectOne(String statement, Object parameter) {
        List<Object> selectList = this.selectList(statement,parameter);
        if(selectList != null && selectList.size() > 0){
            return (T) selectList.get(0);
        }
        return null;
    }

    @Override
    public <E> List<E> selectList(String statement, Object parameter) {
        MappedStatement mappedStatement = configuration.getMappedStatement(statement);
        try {
            // 调用Executor执行查询
            return executor.query(mappedStatement,parameter);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public <T> T getMapper(Class<T> type) {
        return configuration.getMapper(type,this);
    }
}
