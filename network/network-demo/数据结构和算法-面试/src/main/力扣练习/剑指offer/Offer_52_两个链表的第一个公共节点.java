package main.力扣练习.剑指offer;


public class Offer_52_两个链表的第一个公共节点 {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode first = headA;
        ListNode second = headB;

        while (first != second) {
            first = first == null ? headB : first.next;
            second = second == null ? headA : second.next;
        }
        return first;
    }
}
