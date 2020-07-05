package com.mjj.data_structure.动态数组;

public class Test {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        for(int i=0;i<15;i++){
            arrayList.add(i);
        }

        System.out.println("当前动态数组中的数据量:  " +  arrayList.size());

        System.out.println(arrayList.get(14));

        System.out.println("当前数组是否为空: " + arrayList.isEmpty());

        arrayList.add(1,22222);
        System.out.println(arrayList.get(1));

        System.out.println("删除索引 index = 2 before 数据容量: " + arrayList.size() );

        System.out.println("删除所有 index=2 返回值值: " + arrayList.remove(2));

        System.out.println("删除索引 index = 2 after 数据容量: " + arrayList.size());
    }
}
