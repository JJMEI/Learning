package com.mjj.java_basic.类型信息.反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorDemo {

    private String name;
    private Integer age;


    public ConstructorDemo(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public ConstructorDemo() {
    }

    private ConstructorDemo(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "ConstructorDemo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> constructorDemo = ConstructorDemo.class;

        Constructor[] constructors = constructorDemo.getDeclaredConstructors();
        for (Constructor constructor : constructors){
            System.out.println(constructor);
        }

        Constructor constructors1 = constructorDemo.getDeclaredConstructor(String.class,Integer.class);
        System.out.println(constructors1.newInstance("mjj",10));

        Constructor privateConstructor = constructorDemo.getDeclaredConstructor(String.class);

//        privateConstructor.setAccessible(true);
        System.out.println(privateConstructor.newInstance("AAA"));
    }
}
