package org.test;

import org.apache.commons.lang3.StringUtils;

import java.util.Locale;

/**
 * Created by meijunjie on 2018/8/23.
 */
public class Test {
    public static void main(String[] args){


        String exception1 = "TencentVuidServiceImpl--> Get vuid error! userId=217620751,exceptionInfo=org.jfaster.mango.transaction.exception.CannotGetJdbcConnectionException: Could not get JDBC Connection; caused by: HikariPool-1 - Connection is not available, request timed out after 2826ms.";
        String exception2 = "TencentVuidServiceImpl--> Get vuid error! userId=234995282,exceptionInfo=org.jfaster.mango.transaction.exception.CannotGetJdbcConnectionException: Could not get JDBC Connection; caused by: HikariPool-1 - Connection is not available, request timed out after 3531ms.";


        System.out.println(StringUtils.getFuzzyDistance(exception1,exception2, Locale.ENGLISH));

        System.out.println(StringUtils.getLevenshteinDistance(exception1,exception2));

        // Jaro Distance Jaro距离 计算字符串相似性的度量方式 Jaro距离越高文本相似性越高
        System.out.println(StringUtils.getJaroWinklerDistance(exception1,exception2));



        String exception3 = "HttpClientUtils--> Get url failed! url=http://yuanxian.letv.cn/letv/vip2.ldo?sign=caea8e6ff0fba2a9ad4780df8e935aa8×tamp=1535014458847&terminal=141007&userId=86831491&businessId=10041&type=info&country=86, exceptionInfo=java.net.SocketTimeoutException: Read timed out at java.net.SocketInputStream.socketRead0(Native Method) at java.net.SocketInputStream.read(SocketInputStream.java:150) at java.net.SocketInputStream.read(SocketInputStream.java:121) at org.apache.http.impl.io.SessionInputBufferImpl.streamRead(SessionInputBufferImpl.java:136) at org.apache.http.impl.io.SessionInputBufferImpl.fillBuffer(SessionInputBufferImpl.java:152) at org.apache.http.impl.io.SessionInputBufferImpl.readLine(SessionInputBufferImpl.java:270) at org.apache.http.impl.conn.DefaultHttpResponseParser.parseHead(DefaultHttpResponseParser.java:140) at org.apache.http.impl.conn.DefaultHttpResponseParser.parseHead(DefaultHttpResponseParser.java:57) at org.apache.http.impl.io.AbstractMessageParser.parse(AbstractMessageParser.java:260) at org.apache.http.impl.DefaultBHttpClientConnection.receiveResponseHeader(DefaultBHttpClientConnection.java:161) at org.apache.http.impl.conn.CPoolProxy.receiveResponseHeader(CPoolProxy.java:153) at org.apache.http.protocol.HttpRequestExecutor.doReceiveResponse(HttpRequestExecutor.java:271) at org.apache.http.protocol.HttpRequestExecutor.execute(HttpRequestExecutor.java:123) at org.apache.http.impl.execchain.MainClientExec.execute(MainClientExec.java:254) at org.apache.http.impl.execchain.ProtocolExec.execute(ProtocolExec.java:195) at org.apache.http.impl.execchain.RetryExec.execute(RetryExec.java:86) at org.apache.http.impl.execchain.RedirectExec.execute(RedirectExec.java:108) at org.apache.http.impl.client.InternalHttpClient.doExecute(InternalHttpClient.java:184) at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:82) at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:106) at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:57) at com.letv.yuanxian.ecommerce.openapi.utils.HttpClientUtils.get(HttpClientUtils.java:73) at com.letv.yuanxian.ecommerce.openapi.utils.QueryYuanXianUtils.queryYuanXian(QueryYuanXianUtils.java:69) at com.letv.yuanxian.ecommerce.openapi.common.VipCacheService.loadData(VipCacheService.java:47) at com.letv.yuanxian.ecommerce.openapi.common.VipCacheService.loadData(VipCacheService.java:17) at com.letv.yuanxian.ecommerce.openapi.common.LocalCacheBaseService$2.load(LocalCacheBaseService.java:33) at com.google.common.cache.LocalCache$LoadingValueReference.loadFuture(LocalCache.java:3628) at com.google.common.cache.LocalCache$Segment.loadSync(LocalCache.java:2336) at com.google.common.cache.LocalCache$Segment.lockedGetOrLoad(LocalCache.java:2295) at com.google.common.cache.LocalCache$Segment.get(LocalCache.java:2208) at com.google.common.cache.LocalCache.get(LocalCache.java:4053) at com.google.common.cache.LocalCache.getOrLoad(LocalCache.java:4057) at com.google.common.cache.LocalCache$LocalLoadingCache.get(LocalCache.java:4986) at com.google.common.cache.LocalCache$LocalLoadingCache.getUnchecked(LocalCache.java:4992) at com.letv.yuanxian.ecommerce.openapi.common.LocalCacheBaseService.getCache(LocalCacheBaseService.java:49) at com.letv.yuanxian.ecommerce.openapi.controller.BaseController.getYuanxianMemberTimeByProductId(BaseController.java:298) at com.letv.yuanxian.ecommerce.openapi.controller.BaseController.getVipInfosByVendorNo(BaseController.java:175) at com.letv.yuanxian.ecommerce.openapi.controller.VipQueryController.getTimeAllForServer(VipQueryController.java:89) at sun.reflect.GeneratedMethodAccessor58.invoke(Unknown Source) at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) at java.lang.reflect.Method.invoke(Method.java:601) at org.springframework.web.method.support.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:221) at org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:137) at org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:104) at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandleMethod(RequestMappingHandlerAdapter.java:747) at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:676) at org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:85) at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:938) at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:870) at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:961) at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:852) at javax.servlet.http.HttpServlet.service(HttpServlet.java:620) at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:837) at javax.servlet.http.HttpServlet.service(HttpServlet.java:727) at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:303) at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:208) at org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:52) at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:241) at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:208) at com.navimind.framework.security.SignFilter.doFilter(SignFilter.java:76) at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:241) at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:208) at com.navimind.framework.security.SsoFilter.doFilter(SsoFilter.java:73) at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:241) at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:208) at org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:88) at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:107) at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:241) at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:208) at org.apache.catalina.core.StandardWrapperValve.invoke(StandardWrapperValve.java:220) at org.apache.catalina.core.StandardContextValve.invoke(StandardContextValve.java:122) at org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:503) at org.apache.catalina.core.StandardHostValve.invoke(StandardHostValve.java:170) at org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:103) at org.apache.catalina.core.StandardEngineValve.invoke(StandardEngineValve.java:116) at org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:421) at org.apache.coyote.http11.AbstractHttp11Processor.process(AbstractHttp11Processor.java:1070) at org.apache.coyote.AbstractProtocol$AbstractConnectionHandler.process(AbstractProtocol.java:611) at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1736) at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.run(NioEndpoint.java:1695) at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1145) at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:615) at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) at java.lang.Thread.run(Thread.java:722)";
        String exception4 = "HttpClientUtils--> Get url failed! url=http://yuanxian.letv.cn/letv/vip2.ldo?sign=d343e63f6c7b2f075492492eb3a7f239×tamp=1535014111018&deviceKey=7fa2c456ebd1cLE075B1116150028411&terminal=141007&userId=230522938&mac=B01BD20B93FC&businessId=10041&type=info&country=86, exceptionInfo=java.net.SocketTimeoutException: Read timed out at java.net.SocketInputStream.socketRead0(Native Method) at java.net.SocketInputStream.read(SocketInputStream.java:150) at java.net.SocketInputStream.read(SocketInputStream.java:121) at org.apache.http.impl.io.SessionInputBufferImpl.streamRead(SessionInputBufferImpl.java:136) at org.apache.http.impl.io.SessionInputBufferImpl.fillBuffer(SessionInputBufferImpl.java:152) at org.apache.http.impl.io.SessionInputBufferImpl.readLine(SessionInputBufferImpl.java:270) at org.apache.http.impl.conn.DefaultHttpResponseParser.parseHead(DefaultHttpResponseParser.java:140) at org.apache.http.impl.conn.DefaultHttpResponseParser.parseHead(DefaultHttpResponseParser.java:57) at org.apache.http.impl.io.AbstractMessageParser.parse(AbstractMessageParser.java:260) at org.apache.http.impl.DefaultBHttpClientConnection.receiveResponseHeader(DefaultBHttpClientConnection.java:161) at org.apache.http.impl.conn.CPoolProxy.receiveResponseHeader(CPoolProxy.java:153) at org.apache.http.protocol.HttpRequestExecutor.doReceiveResponse(HttpRequestExecutor.java:271) at org.apache.http.protocol.HttpRequestExecutor.execute(HttpRequestExecutor.java:123) at org.apache.http.impl.execchain.MainClientExec.execute(MainClientExec.java:254) at org.apache.http.impl.execchain.ProtocolExec.execute(ProtocolExec.java:195) at org.apache.http.impl.execchain.RetryExec.execute(RetryExec.java:86) at org.apache.http.impl.execchain.RedirectExec.execute(RedirectExec.java:108) at org.apache.http.impl.client.InternalHttpClient.doExecute(InternalHttpClient.java:184) at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:82) at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:106) at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:57) at com.letv.yuanxian.ecommerce.openapi.utils.HttpClientUtils.get(HttpClientUtils.java:73) at com.letv.yuanxian.ecommerce.openapi.utils.QueryYuanXianUtils.queryYuanXian(QueryYuanXianUtils.java:69) at com.letv.yuanxian.ecommerce.openapi.common.VipCacheService.loadData(VipCacheService.java:47) at com.letv.yuanxian.ecommerce.openapi.common.VipCacheService.loadData(VipCacheService.java:17) at com.letv.yuanxian.ecommerce.openapi.common.LocalCacheBaseService$2.load(LocalCacheBaseService.java:33) at com.google.common.cache.LocalCache$LoadingValueReference.loadFuture(LocalCache.java:3628) at com.google.common.cache.LocalCache$Segment.loadSync(LocalCache.java:2336) at com.google.common.cache.LocalCache$Segment.lockedGetOrLoad(LocalCache.java:2295) at com.google.common.cache.LocalCache$Segment.get(LocalCache.java:2208) at com.google.common.cache.LocalCache.get(LocalCache.java:4053) at com.google.common.cache.LocalCache.getOrLoad(LocalCache.java:4057) at com.google.common.cache.LocalCache$LocalLoadingCache.get(LocalCache.java:4986) at com.google.common.cache.LocalCache$LocalLoadingCache.getUnchecked(LocalCache.java:4992) at com.letv.yuanxian.ecommerce.openapi.common.LocalCacheBaseService.getCache(LocalCacheBaseService.java:49) at com.letv.yuanxian.ecommerce.openapi.controller.BaseController.getYuanxianMemberTimeByProductId(BaseController.java:298) at com.letv.yuanxian.ecommerce.openapi.controller.BaseController.getVipInfosByVendorNo(BaseController.java:175) at com.letv.yuanxian.ecommerce.openapi.controller.VipQueryController.getTimeAllForServer(VipQueryController.java:89) at sun.reflect.GeneratedMethodAccessor58.invoke(Unknown Source) at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) at java.lang.reflect.Method.invoke(Method.java:601) at org.springframework.web.method.support.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:221) at org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:137) at org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:104) at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandleMethod(RequestMappingHandlerAdapter.java:747) at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:676) at org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:85) at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:938) at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:870) at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:961) at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:852) at javax.servlet.http.HttpServlet.service(HttpServlet.java:620) at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:837) at javax.servlet.http.HttpServlet.service(HttpServlet.java:727) at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:303) at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:208) at org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:52) at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:241) at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:208) at com.navimind.framework.security.SignFilter.doFilter(SignFilter.java:76) at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:241) at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:208) at com.navimind.framework.security.SsoFilter.doFilter(SsoFilter.java:73) at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:241) at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:208) at org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:88) at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:107) at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:241) at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:208) at org.apache.catalina.core.StandardWrapperValve.invoke(StandardWrapperValve.java:220) at org.apache.catalina.core.StandardContextValve.invoke(StandardContextValve.java:122) at org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:503) at org.apache.catalina.core.StandardHostValve.invoke(StandardHostValve.java:170) at org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:103) at org.apache.catalina.core.StandardEngineValve.invoke(StandardEngineValve.java:116) at org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:421) at org.apache.coyote.http11.AbstractHttp11Processor.process(AbstractHttp11Processor.java:1070) at org.apache.coyote.AbstractProtocol$AbstractConnectionHandler.process(AbstractProtocol.java:611) at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1736) at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.run(NioEndpoint.java:1695) at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1145) at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:615) at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) at java.lang.Thread.run(Thread.java:722)";

        System.out.println(StringUtils.getJaroWinklerDistance(exception3,exception4));


        // 局部敏感hash  SimHash 计算文本相似度

        // LDA实现


    }
}
