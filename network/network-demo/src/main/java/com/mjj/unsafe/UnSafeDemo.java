package com.mjj.unsafe;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class UnSafeDemo {


    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        Field field = Unsafe.class.getDeclaredField("theUnsafe");

        // 设置Field为可访问
        field.setAccessible(true);

        // 通过Field得到该Field对应的具体对象，传入null是因为该Field为static
        Unsafe unsafe = (Unsafe) field.get(null);

        System.out.println(unsafe);

        User user = (User) unsafe.allocateInstance(User.class);

        Class userClass = user.getClass();
        Field name = userClass.getDeclaredField("name");
        Field age = userClass.getDeclaredField("age");
        Field id = userClass.getDeclaredField("id");




    }

    static class User{
        public User() {
            System.out.println("user 构造方法被调用");
        }

        private String name;
        private int age;
        private  static String id = "USER_ID";

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
