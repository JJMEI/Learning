package com.mjj.concurrency.startThread;

import java.util.concurrent.Callable;

public class UseImplCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "use impl callable start thread";
    }
}
