package com.mjj.gc;

public class OutOfMemoryError {

    public static void main(String[] args) {
        String[] a = new String[Integer.MAX_VALUE];
    }
}
