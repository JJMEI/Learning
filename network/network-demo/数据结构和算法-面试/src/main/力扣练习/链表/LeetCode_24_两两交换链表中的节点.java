package main.力扣练习.链表;

import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/swap-nodes-in-pairs/
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 * <p>
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：head = [1,2,3,4]
 * 输出：[2,1,4,3]
 * 示例 2：
 * <p>
 * 输入：head = []
 * 输出：[]
 * 示例 3：
 * <p>
 * 输入：head = [1]
 * 输出：[1]
 *  
 * <p>
 * 提示：
 * <p>
 * 链表中节点的数目在范围 [0, 100] 内
 * 0 <= Node.val <= 100
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/swap-nodes-in-pairs
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author meijunjie
 */
public class LeetCode_24_两两交换链表中的节点 {

    public static ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        Stack<Integer> stack = new Stack<>();


        ListNode dummyNode = new ListNode(-1);
        ListNode result = dummyNode;


        while (head != null) {

            stack.push(head.val);
            head = head.next;

            // 偶数的情况 因为至少有两个数
            if (stack.size() == 2 && head != null) {

                while (!stack.isEmpty()) {
                    dummyNode.next = new ListNode(stack.pop());
                    dummyNode = dummyNode.next;
                }
            }

            // 奇数的情况
            if (head == null) {
                while (!stack.isEmpty()) {
                    dummyNode.next = new ListNode(stack.pop());
                    dummyNode = dummyNode.next;
                }
            }


        }

        return result.next;
    }
}
