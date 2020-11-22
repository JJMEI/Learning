package main.力扣练习.链表;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_02_06_回文链表 {

    public static boolean isPalindrome(ListNode head) {
        // 借助外部存储
        if (head == null) {
            return true;
        }
        if (head.next == null) {
            return true;
        }


        List<Integer> values = new ArrayList<>();

        while (head != null) {
            values.add(head.val);
            head = head.next;
        }

        int elements = values.size();

        System.out.println(Arrays.toString(values.toArray()));
        // 偶数个
        if (elements % 2 == 0) {

        } else {
            // 奇数个
            elements -= 1;
        }

        for (int i = 0; i < elements / 2; i++) {
            if (values.get(i) != values.get(values.size() - 1 - i)) {
                return false;
            }
        }
        return true;

    }


    public static boolean isPalindromeV2(ListNode head) {
        // 借助外部存储
        if (head == null) {
            return true;
        }
        if (head.next == null) {
            return true;
        }


        ListNode temp = head;
        int length = 0;

        // 遍历链表 获取整个链表元素的个数
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        // 判定两个元素的时候
        if (length == 2) {
            return head.val == head.next.val;
        }

        ListNode pre = head;
        ListNode current = head.next;
        ListNode next = head.next.next;

        pre.next = null;

        for (int i = 0; i < length / 2; i++) {
            current.next = pre;
            pre = current;
            current = next;
            next = next.next;
        }

        // 判定整个链表的个数
        if (length % 2 != 0) {
            // 奇数个
            current = next;
        }

        while (current != null && pre != null) {
            if (current.val != pre.val) {
                return false;
            }
            current = current.next;
            pre = pre.next;
        }

        return true;

    }


    public static void main(String[] args) {
        System.out.println(3 / 2);
    }
}
