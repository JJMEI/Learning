package com.mjj.learning.self.mybatis.session;

import java.util.List;

public interface SqlSession {
    /**
     * 查询单条记录
     * @param statement
     * @param parameter
     * @param <T>
     * @return
     */
    <T> T selectOne(String statement, Object parameter);


    /**
     *
     * @param statement
     * @param parameter
     * @param <E>
     * @return
     */
    <E> List<E> selectList(String statement, Object parameter);

    /**
     * 根据mapper接口获取接口对应的动态代理实现
     * @param type
     * @param <T>
     * @return
     */
    <T> T getMapper(Class<T> type);

}
