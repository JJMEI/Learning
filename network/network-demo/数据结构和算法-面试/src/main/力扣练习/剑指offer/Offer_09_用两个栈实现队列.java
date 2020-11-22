package main.力扣练习.剑指offer;

import java.util.Stack;

public class Offer_09_用两个栈实现队列 {

    private Stack<Integer> stackA = new Stack<>();

    private Stack<Integer> stackB = new Stack<>();

    public Offer_09_用两个栈实现队列(){

    }


    public void appendTail(int value) {
        stackA.push(value);
    }

    public int deleteHead() {
        if (stackB.isEmpty()) {
            while (!stackA.isEmpty()) {
                stackB.push(stackA.pop());
            }
        }

        if (stackB.isEmpty()) {
            return -1;
        } else {
            return stackB.pop();
        }

    }

    public static void main(String[] args) {
        Offer_09_用两个栈实现队列 queue = new Offer_09_用两个栈实现队列();

        for(int i=0;i<10;i++){
            queue.appendTail(i);
        }
        for(;;){
            Integer message = queue.deleteHead();

            if(message == -1){
                return;
            }else {
                System.out.println(message);
            }

        }
    }
}
