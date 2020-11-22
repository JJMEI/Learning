package main.力扣练习.链表;

import java.util.*;

public class LeetCode_02_01_移除重复节点 {
    public ListNode removeDuplicateNodes(ListNode head) {
        // 借助外部存储
        if (head == null || head.next == null) {
            return head;
        }

        TreeSet<Integer> set = new TreeSet<>();
        set.add(head.val);

        ListNode sentinel = head;

        while (head.next != null) {

            // 该节点曾经出现过
            if (set.contains(head.next.val)) {

                // 删除 head.next节点
                head.next = head.next.next;

            } else {
              set.add(head.next.val);

            }

            head = head.next;


        }



        return sentinel;
    }


    public ListNode removeDuplicateNodesV2(ListNode head) {
        // 借助外部存储
        if (head == null || head.next == null) {
            return head;
        }

        ListNode first = head;
        ListNode second = head.next;

        while (second != null){

            //
            if(second.val == first.val){
                if(second.next !=null){
                    second.val = second.next.val;
                    second.next = second.next.next;
                }
            }else {
                second = second.next;
            }
        }

        return first;
    }




}
