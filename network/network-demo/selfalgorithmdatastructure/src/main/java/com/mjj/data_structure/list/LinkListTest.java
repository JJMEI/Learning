package com.mjj.data_structure.list;

public class LinkListTest {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();

        linkList.insertFirst(22,2.99);
        linkList.insertFirst(44,4.99);
        linkList.insertFirst(66,6.99);
        linkList.insertFirst(88,8.99);

        linkList.displayLast();
        System.out.println();

        Link f = linkList.find(44);
        if(f!=null){
            System.out.println("found link with key " + f.iData);
        }else {
            System.out.println("can't find link");
        }

        Link d = linkList.delete(66);
        if(d!=null){
            System.out.println("deleted link with key " + d.iData);
        }else {
            System.out.println("can't delete link");
        }
        linkList.displayLast();
    }
}
