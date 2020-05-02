package com.mjj.algorithm.stack;

import java.lang.reflect.Array;

public class Stack<T> {

    /**
     * 栈容量
     */
    private int maxSize;
    private T[] stackArray;
    private int top;

    @SuppressWarnings("unchecked")
    public Stack(int stackSize, T[] stackData){
        maxSize = stackSize;

        // 反射创建动态数组
        stackArray = (T[])Array.newInstance(stackData.getClass().getComponentType(),maxSize);
        top = -1;
    }

    public void push(T value){
        if(top < maxSize -1){
            stackArray[++top] = value;
        }else {
            throw new RuntimeException("stack is full!");
        }
    }

    @SuppressWarnings("unchecked")
    public <T> T peak() {
        if (top < maxSize) {
            return (T) stackArray[++top];
        } else if (top == -1) {
            throw new RuntimeException("stack if empty!");
        }
        return null;
    }

    public <T> T pop(){


        return null;

    }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(10,new Integer[0]);

        for (int i=0;i<10;i++){
            stack.push(i);
            System.out.println((char[]) stack.peak());
        }

    }

}
