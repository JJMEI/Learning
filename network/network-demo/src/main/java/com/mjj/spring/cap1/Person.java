package com.mjj.spring.cap1;

public class Person {
    private String name;
    private Integer age;
    private SubPerson subPerson;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
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
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public SubPerson getSubPerson() {
        return subPerson;
    }

    public void setSubPerson(SubPerson subPerson) {
        this.subPerson = subPerson;
    }
}