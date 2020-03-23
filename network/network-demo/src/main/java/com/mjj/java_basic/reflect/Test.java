package com.mjj.java_basic.reflect;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Test {


    @SuppressWarnings(value = "unchecked")
    public  <T extends Comparable<T>> void min(T[] a) {
        //通过反射创建相同类型的数组
        // 通过反射创建动态数据
        T[] b = (T[]) Array.newInstance(a.getClass().getComponentType(), a.length);

        T[] b2 = (T[]) Array.newInstance(a.getClass().getComponentType(),a.length);
        T min = b[0];
        for(int i=1;i<b.length;i++){
            if(min.compareTo(b[1]) > 0){
               min = b[1];
            }
        }

        System.out.println("最小值是 " + min);

    }
    public static void main(String[] args) {




        System.out.println("获取SubClass类的所有构造方法");

        /**
         * getDeclaredConstructors
         */
        for(Constructor constructor : SubClass.class.getDeclaredConstructors()){
            System.out.println(constructor);
        }


        System.out.println("获取SubClass类的所有构造方法。。。");

        for(Constructor constructor : SubClass.class.getConstructors()){
            System.out.println(constructor);
        }


        System.out.println("获取SubClass的所有方法包括私有方法....");


        for(Method method : SubClass.class.getDeclaredMethods()){
            System.out.println(method);
        }


        System.out.println("获取当前类所有public方法 包括父类的，但是不包括所有的私有方法");
        for(Method method: SubClass.class.getMethods()){
            System.out.println(method);
        }



    }
}
