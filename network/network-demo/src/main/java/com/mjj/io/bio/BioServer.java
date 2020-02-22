package com.mjj.io.bio;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class BioServer {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(8000);

        new Thread(() -> {
            while (true){
                try{

                    // 阻塞方法获取新的连接
                    Socket socket = serverSocket.accept();

                    // 每个连接都启用一个新的线程处理
                    new Thread(() -> {
                        try{
                            byte[] data = new byte[1024];
                            InputStream inputStream = socket.getInputStream();
                            while (true){
                                int len;
                                while ((len=inputStream.read(data)) != -1){
                                    System.out.println(new String(data,0,len));
                                }
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }).start();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

}
