package com.mjj.concurrency.executor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class TaskExecutionWebServer {
    private static final int NTHREADS = 100;
    private static final Executor executor = Executors.newFixedThreadPool(NTHREADS);

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        while (true){
            final Socket connection = serverSocket.accept();

            executor.execute(() -> {
                System.out.println(connection.toString());
                try {
                    connection.getOutputStream().write(11);
                    connection.getOutputStream().flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
