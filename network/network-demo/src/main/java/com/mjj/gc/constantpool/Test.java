package com.mjj.gc.constantpool;


//
//Constant pool:
//        #1 = Methodref          #10.#24        // java/lang/Object."<init>":()V
//        #2 = String             #25            // hello
//        #3 = Fieldref           #9.#26         // com/mjj/gc/constantpool/Test.str:Ljava/lang/String;
//        #4 = Fieldref           #9.#27         // com/mjj/gc/constantpool/Test.nn:I
//        #5 = Methodref          #28.#29        // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
//        #6 = Fieldref           #9.#30         // com/mjj/gc/constantpool/Test.mm:Ljava/lang/Integer;
//        #7 = Fieldref           #31.#32        // java/lang/System.out:Ljava/io/PrintStream;
//        #8 = Methodref          #33.#34        // java/io/PrintStream.println:(I)V
//        #9 = Class              #35            // com/mjj/gc/constantpool/Test
//        #10 = Class              #36            // java/lang/Object
//        #11 = Utf8               str
//        #12 = Utf8               Ljava/lang/String;
//        #13 = Utf8               nn
//        #14 = Utf8               I
//        #15 = Utf8               mm
//        #16 = Utf8               Ljava/lang/Integer;
//        #17 = Utf8               <init>
//            #18 = Utf8               ()V
//          #19 = Utf8               Code
//          #20 = Utf8               LineNumberTable
//          #21 = Utf8               aa
//          #22 = Utf8               SourceFile
//          #23 = Utf8               Test.java
//          #24 = NameAndType        #17:#18        // "<init>":()V
//          #25 = Utf8               hello
//          #26 = NameAndType        #11:#12        // str:Ljava/lang/String;
//          #27 = NameAndType        #13:#14        // nn:I
//          #28 = Class              #37            // java/lang/Integer
//          #29 = NameAndType        #38:#39        // valueOf:(I)Ljava/lang/Integer;
//          #30 = NameAndType        #15:#16        // mm:Ljava/lang/Integer;
//          #31 = Class              #40            // java/lang/System
//          #32 = NameAndType        #41:#42        // out:Ljava/io/PrintStream;
//          #33 = Class              #43            // java/io/PrintStream
//          #34 = NameAndType        #44:#45        // println:(I)V
//          #35 = Utf8               com/mjj/gc/constantpool/Test
//          #36 = Utf8               java/lang/Object
//          #37 = Utf8               java/lang/Integer
//          #38 = Utf8               valueOf
//          #39 = Utf8               (I)Ljava/lang/Integer;
//          #40 = Utf8               java/lang/System
//          #41 = Utf8               out
//          #42 = Utf8               Ljava/io/PrintStream;
//          #43 = Utf8               java/io/PrintStream
//          #44 = Utf8               println
//          #45 = Utf8               (I)V

public class Test {
    private String str = "hello";

    private int nn = 22;
    private Integer mm = 333;

    void aa(){
        System.out.println(3333);
    }
}
