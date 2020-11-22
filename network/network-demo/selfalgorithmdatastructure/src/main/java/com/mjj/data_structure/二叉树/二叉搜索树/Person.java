package com.mjj.data_structure.二叉树.二叉搜索树;

public class Person implements Comparable<Person> {
    private Integer age;

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }

    public Person(Integer age) {
        this.age = age;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "" + age ;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
