package com.mjj.learning.self.mybatis.executor.resultset;

import com.mjj.learning.self.mybatis.config.MappedStatement;
import com.mjj.learning.self.mybatis.reflection.ReflectionUtil;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DefaultResuleSetHandler implements ResultSetHandler {

    private MappedStatement mappedStatement;

    public DefaultResuleSetHandler(MappedStatement mappedStatement) {
        this.mappedStatement = mappedStatement;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <E> List<E> handleResultSet(ResultSet resultSet) throws SQLException {
        List<E> ret = new ArrayList<>();
        while (resultSet.next()){
            Class<?> entityClass;
            try{
                // 获取返回类型
                entityClass = Class.forName(mappedStatement.getResultType());

                // 实例化返回对象
                E entity  = (E) entityClass.newInstance();

                // 获取当前类的所有字段 包括私有字段
                Field[] declaredFields = entityClass.getDeclaredFields();
                for(int i=0;i<declaredFields.length;i++){
                    if(declaredFields[i].getType().getSimpleName().equals("String")){
                        ReflectionUtil.setPropToBean(entity,declaredFields[i].getName(),resultSet.getString(declaredFields[i].getName()));
                    }else if(declaredFields[i].getType().getSimpleName().equals("Integer")){
                        ReflectionUtil.setPropToBean(entity,declaredFields[i].getName(),resultSet.getInt(declaredFields[i].getName()));
                    }
                }

                ret.add(entity);

            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        return ret;
    }
}
