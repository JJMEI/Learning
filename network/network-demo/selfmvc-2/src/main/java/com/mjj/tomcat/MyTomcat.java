package com.mjj.tomcat;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyTomcat {

    public static void main(String[] args) throws IOException {
        ServerSocket sever = new ServerSocket(8080);

        while (true){
            Socket socket = sever.accept();

            InputStream in = socket.getInputStream();

            // 怎么从socket inputream 里取出 http协议信息

            // TODO 用socket 封装HTTP请求  例如Servlet规范里的 HttpServletRequest HttpServletResponse

        }
    }
}
