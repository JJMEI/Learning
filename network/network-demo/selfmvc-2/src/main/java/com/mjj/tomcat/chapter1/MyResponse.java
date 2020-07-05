package com.mjj.tomcat.chapter1;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

public class MyResponse {

    private OutputStream outputStream;
    private MyRequest request;

    public MyResponse(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public void setRequest(MyRequest myRequest) {
        this.request = myRequest;
    }

    public void sendStaticResource() {
        byte[] buffer = new byte[1024];
        FileInputStream fis = null;

        try {
            File file = new File(MyHttpServer.WEB_ROOT, request.getUri());


            // 文件存在 且不是目录
            if (file.exists()) {
                fis = new FileInputStream(file);
                int ch = fis.read(buffer, 0, 1024);
                String response = "HTTP/1.1 200 ok\r\n" +
                        "Content-Type: text/html\r\n" +
//                        "Content-Length: " + 102400 + "\r\n" +
                        "\r\n";

                StringBuilder builder = new StringBuilder();

                for (int j = 0; j < ch; j++) {
                    builder.append((char) buffer[j]);
                }
                String result = response + builder.toString();

                System.out.println(result);
                outputStream.write(response.getBytes(), 0, response.getBytes().length);
                while (ch != -1) {
                    outputStream.write(buffer, 0, ch);
                    ch = fis.read(buffer, 0, 1024);
                }
            } else {
                String responseContext = "HTTP/1.1 404 File Not Found\r\n" +
                        "Content-Type: text/html\r\n" +
                        "Content-length: 23 \r\n" +
                        "\r\n" +
                        "<h1>File Not Found</h1>";
                outputStream.write(responseContext.getBytes());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (Exception e) {

                }
            }
        }
    }

}
