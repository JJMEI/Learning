package com.mjj.rpc.simple;

/**
 * Simple RPC 的技术选型
 *  网络通信
 *      JDK 提供的阻塞式IO  ServerSocket
 *      替代方案
 *          netty NioServerChannelSocket  NioLoopGroup
 *
 *  序列化机制
 *      JDK 原生的序列化机制 ObjectInputStream  ObjectOutputStream
 *      替代方案
 *          protobuff protostbuff hessian kryo
 *
 *  动态代理机制
 *      JDK 原生的动态代理 Proxy InvocationHandler
 *      替代方案
 *          CGLIB
 *
 *  方法执行
 *      JDK 反射机制
 *      替代方案
 *          JDK的反射机制存在性能问题
 * @author meijunjie
 */
public class Introduction {
}
