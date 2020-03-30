package com.mjj.demo;


import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContextBuilder;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import javax.net.ssl.SSLContext;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Map;


/**
 * Created by meijunjie on 2018/1/30.
 * @author meijunjie
 */
public class HttpsUtil {
    private static int HTTPUTILS_SOCKET_TIMEOUT = 1000;
    private static int HTTPUTILS_CONNECTION_TIMEOUT = 1000;

    /**
     * 创建 HTTPS 链接客户端,默认信任证书,不跟随重定向
     *
     * @return HTTP 连接
     */
    private static CloseableHttpClient createHttpsClient()
            throws KeyStoreException, NoSuchAlgorithmException, KeyManagementException {
        SSLContext sslContext = new SSLContextBuilder()
                .loadTrustMaterial(null, new TrustStrategy() {
                    @Override
                    public boolean isTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
                        return true;
                    }
                }).build();
        SSLConnectionSocketFactory sslConnectionSocketFactory = new SSLConnectionSocketFactory(sslContext);
        return HttpClients.custom()
                .setUserAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.84 Safari/537.36")
                .setSSLSocketFactory(sslConnectionSocketFactory)
                .build();
    }

    /**
     * 发送 get 请求
     *
     * @param url     请求 url
     * @param headers 请求头数组
     * @return 响应结果字符串
     * @throws NoSuchAlgorithmException
     * @throws KeyStoreException
     * @throws KeyManagementException
     * @throws IOException
     */
    public static String get(String url, Header[] headers, int socketTimeout, int connTimeout)
            throws NoSuchAlgorithmException, KeyStoreException, KeyManagementException, IOException {
        CloseableHttpClient httpClient = createHttpsClient();
        HttpGet httpGet = new HttpGet(url);
        httpGet.setHeaders(headers);
        RequestConfig.Builder builder = RequestConfig.custom()
                .setSocketTimeout(socketTimeout > 0 ? socketTimeout : HTTPUTILS_SOCKET_TIMEOUT)
                .setConnectTimeout(connTimeout > 0 ? connTimeout : HTTPUTILS_CONNECTION_TIMEOUT);

        httpGet.setConfig(builder.build());
        HttpResponse httpResponse = httpClient.execute(httpGet);
        String result = entity2String(httpResponse.getEntity());

        // 关闭资源
        httpClient.close();
        httpGet.releaseConnection();
        return result;
    }

    /**
     * 发送 get 请求
     *
     * @param url 请求 url
     * @return 响应结果字符串
     * @throws NoSuchAlgorithmException
     * @throws KeyStoreException
     * @throws KeyManagementException
     * @throws IOException
     */
    public static String get(String url, Map<String,String> parameters,int connectTimeOut)
            throws NoSuchAlgorithmException, KeyStoreException, KeyManagementException, IOException {
        String requestUrl = getUrl(url, parameters);
        return get(requestUrl,null,connectTimeOut,connectTimeOut);
    }

    /**
     * 发送 post 请求
     *
     * @param url     请求 url
     * @param headers 请求头
     * @param entity  请求实体
     * @return 响应结果字符串
     * @throws NoSuchAlgorithmException
     * @throws KeyStoreException
     * @throws KeyManagementException
     * @throws IOException
     */
    public static String post(String url, Header[] headers, HttpEntity entity)
            throws NoSuchAlgorithmException, KeyStoreException, KeyManagementException, IOException {
        CloseableHttpClient httpClient = createHttpsClient();
        HttpPost httpPost = new HttpPost(url);
        httpPost.setHeaders(headers);
        httpPost.setEntity(entity);
        HttpResponse httpResponse = httpClient.execute(httpPost);
        String result = entity2String(httpResponse.getEntity());

        // 关闭资源
        httpClient.close();
        httpPost.releaseConnection();
        return result;
    }

    /**
     * 发送 post 请求
     *
     * @param url 请求 url
     * @return 响应结果字符串
     * @throws NoSuchAlgorithmException
     * @throws KeyStoreException
     * @throws KeyManagementException
     * @throws IOException
     */
    public static String post(String url, Map<String,String> parameters)
            throws IOException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
        String requestUrl = getUrl(url, parameters);
        return post(requestUrl, null, null);
    }

    /**
     * 发送 post 请求
     *
     * @param url     请求 url
     * @param headers 请求头
     * @return 响应结果字符串
     * @throws NoSuchAlgorithmException
     * @throws KeyStoreException
     * @throws KeyManagementException
     * @throws IOException
     */
    public static String post(String url, Header[] headers)
            throws IOException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
        return post(url, headers, null);
    }

    /**
     * 发送 post 请求
     *
     * @param url    请求 url
     * @param entity 请求体
     * @return 响应结果字符串
     * @throws NoSuchAlgorithmException
     * @throws KeyStoreException
     * @throws KeyManagementException
     * @throws IOException
     */
    public static String post(String url, HttpEntity entity)
            throws IOException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
        return post(url, null, entity);
    }

    /**
     * 将响应实体拼接成字符串返回
     *
     * @param entity 响应实体
     * @return 实体字符串
     */
    private static String entity2String(HttpEntity entity) {
        StringBuilder content = new StringBuilder();
        try (InputStream inputStream = entity.getContent();
             InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            // 读取数据
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    public static String getUrl(String originalUrl, Map<String,String> parameters) throws IllegalArgumentException{
        if(StringUtils.isEmpty(originalUrl) || MapUtils.isEmpty(parameters)){
            throw new IllegalArgumentException("参数非法");
        }


            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(originalUrl+"?");
            for(Map.Entry mapEntry : parameters.entrySet()){
                String key = (String) mapEntry.getKey();
                String value= parameters.get(key);
                stringBuilder.append(key+"=").append(value+"&");
            }
            String temp = stringBuilder.toString();

            return temp.substring(0,temp.length()-1);
    }


}
