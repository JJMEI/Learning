package com.mjj.smartframework.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by meijunjie on 2018/8/10.
 */
public final class ReflectionUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(ReflectionUtil.class);

    /**
     * 实例化Class对象
     * @param cls
     * @return
     */
    public static Object newInstance(Class<?> cls){
        Object instance;
        try{
            instance = cls.newInstance();
        } catch (IllegalAccessException e) {
            LOGGER.error("Instance error! cls={}, exception_info={}",cls,e);
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            LOGGER.error("Instance error! cls={}, exception_info={}",cls,e);
            throw new RuntimeException(e);
        }
        return instance;
    }

    /**
     * 调用方法
     * @param obj
     * @param method
     * @param args
     * @return
     */
    public static Object invokeMethod(Object obj, Method method, Object... args){
        Object result;
        try{
            // 设置方法为可访问
            method.setAccessible(true);
            result = method.invoke(obj, args);
        } catch (IllegalAccessException e) {
            LOGGER.error("Invoke error! exception={}",e);
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            LOGGER.error("Invoke error! exception={}",e);
            throw new RuntimeException(e);
        }
        return result;
    }

    public static void setField(Object obj, Field field, Object value){
        try{
            field.setAccessible(true);
            field.set(obj,value);
        }catch (Exception e){
            LOGGER.error("Set field error! exception_info={}",e);
            throw new RuntimeException(e);
        }
    }
}
