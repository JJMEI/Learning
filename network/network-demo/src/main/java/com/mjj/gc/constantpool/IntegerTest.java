package com.mjj.gc.constantpool;

/**
 * 高速缓存 常量技术
 */
public class IntegerTest {


    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 10;
        // true
        System.out.println(a==b);

        Integer c = 200;
        Integer d =200;
        System.out.println(c==d);

        Long e = 200L;
        Long f = 200L;
        System.out.println(e==f);

        Long g = Long.valueOf(20L);
        Long h = 20L;

        System.out.println(g==h);



    }
}
