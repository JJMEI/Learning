package com.mjj.data_structure.list;

import java.util.ArrayList;
import java.util.List;

public class LinkList {

    private Link first;

    public LinkList() {
        this.first = null;
    }


    public boolean isEmpty(){
        return first == null;
    }

    public void insertFirst(int id, double dd){
        Link newLink = new Link(id,dd);
        newLink.next = first;
        first = newLink;
    }

    public Link deleteFirst(){
        Link temp = first;
        first = first.next;
        return temp;
    }

    public void displayLast(){
        System.out.println("List (first --> last):");
        Link current = first;
        while (current != null){
            current.dispplayLink();
            current = current.next;
        }
    }

    public Link find(int key){
        if(isEmpty()){
            return null;
        }
        Link current = first;
        while (current.iData != key){
            if(current.next == null){
                return null;
            }else {
                current = current.next;
            }
        }
        return current;
    }


    public Link delete(int key){
        if(isEmpty()){
            return null;
        }

        Link current = first;
        Link previous = first;

        while (current.iData != key){
            if(current.next == null){
                return null;
            }else {
                previous = current;
                current = current.next;
            }
        }

        // 判断当前节点是不是first
        if(current == first){
            first = first.next;
        }else {
            previous.next = current.next;
        }
        return current;
    }

    private static int get(int i){
        if(i==0) return 1;
        int result=1;
        while (i>0){
            result*=2;
            --i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(get(0));
        System.out.println(get(1));
        System.out.println(get(2));
        System.out.println(get(3));


        List<Integer> list = new ArrayList<>();
        list.add(-129);
        list.add((-129));
        int elementNums = list.size();

        boolean isPalindrome = true;
        if(elementNums==1){

        }
        if(elementNums %2!=0){
            isPalindrome= false;
        }
        for(int i=0;i<elementNums/2;i++){
            int a = list.get(i);
            int b = list.get(elementNums - 1 - i);
            if(a != b){
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}
