package com.mjj.tomcat.chapter2;

/**
 * TODO 静态资源处理器
 * @author meijunjie
 */
public class StaticResourceProcessor {

    public void process(Request request, Response response){
        try{
            response.sendStaticResource(request, response);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
