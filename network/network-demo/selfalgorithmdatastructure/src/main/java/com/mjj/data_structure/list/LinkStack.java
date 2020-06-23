package com.mjj.data_structure.list;

public class LinkStack {

    private LinkList linkList;

    public LinkStack(LinkList linkList) {
        this.linkList = linkList;
    }

    public void push(int value){
        linkList.insertFirst(value,0.00);
    }

    public int pop(){
        if(isEmpty()){
            return -1;
        }else {
            return linkList.deleteFirst().iData;
        }

    }

    public boolean isEmpty(){
        return linkList.isEmpty();
    }

    public void displayStack(){
        linkList.displayLast();
    }


    public static void main(String[] args) {
        LinkStack stack = new LinkStack(new LinkList());

        stack.push(1);
        stack.push(2);

        stack.displayStack();
        System.out.println();

        stack.push(3);
        stack.push(4);

        stack.displayStack();
        System.out.println();
        stack.push(5);
        stack.push(6);

        stack.displayStack();

        stack.pop();
        stack.pop();
        System.out.println();
        stack.displayStack();
    }
}
