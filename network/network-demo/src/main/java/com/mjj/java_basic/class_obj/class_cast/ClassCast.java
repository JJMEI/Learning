package com.mjj.java_basic.class_obj.class_cast;

import org.junit.Test;

public class ClassCast {


    @Test
    public void cast(){
        Animal animal = new Dog();
        // 强制类型转换  RRTI,所有的类型转换都是在运行时进行正确性检查的，利用RRTI进行类型判断以确保类型转换正确
        Dog dog = (Dog) animal;

        Class<Dog> dogType = Dog.class;

        Dog dog1 = dogType.cast(animal);


        if(Animal.class.isInstance(dog)){
            Animal animal1 = dog;
        }
    }


    public void cast(Object obj){
        // 判断这个对象是不是这种类型
        if(obj instanceof Animal){
            Animal animal = (Animal) obj;
        }else {
            throw new IllegalArgumentException("");
        }
    }
}

interface Animal{}

class Dog implements Animal{

}
