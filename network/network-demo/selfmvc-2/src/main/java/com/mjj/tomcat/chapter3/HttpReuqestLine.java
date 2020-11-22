package com.mjj.tomcat.chapter3;

/**
 * @author meijunjie
 * 封装http请求行
 */
public class HttpReuqestLine {
    /**
     * 请求方法
     */
    private String method;

    /**
     * 请求path路径
     */
    private String path;

    /**
     * 协议
     */
    private String protocol;

    /**
     * 协议版本 1.1 1.0 1.2
     */
    private String version;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "HttpReuqestLine{" +
                "method='" + method + '\'' +
                ", path='" + path + '\'' +
                ", protocol='" + protocol + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
