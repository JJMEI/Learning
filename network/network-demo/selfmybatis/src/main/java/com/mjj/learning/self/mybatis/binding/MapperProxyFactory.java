package com.mjj.learning.self.mybatis.binding;

import com.mjj.learning.self.mybatis.session.SqlSession;

import java.lang.reflect.Proxy;

public class MapperProxyFactory<T> {

    @SuppressWarnings(value = "unchecked")
    public static <T> T getMapperProxy(SqlSession sqlSession, Class<T> mapperInterface){
        MapperProxy<T> mapperProxy = new MapperProxy<>(sqlSession,mapperInterface);

        // 生成接口的动态代理对象
        return (T) Proxy.newProxyInstance(mapperInterface.getClassLoader(),new Class[]{mapperInterface},mapperProxy);
    }
}
