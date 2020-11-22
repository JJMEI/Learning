package main.力扣练习.链表;

import main.线性表.链表.List;

import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/rotate-list/
 * <p>
 * 给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->2->3->4->5->NULL, k = 2
 * 输出: 4->5->1->2->3->NULL
 * 解释:
 * 向右旋转 1 步: 5->1->2->3->4->NULL
 * 向右旋转 2 步: 4->5->1->2->3->NULL
 * 示例 2:
 * <p>
 * 输入: 0->1->2->NULL, k = 4
 * 输出: 2->0->1->NULL
 * 解释:
 * 向右旋转 1 步: 2->0->1->NULL
 * 向右旋转 2 步: 1->2->0->NULL
 * 向右旋转 3 步: 0->1->2->NULL
 * 向右旋转 4 步: 2->0->1->NULL
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/rotate-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author meijunjie
 */
public class LeetCode_61_旋转链表 {


    public static ListNode rotateRight(ListNode head, int k) {

        if(head == null || head.next == null){
            return head;
        }
        Stack<Integer> inStack = new Stack<>();

        ListNode pre = head;

        ListNode result;

        ListNode rotate = null;

        ListNode cur = head;


        while (cur != null) {
            inStack.push(cur.val);
            cur = cur.next;
        }

        int length = inStack.size();
        k = k % length;
        if(k == 0){
            return pre;
        }
        int count = 0;
        while (head != null){
            count++;
            if(length - k == count){
                rotate = head.next;
                head.next = null;
                break;
            }
            head = head.next;
        }

        result  = rotate;

        while (rotate!=null){
            if(rotate.next == null){
                rotate.next = pre;
                break;
            }
            rotate = rotate.next;

        }

        return result;


    }
}
