package com.mjj.tomcat.chapter1;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MyRequest {
    private InputStream inputStream;
    private String uri;

    public MyRequest(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public String getUri(){
        return uri;
    }

    public void parse(){
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        try {
            while ((line = br.readLine()) != null){
                // 获取到请求行

                uri = parseUri(line);
                break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String parseUri(String requestLine) {
        if(StringUtils.isNotBlank(requestLine)){
            String[] lines = requestLine.split(" ");
            return lines[1];
        }
        return null;
    }

}
