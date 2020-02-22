//package com.mjj.net.network.nio;
//
//import java.io.IOException;
//import java.nio.channels.Selector;
//import java.nio.channels.ServerSocketChannel;
//
//public class NioServer {
//    public static void main(String[] args) throws IOException {
//        Selector serverSelector = Selector.open();
//        Selector clientSelector = Selector.open();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                ServerSocketChannel listenerChannel = ServerSocketChannel.open();
//            }
//        }).start();
//
//    }
//}
