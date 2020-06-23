package com.mjj.data_structure.list;

public class SortedLink {
    class Link{
        public long iData;
        public Link next;

        public Link(long iData) {
            this.iData = iData;
        }
    }


    private Link first;

    public SortedLink() {
        this.first = null;
    }

    public void insert(long key){
        Link newLink = new Link(key);
        Link previous = null;
        Link current = first;

        while (current != null && key < current.iData){
            previous = current;
            current = current.next;
        }

        // 空节点
        if(previous == null){
            first = newLink;
        }else {
            previous.next = newLink;
        }
        newLink.next = current;
    }


    public Link remove(){
        if(isEmpty()){
            return null;
        }

        Link temp = first;
        first = first.next;
        return temp;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void display(){
        Link current = first;
        while (current != null){
            System.out.print(current.iData + " --> ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        SortedLink s = new SortedLink();
        s.insert(1);
        s.insert(2);
        s.insert(3);
        s.insert(4);
        s.insert(1);
        s.insert(3);
        s.insert(33);
        s.insert(444);

        s.display();

        s.remove();
        System.out.println();
        s.display();
    }
}
