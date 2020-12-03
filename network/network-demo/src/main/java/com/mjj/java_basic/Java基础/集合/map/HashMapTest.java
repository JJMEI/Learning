package com.mjj.java_basic.Java基础.集合.map;

import java.util.Date;
import java.util.HashMap;

public class HashMapTest {

    public static void main(String[] args) {

        // 默认load factor 0.75

//        static final int tableSizeFor(int cap) {
//            int n = cap - 1;
//            n |= n >>> 1;
//            n |= n >>> 2;
//            n |= n >>> 4;
//            n |= n >>> 8;
//            n |= n >>> 16;
//            return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
//        }

        // hash % length = hash & (length -1)  length = 2^N
        // HashMap 默认初始长度为 1<<4  16,并且每次自动扩展或者手动初始化时，长度必须2的幂
        // 长度是16或者其他2的幂 length-1的值的二进制位全为1 ，这种情况index的结果等于HashCode的后几位，只要
        //输入的hashCode本身分布均匀，hash算法的结果就是均匀的
        HashMap<String,String> maps = new HashMap<>(4);

//        static final int hash(Object key) {
//            int h;
              // h = key.hashCode(); 取key的hash值
              // h ^ (h>>>16)  h无符号右移16位  高低位一起参与运算   int 4字节  32位
//            return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
//        }
        for(int i=0;i<100;i++){
            maps.put(""+i,""+i);
        }

        Date currentDate = new Date();
        System.out.println(currentDate.toLocaleString());



    }
}
