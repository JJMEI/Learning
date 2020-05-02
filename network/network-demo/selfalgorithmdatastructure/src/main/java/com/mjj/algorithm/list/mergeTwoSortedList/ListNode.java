package com.mjj.algorithm.list.mergeTwoSortedList;

import com.mjj.algorithm.list.reveredList.ReveredList;

/**
 * @author meijunjie
 */
public class ListNode {
    public int val;
    public ListNode next;
    ListNode(int val){
        this.val = val;
    }


    public static String print(ListNode node){

        StringBuilder sb = new StringBuilder();
        ListNode dummyNode = node;
        while (dummyNode != null){
            sb.append(dummyNode.val).append("-->");
            dummyNode = dummyNode.next;
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(5);

        System.out.println(ListNode.print(head));

        System.out.println(ListNode.print(ReveredList.reveredListVersion1(head)));
    }
}
