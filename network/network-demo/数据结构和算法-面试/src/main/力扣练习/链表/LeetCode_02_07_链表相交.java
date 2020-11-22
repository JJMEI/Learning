package main.力扣练习.链表;

public class LeetCode_02_07_链表相交 {


    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode first = headA;
        ListNode second = headB;

        while (first != second){
            if(first == null){
                first = headB;

            }else {
                first = first.next;
            }

            if(second == null){
                second = headA;
            }else {
                second = second.next;
            }
        }

        return first;
    }
}
