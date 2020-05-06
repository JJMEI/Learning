package com.mjj.algorithm.list.splitListFromK;

import com.mjj.algorithm.list.mergeTwoSortedList.ListNode;

import java.util.List;

public class SplitListFromK {


    /**
     * 暴力方法  使用 先将list反转再截取 第k个  应该使用快慢指针来实现
     *
     *
     * @param head
     * @param k
     * @return
     */
    public static ListNode getKthFromEnd(ListNode head, int k) {
        ListNode reveredHead = reveredList(head);
        int i = 1;
        ListNode dummy = new ListNode(0);
        ListNode result = dummy;
        while(i<=k){
            dummy.next = reveredHead;
            reveredHead = reveredHead.next;
            dummy = dummy.next;
            ++i;
        }
        dummy.next = null;
        return reveredList(result.next);
    }

    private static ListNode reveredList(ListNode node){
        ListNode pre = null;
        ListNode temp;
        ListNode current = node;
        while(current != null){
            temp = current.next;
            current.next = pre;
            pre = current;
            current = temp;
        }
        return pre;
    }


    /**
     * 使用快慢指针，首先快指针走k步  则剩下了 n-k 步
     * 接下来慢指针 走剩余的n-k步，即n-(n-k) 刚好剩下k步
     * @param head
     * @param k
     * @return
     */
    public static ListNode getKthFromEndUseQuickAndSlowPointer(ListNode head, int k){

        ListNode front = head;
        ListNode behind = head;

        while (front != null && k >0){
            front = front.next;
            k--;
        }
        while (front!=null){
            front = front.next;
            behind = behind.next;
        }
        return behind;


    }
}
