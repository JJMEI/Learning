package com.mjj.datastructre.line_table.sort_line_table;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();


        // 向顺讯列表中添加元素
        arrayList.add(1);


        // ArrayList是如何扩容的


        for(int i=0;i<11;i++){

            // 新增的过程中会完成进行动态扩容
            arrayList.add(i);
        }

    }
}
