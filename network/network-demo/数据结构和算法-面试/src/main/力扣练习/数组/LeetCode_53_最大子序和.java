package main.力扣练习.数组;

/**
 * https://leetcode-cn.com/problems/maximum-subarray/
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * <p>
 * 示例:
 * <p>
 * 输入: [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * 进阶:
 * <p>
 * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 * <p>
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-subarray
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author meijunjie
 */
public class LeetCode_53_最大子序和 {

    public static int maxSubArray(int[] nums) {
        // 贪心算法
        // 当前和
        int pre = 0;

        // 最大和
        int max = nums[0];

        for(int i=0;i<nums.length;i++){

            // pre 之前的值又增益 则加上
            if(pre>0){
                pre += nums[i];
            }else {

                // 没有增益则丢弃
                pre = nums[i];
            }

            max = Math.max(max,pre);

        }

        return max;

    }
}
