package com.mjj.spring.cap8.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * @Value 读取文件中读取配置
 */
public class Bird {


    @Value("Mjj")
    private String name;

    @Value("#{20-2}")
    private Integer age;


    @Value("${bird.color}")
    private String color;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }


    public Bird() {
    }


}
