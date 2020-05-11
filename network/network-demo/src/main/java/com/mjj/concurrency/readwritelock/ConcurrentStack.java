package com.mjj.concurrency.readwritelock;

import java.util.concurrent.atomic.AtomicReference;

public class ConcurrentStack<E> {

    AtomicReference<Node<E>> top = new AtomicReference<>();

    public void push(E item){
        Node<E> newHead = new Node<>(item);
        Node<E> oldHead;

        do{
            oldHead = top.get();
            newHead.next = oldHead;
        }while (!top.compareAndSet(oldHead,newHead));
    }

    public E pop(){
        Node<E> oldHead;
        Node<E> newHead;

        do{
            oldHead = top.get();
            if(oldHead == null){
                return null;
            }
            newHead = oldHead.next;
        }while (!top.compareAndSet(oldHead,newHead));
        return oldHead.item;
    }


    private static class Node<E>{
        public final E item;
        public Node<E> next;

        public Node(E item) {
            this.item = item;
        }
    }


    public static void main(String[] args) {
        ConcurrentStack<String> concurrentStack = new ConcurrentStack<>();
        concurrentStack.push("1");
        concurrentStack.push("2");
        concurrentStack.push("3");

        System.out.println(concurrentStack.pop());
        System.out.println(concurrentStack.pop());
        System.out.println(concurrentStack.pop());

    }
}
