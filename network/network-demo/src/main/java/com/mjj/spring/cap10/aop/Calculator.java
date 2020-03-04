package com.mjj.spring.cap10.aop;

public class Calculator {


    /**
     * 对方法进行增强
     * 业务逻辑方法
     * @param i
     * @param j
     * @return
     */
    public int div(int i,int j){
        return i/j;
    }
}
