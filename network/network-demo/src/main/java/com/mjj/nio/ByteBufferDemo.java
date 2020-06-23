package com.mjj.nio;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;

public class ByteBufferDemo {

    public static void main(String[] args) {


        /**
         * capacity 容量不是指内存块byte[]字节数组的字节数量。capacity容量指的是写入数据对象的数量
         *
         * position标识当前的位置，position属性与缓冲区的读写模式有关。在不同模式下，position属性的值是不同的。
         * 当缓冲区进行读写模式的改变时，position会进行调整
         */
        DoubleBuffer buffer = DoubleBuffer.allocate(100);

        for(int i=0;i<101;i++){
            buffer.put(new Double(i));
        }
    }
}
