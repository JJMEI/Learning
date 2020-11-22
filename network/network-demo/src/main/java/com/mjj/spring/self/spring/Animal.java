package com.mjj.spring.self.spring;

public class Animal {

    private String name;
    private Integer age;
    /**
     * 主人
     */
    private Person master;

    public Animal(){

    }

    public Animal(String name, Integer age, Person master) {
        this.name = name;
        this.age = age;
        this.master = master;
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

    public Person getMaster() {
        return master;
    }

    public void setMaster(Person master) {
        this.master = master;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", master=" + master +
                '}';
    }
}
