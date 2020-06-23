package com.mjj.gc.constantpool;


import org.junit.Test;

/**
 * 什么是常量？
 *      用final修饰的成员变量表示常量，值一旦给定就无法改变！！！
 *      final修饰的变量有三种：
 *          1. 静态变量 final static String  STATIC_FINAL_VARIABLE = "TEST";
 *          2. 成员变量 final String MEMBER_STATIC_VARIABLE = "TEST";
 *          3. 局部变量 （方法的入参 public void test(final int type){}）
 *
 *
 */
public class ConstantTest {

    public static final String STATIC_FINAL_VARIABLE = "Test";
    public final String MEMBER_FINAL_VARIABLE = "Test2";

    public static void test(final int type){
        System.out.println(type);
    }

    public static void main(String[] args) {
        System.out.println(STATIC_FINAL_VARIABLE);
        test(1);
    }


    @Test
    public void test1(){


//        public static Integer valueOf(int i) {
                // 判断是否在缓存[-128,127]的范围内
//            if (i >= Integer.IntegerCache.low && i <= Integer.IntegerCache.high)
//                return Integer.IntegerCache.cache[i + (-Integer.IntegerCache.low)];
//            return new Integer(i);
//        }

        //Java 在编译阶段会直接将代码封装成Inter.valueOf(40),从而使用常量池中的对象
        Integer a = 40;
        Integer b = 40;
        Integer c = Integer.valueOf(40);
        Integer d = new Integer(40);

        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(a==d);
    }


    @Test
    public void stringTest(){

        String a = new String("aa");
        String b = "aaa"+"aaaaddd";
        String c = a + b;
        String d = a + "weeeee";
    }


    @Test
    public void test23(){
        for(int i=0;i<2000000;i++){
            String temp = ("ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd"+i);
        }
    }
}
