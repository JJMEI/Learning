package com.mjj.tomcat.chapter3;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpConnector implements Runnable {

    boolean stopped;

    private String schme = "http";


    public String getSchme() {
        return schme;
    }


    @Override
    public void run() {
        ServerSocket serverSocket = null;
        int port = 8080;

        try{
            serverSocket = new ServerSocket(port,1024, InetAddress.getByName("127.0.0.1"));

        }catch (Exception e){
            e.printStackTrace();
            System.exit(1);
        }

        while (!stopped){
            Socket socket = null;

            try{
                socket = serverSocket.accept();
            }catch (Exception e){
                e.printStackTrace();
                continue;
            }
        }
    }

    public void start(){
        Thread thread = new Thread(this);
        thread.start();
    }
}
