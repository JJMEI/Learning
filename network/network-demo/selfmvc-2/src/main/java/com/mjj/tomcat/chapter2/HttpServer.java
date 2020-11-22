package com.mjj.tomcat.chapter2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer {

    private static final String SHUTDOWN_COMMAND = "/SHUTDOWN";

    private boolean shutdown = false;

    public void bootstrap(){
        ServerSocket serverSocket = null;
        int port = 8080;
        try{
            serverSocket = new ServerSocket(port,1, InetAddress.getByName("127.0.0.1"));
        }catch (Exception e){
            e.printStackTrace();
            System.exit(1);
        }

        Socket socket;
        InputStream input;
        OutputStream output;

        while (true){
            try{
                socket = serverSocket.accept();
                input = socket.getInputStream();
                output = socket.getOutputStream();

                Request request = new Request(input);
                request.parse();

                Response response = new Response(output);
                response.setRequest(request);

                // 进行派发
                if(request.getUri().contains("/servlet")){
                    // TODO 使用ServletProcessor

                    ServletProcessor processor = new ServletProcessor();
                    processor.process(request,response);
                }else {
                    // TODO 使用 StaticResourceProcessor
                    StaticResourceProcessor processor = new StaticResourceProcessor();
                    processor.process(request,response);
                }

                socket.close();
                shutdown = request.getUri().equals(SHUTDOWN_COMMAND);

            } catch (IOException e) {
                e.printStackTrace();
                continue;
            }
        }
    }
}
