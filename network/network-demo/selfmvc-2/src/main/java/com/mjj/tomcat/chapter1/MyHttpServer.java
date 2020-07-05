package com.mjj.tomcat.chapter1;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class MyHttpServer {

    static final String WEB_ROOT = System.getProperty("user.dir") + File.separator + "webroot";
    private static final String SHUT_DOWN = "/SHUTDOWN";
    private boolean shutdown = false;



    public void bootStrap(){
        ServerSocket serverSocket = null;
        int port = 9999;

        try{
            serverSocket = new ServerSocket(port,1024, InetAddress.getByName("127.0.0.1"));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }

        while (!shutdown){
            Socket socket = null;
            InputStream input = null;
            OutputStream output = null;


            try {
                socket = serverSocket.accept();
                input = socket.getInputStream();
                output = socket.getOutputStream();

                // 封装Request
                MyRequest request = new MyRequest(input);
                request.parse();

                MyResponse response = new MyResponse(output);
                response.setRequest(request);

                response.sendStaticResource();

                socket.close();

//                shutdown = request.getUri().equals(SHUT_DOWN);
            } catch (IOException e) {
                e.printStackTrace();
                continue;
            }

        }
    }


    public static void main(String[] args) {
        MyHttpServer httpServer = new MyHttpServer();
        httpServer.bootStrap();
    }


}
