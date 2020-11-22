package com.mjj.java_basic.类型信息;

public abstract class Shape {
    void draw(){
        System.out.println(this + ".draw()");
    }

    /**
     *
     * @return
     */
    @Override
    abstract public String toString();
}
