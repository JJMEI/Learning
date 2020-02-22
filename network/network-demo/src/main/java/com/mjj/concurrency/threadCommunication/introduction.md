```text
针对JDK内置锁synchronized锁，JDK提供了
wait notify notifyAll  这些方法都是基于Object类
    调用Object.wait()方法后，当前线程会在这个对象上等待；一直等待到其他线程
    调用了该对象对应的notifyAll方法时
    
    notify 随机唤醒一个
    notifyAll  全部唤醒
    
    被作为锁的对象上，维护了两个队列，object.wait() 等待队列
    
    【t4】【t3】【t2】
    notify 随机选一个等待的线程
    notifyAll 获取所有的线程 唤醒后他们开始挣强 锁
    
    
    
    等待线程结束 join   谦让yeild
    当一个线程A的输入依赖线程B执行完毕，如何能让A线程等待B线程执行完毕
    {
        threadB.start();
        threadB.join();
        
        threadA.start();

    }
    
    
    yeild方法是一个静态方法， 不释放锁，让出cpu时间片，让出过后还进行cpu资源争夺，
    能否分派到cpu时间片就不一定
    
    
    yeild  让出cpu时间片 不释放锁
    sleep  线程进入睡眠状态 不会释放锁
    wait   必须获取到锁，执行后释放锁，进入锁的等待队列，方法被notify返回重新拿到锁
    notify 必须拿到锁才能执行，执行后不会立马释放锁，通知等待队列中的某一个线程，
            同步代码块执行完毕才会释放锁，本身是不会释放锁的
```