package com.mjj.rpc.simple.client;



import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.Socket;

public class RpcClintFrame {

    @SuppressWarnings("unchecked")
    public static <T> T getProxyObject(final Class<?> itf){
        InetSocketAddress socketAddress = new InetSocketAddress("127.0.0.1",9999);

        return (T) Proxy.newProxyInstance(itf.getClassLoader(),new Class<?>[]{itf},new DynProxy(socketAddress,itf));
    }

    private static class DynProxy implements InvocationHandler {
        private final InetSocketAddress socketAddress;
        private final Class<?> itf;

        public DynProxy(InetSocketAddress socketAddress, Class<?> itf) {
            this.socketAddress = socketAddress;
            this.itf = itf;
        }

        @Override
        public Object invoke(Object o, Method method, Object[] objects) throws Throwable {

            Socket socket = null;
            ObjectInputStream ois = null;
            ObjectOutputStream oos = null;
            Object result;

            try{
                socket = new Socket();
                socket.connect(socketAddress);
                oos = new ObjectOutputStream(socket.getOutputStream());


                // 1. 输入接口名
                oos.writeUTF(itf.getName());
                // 2. 输入方法名
                oos.writeUTF(method.getName());
                // 3. 输入方法参数类型
                oos.writeObject(method.getParameterTypes());
                // 4. 输入方法参数
                oos.writeObject(objects);
                // 5. 立即刷新参数
                oos.flush();

                ois = new ObjectInputStream(socket.getInputStream());

                // 6. 从输入流中获取执行结果
                result = ois.readObject();
            }finally {
                if(ois != null && oos != null){
                    socket.close();
                    oos.close();
                    ois.close();


                }
            }
            return result;
        }
    }
}
