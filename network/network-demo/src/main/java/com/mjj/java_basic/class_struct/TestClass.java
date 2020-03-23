package com.mjj.java_basic.class_struct;

/**
 * @author meijunjie
 */
public class TestClass extends BaseClass {
    private int m;

    private static String staticVariableString = "static Variable";
    private static int staticVariableInt = 11;
    private static final String STATIC_CONSTANT = "Hello World";

    public int inc(){
        return m + 1;
    }
}
