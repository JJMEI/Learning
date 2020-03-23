package com.mjj.java_basic.enume;

import java.util.Arrays;

/**
 * 枚举类本质是是一个继承至Enum抽象类的Final类
 *
 * This is the common base class of all Java language enumeration types.
 */
public class EnumeDemo {

    public static void main(String[] args) {
        Day[] days = new Day[]{Day.MONDAY,Day.TUESDAY,Day.WEDNESDAY,Day.THURSDAY,Day.FRIDAY,Day.SATURDAY,Day.SUNDAY};

        for(int i=0;i<days.length;i++){
            System.out.println("day[" + i + "].ordinal():" + days[i].ordinal());
        }

        System.out.println("------------------------------------");


        // 通过CompareTo方法比较实际上其内部是通过 ordinal()的值比较的
        System.out.println("days[0].compareTo(days[1]):" + days[0].compareTo(days[1]));

        System.out.println("days[0].compareTo(days[1]):" + days[0].compareTo(days[2]));



        Class<?> clazz = days[0].getDeclaringClass();
        System.out.println("clazz:" + clazz);


        System.out.println("----------------------------------");

        System.out.println("days[0].name():" + days[0].name());
        System.out.println("days[1].name():" + days[1].name());
        System.out.println("days[2].name():" + days[2].name());
        System.out.println("days[3].name():" + days[3].name());


        System.out.println("----------------------------------");
        System.out.println("days[0].toString():" + days[0].toString());


        System.out.println(Enum.valueOf(Day.class,days[0].name()));


        System.out.println(Arrays.toString(Day.values()));
    }
}
