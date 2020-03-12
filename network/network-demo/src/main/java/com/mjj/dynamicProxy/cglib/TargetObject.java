package com.mjj.dynamicProxy.cglib;

/**
 *
 * 没有实现接口，需要cglib动态代理的目标类
 * @author meijunjie
 */
public class TargetObject {

    public String method1(String paramName){
        return paramName;
    }

    public int method2(int count){
        return count;
    }

    @Override
    public String toString() {
        return "TargetObject{}" + getClass();
    }
}
