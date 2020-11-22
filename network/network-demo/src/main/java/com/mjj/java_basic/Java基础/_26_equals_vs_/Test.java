package com.mjj.java_basic.Java基础._26_equals_vs_;


import java.util.HashSet;

/**
 * 参考 https://www.cnblogs.com/skywang12345/p/3324958.html
 * == 他的作用是判断两个对象的地址是不是相等，即判断两个对象是不是同一个对象
 * （基本数据类型==比较的是值，引用数据类型==比较的是内存地址）
 *
 * equals() 他的作用也是判断两个对象是否相等。但它一般有两种使用情况
 * 1   没有覆盖equals方法，则通过equals()方法比较该类的两个对象时 等价于 == 比较这个连个对象
 * 2   覆盖了equals()方法，一般我们都覆盖equals方法来比较两个对象的内容是否相同，如他们的内容相等
 *
 * hashCode()在散列表中才有用，在其他情况下没有用，在散列表中hashCode()的作用是获取对象的散列码，进而确定该对象在散列表中的位置
 * hashCode() 与 equals()之间的关系
 * 1 不会创建类对应的散列表   我们不会再HashSet HashMap HashTable 等待这些本质是散列表的数据结构中 用到该类，例如不会创建该类的HashSet集合
 *      这种情况下hashCode() 和 equals()没有丝毫关系，equals()用来判断两个对象是否相等，而hashCode()则没有任何作用，不用理会hashCode()
 *
 * 2 会创建类对应的散列表 比如创建该类的HashSet集合
 *      如果两个对象相等，那么它们的hashCode()值一定相同，这里相等是指，通过equals()比较两个对象时返回true
 *      如果两个对象的hashCode()值相等，它们并不一定相等
 *      因为在散列表中，hashCode()相等 即两个键值对的哈希值相等
 *
 *
 * Object
 * @author meijunjie
 */
public class Test {

    static class Person{
        private String name;
        private Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object obj) {
            return this.name.equals(((Person)obj).name);
        }

        @Override
        public int hashCode() {
            return name.toUpperCase().hashCode()^age;
        }
    }
    public static void main(String[] args) {

        // a 为一个引用 b为另一个引用  对象的内容一样 内存地址不一样
        String a = new String("ab");
        String b = new String("ab");

        String aa = "ab";
        String bb = "ab";

        // aa bb 指向同一个内存地址
        if(aa==bb){
            System.out.println("aa==bb");
        }

        if(a == b){
            System.out.println("a==b");
        }

        if(a.equals(b)){
            System.out.println("aEQb");
        }
        if(42==42.0){
            System.out.println("true");
        }


        Person personA = new Person("mjj",11);
        Person personB = new Person("mjj",11);
        Person personC = new Person("peter",111);
        Person personD = new Person("Jack",222);
        Person personE = new Person("MJJ",11);

        HashSet<Person> set = new HashSet<>();
        set.add(personA);
        set.add(personB);
        set.add(personC);
        set.add(personD);

        System.out.println("personA hashcode " + personA.hashCode() + "  personB hashCode " + personB.hashCode() + ", personE hashCode" + personE.hashCode());
        System.out.println(personA.equals(personE));

        System.out.println("set size is " + set.size());
        if(personA.equals(personB)){
            System.out.println("personA equals personB");
        }

        System.out.println(personA.hashCode());
        System.out.println(personB.hashCode());




    }
}
