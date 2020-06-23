package com.mjj.data_structure.array;

import java.util.Arrays;
import java.util.List;

public class ArrayList{
    public static void main(String[] args) {
        List<String> arrayList = new java.util.ArrayList<>(11);

        // 1
        arrayList.add("0");
        // 2
        arrayList.add("1");
        // 3
        arrayList.add("2");
        // 4
        arrayList.add("3");
        // 5
        arrayList.add("4");
        // 6
        arrayList.add("5");
        // 7
        arrayList.add("6");
        // 8
        arrayList.add("7");
        // 9
        arrayList.add("8");
        // 10
        arrayList.add("9");
        // 11
        arrayList.add("10");
        // 12
        arrayList.add("11");


        arrayList.remove(0);

        arrayList.remove("10");

        arrayList.add(1,"1111");
        arrayList.subList(1,4);

        // return size
        arrayList.size();

        arrayList.contains("1");

        arrayList.get(1);

        List<String> subList = new java.util.ArrayList<>();
        subList.add("aaaa");
        arrayList.addAll(subList);
        int[] a = {0,1,2,3,4,5};


        int deleteIndex = 1;
        System.arraycopy(a,deleteIndex + 1,a,deleteIndex,a.length-deleteIndex-1);
        System.out.println(Arrays.toString(a));






    }
}