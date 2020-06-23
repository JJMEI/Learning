package com.mjj.gc.reference;

import java.lang.ref.WeakReference;

/**
 *
 * 弱引用 关联的对象 只能存活到下一次垃圾收集之前
 * @author meijunjie
 */
public class WeakReferenceDemo {
    static class User{
        private int age;
        private String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public User() {
        }
    }

    public static void main(String[] args) {
        SoftReferenceDemo.User u = new SoftReferenceDemo.User(1,"Peter");

        WeakReference<SoftReferenceDemo.User> userSoftReference = new WeakReference<>(u);

        u = null;

        System.out.println(userSoftReference.get());

        System.gc();

        System.out.println("AfterGC");
        System.out.println(userSoftReference.get());
    }
}
