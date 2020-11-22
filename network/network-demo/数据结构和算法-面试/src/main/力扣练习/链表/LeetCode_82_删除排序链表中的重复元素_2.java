package main.力扣练习.链表;

import java.util.Map;
import java.util.TreeMap;

/**
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list-ii/
 * <p>
 * 给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->2->3->3->4->4->5
 * 输出: 1->2->5
 * 示例 2:
 * <p>
 * 输入: 1->1->1->2->3
 * 输出: 2->3
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author meijunjie
 */
public class LeetCode_82_删除排序链表中的重复元素_2 {

    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next ==null){
            return head;
        }


        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        ListNode dummyNode = new ListNode(-1);
        ListNode result = dummyNode;
        int elementVal;
        while (head != null){
            elementVal = head.val;
            treeMap.put(elementVal,treeMap.get(elementVal)==null?1:treeMap.get(elementVal)+1);
            head = head.next;
        }


        for(Map.Entry<Integer,Integer> entry: treeMap.entrySet()){
            if(entry.getValue()>1){

            }else {
                dummyNode.next = new ListNode(entry.getKey());
                dummyNode = dummyNode.next;
            }
        }

        return  result.next;
    }


    public static ListNode deleteDuplicatesV2(ListNode head) {
        if(head == null || head.next ==null){
            return head;
        }

        ListNode pre = head;
        ListNode cur = head.next;

        ListNode  dummyNode = new ListNode(-1);
        ListNode  result = dummyNode;

        boolean repeatFlag = false;

        while (cur != null){
            if(pre.val != cur.val){
                // 判断前一次是否是重复
                if(repeatFlag){
                    repeatFlag = false;
                }else {
                    dummyNode.next = new ListNode(pre.val);
                }
            }else {
                repeatFlag = true;
            }

            pre = pre.next;
            cur = cur.next;
        }

        if(!repeatFlag){
            dummyNode.next = new ListNode(pre.val);
        }
        return result.next;
    }


}
