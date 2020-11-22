package com.mjj.java_basic.类型信息.反射;

import java.lang.reflect.Field;

public class ReflectFieldTest {
    public static void main(String[] args) {
        Class<Student> studentClass = Student.class;

        // 获取所有字段 但不包含继承只父类的
        Field[] fields = studentClass.getDeclaredFields();

        for(Field field: fields){
            System.out.println(field);
        }

        // 获取所有字段包含
        Field[] fields1 = studentClass.getFields();

        for(Field field : fields1){
            System.out.println(field);
        }
    }
}
