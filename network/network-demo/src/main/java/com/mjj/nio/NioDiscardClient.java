package com.mjj.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class NioDiscardClient {
    public static void startClient() throws IOException {
        SocketChannel socketChannel = SocketChannel.open(new InetSocketAddress("127.0.0.1", 9999));
        socketChannel.configureBlocking(false);

        while (!socketChannel.finishConnect()) {
        }
        System.out.println("客户端连接成功");

        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        for(;;){
            byteBuffer.put("hello world".getBytes());
            byteBuffer.flip();
            socketChannel.write(byteBuffer);

            byteBuffer.clear();
        }

        // 发送到服务器
//        socketChannel.shutdownOutput();
//        socketChannel.close();
    }

    public static void main(String[] args) throws IOException {
        startClient();
    }
}
