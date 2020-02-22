package com.mjj.io.bio;

import java.net.Socket;
import java.util.Date;

public class BioClient {

    /**
     * bio client
     * @param args
     */
    public static void main(String[] args) {


        for (int i=0;i<400;i++){
            new Thread(() -> {
                try{
                    Socket socket = new Socket("127.0.0.1",8000);
                    while (true){
                        socket.getOutputStream().write((new Date()+": hello world").getBytes());
                        socket.getOutputStream().flush();
                        Thread.sleep(2000);
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }).start();
        }

    }
}
