package com.mjj.gc;

public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        int i=0;
        for(;;){
            ("dddddddcccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccdddddddd"+(++i)).intern();
        }
    }
}
