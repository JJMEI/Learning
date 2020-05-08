package com.mjj.collection;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

        // 虽然数组初始化了，但是里面没有数据
        // new ArrayList 时如果没有设置初始化容量 或者容量小于10 则第一次扩容到10
        ArrayList<Integer> arrayList = new ArrayList<>();

        // ArrayList.size()方法表明的是持有的元素个数
        System.out.println(arrayList.size());

        for(int i=0;i<15;i++){

            // 元素个数超过法定容量，需要进行扩容操作
            arrayList.add(i);
        }

        arrayList.set(5,1);

        arrayList.add(15,1111);


        arrayList.remove(12);
    }
}
