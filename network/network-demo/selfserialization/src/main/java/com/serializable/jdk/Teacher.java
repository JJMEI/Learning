package com.serializable.jdk;

import java.io.*;

class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

/**
 * 如果一个可序列化的类的成员不是基本类型，也不是String类型，那个引用类型也必须是可序列化的，否则，会导致此类不可序列化
 * @author meijunjie
 */
public class Teacher implements Serializable {

    private String name;

    /**
     * transient 关键字告诉jdk 当前字段不需要进行序列化
     */
    transient private Student student;

    public Teacher(String name, Student student) {
        this.name = name;
        this.student = student;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", student=" + student +
                '}';
    }

    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("teacher.bin"))) {
            Student student = new Student("Jack",12);
            Teacher teacher = new Teacher("Mike",student);
            oos.writeObject(teacher);

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("teacher.bin"));
            System.out.println(ois.readObject());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
