package com.mjj.dynamicProxy.cglib;

/**
 *
 * 没有实现接口，需要cglib动态代理的目标类
 * @author meijunjie
 */
public class CglibService {

    public String sayHello(String paramName){
        System.out.println("cglib say hello ");
        return paramName;
    }

    final public int sayOthers(int count){
        System.out.println("cglib final method say hello ....");
        return count;
    }

    @Override
    public String toString() {
        return "TargetObject{}" + getClass();
    }
}
