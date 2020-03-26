package com.mjj.learning.self.mybatis.reflection;

import java.lang.reflect.Field;

public class ReflectionUtil {

    public static void setPropToBean(Object bean, String propName, Object value){
        Field f;
        try{
            f = bean.getClass().getDeclaredField(propName);
            f.setAccessible(true);
            f.set(bean,value);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

    }
}
