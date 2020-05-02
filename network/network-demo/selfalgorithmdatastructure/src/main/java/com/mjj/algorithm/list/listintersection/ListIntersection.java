package com.mjj.algorithm.list.listintersection;

import com.mjj.algorithm.list.mergeTwoSortedList.ListNode;

import java.util.HashMap;
import java.util.Map;

public class ListIntersection {

    /**
     * 第一版用暴力解法
     *  使用两层for循环
     *  headA size M
     *  headB size N
     *  整个算法复杂度 时间 O(M*N)
     *  空间复杂度 O(1) 不会引入额外的空间
     * @param headA
     * @param headB
     * @return
     */
    public static ListNode intersectionListVersion1(ListNode headA, ListNode headB){
        ListNode result = null;
        if(headA == null || headB == null){
            return null;
        }
        boolean match = false;
        ListNode inner = headB;
        while (headA != null){

            ListNode temp = headA;
            while (headB!=null){
                if(temp == headB){
                    result = temp;
                    match = true;
                    break;
                }else {
                    headB = headB.next;
                }
            }
            if(match){
                break;
            }else {
                headA = headA.next;
                headB = inner;
            }
        }

        return result;
    }


    /**
     * 第二种借助容器类特性 val<---> Map<val,ListNode);
     * 当且仅当两个ListNode节点 内初地址是相等的就可
     * @param headA
     * @param headB
     * @return
     */
    public static ListNode intersectionListVersion2(ListNode headA, ListNode headB){
        ListNode result = null;
        Map<Integer,ListNode> headAMap = new HashMap<>();

        while (headA != null){
            headAMap.put(headA.val,headA.next);
            headA = headA.next;
        }

        while (headB != null){
            if(headAMap.containsKey(headB.val) && headAMap.get(headB.val) == headB){
                result = headB;
                break;
            }else {
                headB = headB.next;
            }
        }

        return result;
    }


    public static ListNode intersectionListVersion3(ListNode headA, ListNode headB){

    }

}
