package com.mjj.spring.self.spring.aop.dynamic_proxy;

public class Player {

    public void play(){
        System.out.println("say hello... hello");
    }

    public void play(String songName){
        System.out.println("i am sing a " + songName);
        throw new IllegalArgumentException("error " + songName);
    }
}
