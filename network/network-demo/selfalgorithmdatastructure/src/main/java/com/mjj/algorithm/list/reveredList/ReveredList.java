package com.mjj.algorithm.list.reveredList;


import com.mjj.algorithm.list.mergeTwoSortedList.ListNode;

/**
 * 反转链表
 *
 * 1->2->3->4->5->null
 *
 * result
 *  5->4->3->2->1->null
 */
public class ReveredList {



    public static ListNode reveredListVersion1(ListNode head) {
        // 虚拟节点
        ListNode pre = null;

        // 当前节点
        int i = 0;
        ListNode current = head;
        while (current != null){
            // 1. 第1步保存当前节点的下个节点
            ListNode nextTempNode = current.next;

//            System.out.print("第" + ++i + "趟,保存当前节点的后继节点" + nextTempNode.val);

            // 2. 第2步 断开当前节点的后继，使其指向虚拟节点
            current.next = pre;
//            System.out.print("   " + "断开当前节点的后继，使其指向哨兵节点" + (pre == null ? null : pre.val));
            // 3. 第3步 移动 虚拟指针 使其指向当前节点
            pre = current;

//            System.out.print("   " + "移动哨兵节点指向当前节点 " + pre.val);

            // 4. 第4步 移动当前节点指针，使其指向当前节点的下一个节点

            current = nextTempNode;
//            System.out.println("    " + "移动当前节点至它的后继节点 " + current);
        }
        return pre;
    }


    /**
     * 递归方法
     * @param head
     * @return
     */
    public static ListNode reveredListVersion2(ListNode head){
        return null;
    }

}
