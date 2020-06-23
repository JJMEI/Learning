package com.mjj.nio;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelDemo {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new File("/Users/meijunjie/Desktop/Learning/network/network-demo/src/main/resources/application.properties"));
        File outPut = new File("/Users/meijunjie/Desktop/Learning/network/network-demo/src/main/resources/application-backup.properties");

        if(!outPut.exists()){
            outPut.createNewFile();
        }

        FileChannel inFileChannel = fis.getChannel();
        FileChannel outFileChannel = new FileOutputStream(outPut).getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

        int inLength = 0;
        while ((inLength = inFileChannel.read(byteBuffer))!=-1){
            // 反转
            byteBuffer.flip();

            int outLength = 0;
            while ((outLength = outFileChannel.write(byteBuffer))!=0){
                System.out.println("输入字节数 " + outLength);
            }
            byteBuffer.clear();
        }
        outFileChannel.force(true);



    }
}
