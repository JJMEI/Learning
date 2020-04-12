package com.serializable.jdk;


import java.io.*;

public class Person implements Serializable {

    private String name;
    private int age;

    public Person(String name, int age) {

        System.out.println("construct method is invoked! " + System.nanoTime());
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"))) {
            Person person = new Person("MJJ",27);
            oos.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"));

            // 反序列化并不会调用构造方法，反序列化对象是由JVM自己生成的，不通过构造方法生成
            Person person = (Person) ois.readObject();
            System.out.println(person);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
