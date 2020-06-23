package com.mjj.nio;

import org.junit.Test;

import java.nio.IntBuffer;

/**
 * @author meijunjie
 */
public class UseBuffer {

    static IntBuffer intBuffer = null;

    @Test
    public  void allocatTest(){
        intBuffer = IntBuffer.allocate(20);
        System.out.println("position " + intBuffer.position());
        System.out.println("limit " + intBuffer.limit());
        System.out.println("capacity " + intBuffer.capacity());
    }


    @Test
    public void putTest(){

        allocatTest();
        for(int i=0;i<5;i++){
            intBuffer.put(i);
        }

        // 指向第5个元素
        System.out.println("position " + intBuffer.position());
        System.out.println("limit " + intBuffer.limit());
        System.out.println("capacity " + intBuffer.capacity());
    }


    @Test
    public void flipTest(){
        putTest();
        intBuffer.flip();

        System.out.println("after flip---");

        System.out.println("position " + intBuffer.position());
        System.out.println("limit " + intBuffer.limit());
        System.out.println("capacity "+ intBuffer.capacity());
    }
}
