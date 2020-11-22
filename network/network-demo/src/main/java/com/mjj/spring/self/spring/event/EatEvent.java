package com.mjj.spring.self.spring.event;

import org.springframework.context.ApplicationEvent;

public class EatEvent extends ApplicationEvent {


    private boolean eatFinished;

    public EatEvent(boolean eatFinished){
        super(eatFinished);
        this.eatFinished = eatFinished;
    }

    public void callGirlFriend(){
        System.out.println("吃完饭了  来收拾收拾吧");
    }

    public void callBrothers(){

    }
}
