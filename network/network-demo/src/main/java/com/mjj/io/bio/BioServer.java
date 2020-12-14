package com.mjj.io.bio;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BioServer {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(8000);

        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        new Thread(() -> {
            while (true){
                try{

                    Socket socket = serverSocket.accept();

                    executorService.execute(new Task(socket));


                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }


    private static class Task implements Runnable{

        private Socket socket;

        public Task(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {

            if(socket.isConnected()){
                byte[] data = new byte[1024];
                InputStream inputStream = null;
                try {
                    inputStream = socket.getInputStream();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                while (true){
                    int len;
                    try {
                        while ((len=inputStream.read(data)) != -1){

                            String info = new String(data,0,len);
                            if(info.equals("exit")){
                                System.out.println(socket.getInetAddress() + "_" + socket.getPort() + " 断开");
                                socket.close();
                                System.exit(-1);
                            }else {
                                System.out.println(info);
                            }
                        }

                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }
        }
    }

}
