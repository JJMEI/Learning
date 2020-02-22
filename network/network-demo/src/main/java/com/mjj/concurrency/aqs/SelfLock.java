package com.mjj.concurrency.aqs;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class SelfLock implements Lock {

    // state 表示获取到锁 state=1    state=0表示没拿到

    private static class Sync extends AbstractQueuedSynchronizer{

        @Override
        protected boolean isHeldExclusively() {
            return getState() == 1;
        }


        @Override
        protected boolean tryAcquire(int arg) {

            // 拿的时候使用CAS
            if(compareAndSetState(0,1)){

                // 当前线程持有锁
                setExclusiveOwnerThread(Thread.currentThread());

                return true;
            }
            return false;
        }

        @Override
        protected boolean tryRelease(int arg) {

            // 只有持有当前状态的线程才能释放
            if(getState() == 0){
                throw new UnsupportedOperationException();
            }

            setExclusiveOwnerThread(null);
            setState(0);
            return true;
        }

        Condition newCondition(){
            return new ConditionObject();
        }

    }



    private final Sync sync = new Sync();


    @Override
    public void lock() {
        sync.acquire(1);
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {
        sync.acquireInterruptibly(1);
    }

    @Override
    public boolean tryLock() {
        return sync.tryAcquire(1);
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public void unlock() {
        sync.release(0);
    }

    @Override
    public Condition newCondition() {
        return sync.newCondition();
    }
}
