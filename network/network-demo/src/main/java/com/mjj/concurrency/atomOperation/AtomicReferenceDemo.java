package com.mjj.concurrency.atomOperation;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 更新引用类型
 *
 * AtomicMarkableReference  版本戳是布尔型，有没有动过
 * AtomicStampedReference  动过几次
 *
 */
public class AtomicReferenceDemo {


    static AtomicReference<UserInfo> atomicReference = new AtomicReference<>();


    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo("Mjj",12);

        atomicReference.set(userInfo);


        atomicReference.compareAndSet(userInfo,new UserInfo("Mjj",122));


        System.out.println(atomicReference.get());

        System.out.println(userInfo);
    }

    static class UserInfo{

        private String name;
        private int age;


        public UserInfo(String name, int age) {
            this.name = name;
            this.age = age;
        }


        public String getName(){
            return name;
        }

        public int getAge(){
            return age;
        }

        @Override
        public String toString() {
            return "UserInfo{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

}



