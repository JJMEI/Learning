package main.力扣练习.链表;


/**
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/
 * <p>
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author meijunjie
 */
public class LeetCode_21_合并两个有序链表 {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        // 题目分析 首先整个两个链表都是升序
        // 1. 确定最小的节点

        ListNode dummyNode = new ListNode(-1);

        ListNode curr = dummyNode;

        while (l1 != null && l2 != null){
            if(l1.val < l2.val){
                dummyNode.next = l1;
                dummyNode = dummyNode.next;
                l1 = l1.next;
            }else {
                dummyNode.next = l2;
                dummyNode = dummyNode.next;
                l2 = l2.next;
            }
        }

        if(l1==null){
            dummyNode.next = l2;
        }

        if(l2 == null){
            dummyNode.next = l1;
        }
        return curr.next;


    }
}
