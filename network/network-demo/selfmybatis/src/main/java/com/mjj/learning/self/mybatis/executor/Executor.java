package com.mjj.learning.self.mybatis.executor;

import com.mjj.learning.self.mybatis.config.MappedStatement;

import java.sql.SQLException;
import java.util.List;

/**
 * mybatis的核心接口 定义了数据库操作的基本方法 SqlSession的功能实现都是基于它来实现的
 * @author meijunjie
 */
public interface Executor {

    /**
     * 执行查询
     * @param ms
     * @param parameter
     * @param <E>
     * @return
     */
    <E> List<E> query(MappedStatement ms, Object parameter) throws SQLException;
}
