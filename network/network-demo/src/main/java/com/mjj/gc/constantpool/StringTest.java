package com.mjj.gc.constantpool;

public class StringTest {
    public static void main(String[] args) {
        String str1 = "aa";
        String str2 = new String("aa");

        System.out.println(str1==str2);

        String str3 = str2.intern();

        System.out.println(str3 == str1);
    }
}
