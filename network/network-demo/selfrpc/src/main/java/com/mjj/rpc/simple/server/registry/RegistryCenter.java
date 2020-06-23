package com.mjj.rpc.simple.server.registry;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;

/**
 *
 * 注册中心负责
 * @author meijunjie
 */
public class RegistryCenter {

    /**
     * 固定线程池，用于提交来自客户端的请求
     */
    private static final ExecutorService EXECUTOR_SERVICE = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    private static final ScheduledExecutorService FIXED_REATE_EXECUTOR_SERVICE = Executors.newSingleThreadScheduledExecutor();

    private static Map<String,Class> registryCenter = new ConcurrentHashMap<>();

    private static volatile boolean isRunning = true;

    /**
     * 接受的socket连接数
     */
    private static volatile AtomicLong acceptSocketNum = new AtomicLong();


    private final int port;

    public RegistryCenter(final int port){
        this.port = port;
    }

    /**
     * 将服务注册到
     * @param itf
     * @param clazz
     */
    public void registry(Class itf, Class clazz){
        if(itf == null || clazz == null){
            throw new IllegalArgumentException("input argument error!");
        }
        registryCenter.put(itf.getName(),clazz);
    }

    public void start() throws IOException {
        ServerSocket serverSocket = new ServerSocket();
        serverSocket.bind(new InetSocketAddress(port));
        System.out.println("RPC 注册中心启动成功！监听端口: " + port);
        FIXED_REATE_EXECUTOR_SERVICE.scheduleAtFixedRate(() -> System.out.println("系统累计接入的accept Socket Num: " + acceptSocketNum.get()),1,5, TimeUnit.SECONDS);
        try{
            while (isRunning){
                EXECUTOR_SERVICE.execute(new ServiceTask(serverSocket.accept()));
            }
        }finally {
            EXECUTOR_SERVICE.shutdown();
            serverSocket.close();
        }
    }


    /**
     * 取消执行
     */
    public void canecl(){
        synchronized (this){
            if(isRunning){
                isRunning = false;
            }
        }
    }


    private static class ServiceTask implements Runnable{

        // 获取到客户端的socket连接
        Socket client;

        public ServiceTask(Socket client) {
            this.client = client;
            // 当前连接数增加
            acceptSocketNum.incrementAndGet();
        }


        @SuppressWarnings("unchecked")
        @Override
        public void run() {
            ObjectInputStream ois = null;
            ObjectOutputStream oos = null;

            try{
                ois = new ObjectInputStream(client.getInputStream());

                // 1. 读取接口名
                String interfaceName = ois.readUTF();

                // 2. 读取方法名
                String methodName = ois.readUTF();

                // 3. 读取方法参数类型
                Class<?>[] paramTypes = (Class<?>[]) ois.readObject();

                // 4. 读取方法的参数
                Object[] params = (Object[]) ois.readObject();

                // 5. 通过接口名从注册中心获取对应的实现类
                Class serviceImplClazz = registryCenter.get(interfaceName);

                if(serviceImplClazz != null){
                    // 使用反射机制调用对应的方法
                    Method method = serviceImplClazz.getMethod(methodName,paramTypes);
                    if(method != null){
                        Object result = method.invoke(serviceImplClazz.newInstance(),params);

                        oos = new ObjectOutputStream(client.getOutputStream());

                        // 写入输出流到
                        oos.writeObject(result);
                    }else {
                        // 记录错误日志
                    }
                }else {
                    // 记录错误日志
                }

            }catch (IOException e){
                e.printStackTrace();

            } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }finally {
                if(ois != null && oos != null && client != null){
                    try {
                        oos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        ois.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        client.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }


}
