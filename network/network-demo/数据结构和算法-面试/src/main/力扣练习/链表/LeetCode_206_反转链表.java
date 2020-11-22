package main.力扣练习.链表;


/**
 * https://leetcode-cn.com/problems/reverse-linked-list/
 * 反转一个单链表。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 * <p>
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode_206_反转链表 {


    /**
     * 迭代法
     * 还有递归法
     *
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head) {

        ListNode pre = null;
        ListNode current = head;
        ListNode tempNode = null;

        while (current != null) {
            tempNode = current.next;

            current.next = pre;

            pre = current;

            current = tempNode;
        }
        return pre;
    }
}


