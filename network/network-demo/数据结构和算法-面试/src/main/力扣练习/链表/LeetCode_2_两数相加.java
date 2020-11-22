package main.力扣练习.链表;


import java.util.Stack;

public class LeetCode_2_两数相加 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummyNode = new ListNode(-1);
        ListNode result = dummyNode;

        int temp = 0;
        int mode;
        ListNode tempNode;

        while (temp!=0 || l1 != null || l2 != null) {

            if (l1 != null && l2 != null) {
                tempNode = new ListNode((l1.val + l2.val + temp) % 10);
                mode = (l1.val + l2.val + temp) / 10;
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 == null && l2 != null) {

                // 前一步没有进位
                if(temp == 0){
                    dummyNode.next = l2;
                    break;
                }
                tempNode = new ListNode((l2.val + temp) % 10);
                mode = (l2.val + temp) / 10;
                l2 = l2.next;

            } else if (l1 != null) {

                // 前一步没有有进位
                if(temp == 0){
                    dummyNode.next = l1;
                    break;
                }
                tempNode = new ListNode((l1.val + temp) % 10);
                mode = (l1.val + temp) / 10;
                l1 = l1.next;

            } else{
                tempNode = new ListNode(temp);
                mode=0;
            }

            dummyNode.next = tempNode;
            dummyNode = dummyNode.next;
            // 重置进位标志
            temp = 0;
            if (mode > 0) {
                temp = mode;

            }

        }

        return result.next;

    }
}
