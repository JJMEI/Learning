package com.mjj.learning.self.mybatis.binding;

import com.mjj.learning.self.mybatis.session.SqlSession;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Collection;

public class MapperProxy<T> implements InvocationHandler {

    private SqlSession sqlSession;

    /**
     * mapper接口
     */
    private final Class<T> mapperInterface;

    public MapperProxy(SqlSession sqlSession, Class<T> mapperInterface) {
        super();
        this.sqlSession = sqlSession;
        this.mapperInterface = mapperInterface;
    }

    private <T> boolean isCollection(Class<T> type){
        return Collection.class.isAssignableFrom(type);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // 判断是否是来着Object类的方法
        if(Object.class.equals(method.getDeclaringClass())){
            return method.invoke(this,args);
        }

        Class<?> returnType = method.getReturnType();

        Object ret;

        // 根据不同的返回类型
        if(isCollection(returnType)){
            ret = sqlSession.selectList(mapperInterface.getName()+"."+method.getName(),args);
        }else {
            ret = sqlSession.selectOne(mapperInterface.getName()+"."+method.getName(),args);
        }
        return ret;
    }
}
