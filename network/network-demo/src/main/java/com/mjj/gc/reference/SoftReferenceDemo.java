package com.mjj.gc.reference;

import java.lang.ref.SoftReference;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * 软引用 还有些用 但是不是是必须的
 * 当前GC关联对象不会马上被回收，会被列进第二次回收的名单 如果这次回收还没有足够多的内存 则会抛出内存溢出异常
 * @author meijunjie
 */
public class SoftReferenceDemo {

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

        User u = new User(1,"Peter");

        SoftReference<User> userSoftReference = new SoftReference<>(u);

        u = null;

        System.out.println(userSoftReference.get());

        System.gc();

        System.out.println("AfterGC");
        System.out.println(userSoftReference.get());

        List<byte[]> list = new LinkedList<>();

        try{
            for(int i=0;i<100;i++){
                System.out.println("------------" + userSoftReference.get());
                list.add(new byte[1024*1024*1]);
            }
        }catch (Throwable e){
            System.out.println("Throwable....." + userSoftReference.get());
        }
    }
}
