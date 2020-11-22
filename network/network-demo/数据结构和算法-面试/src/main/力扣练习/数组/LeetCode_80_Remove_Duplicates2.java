package main.力扣练习.数组;

import java.util.Arrays;

/**
 * 给定一个增序排列数组 nums ，你需要在 原地 删除重复出现的元素，使得每个元素最多出现两次，返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [1,1,1,2,2,3]
 * 输出：5, nums = [1,1,2,2,3]
 * 解释：函数应返回新长度 length = 5, 并且原数组的前五个元素被修改为 1, 1, 2, 2, 3 。 你不需要考虑数组中超出新长度后面的元素。
 * 示例 2：
 * <p>
 * 输入：nums = [0,0,1,1,1,1,2,3,3]
 * 输出：7, nums = [0,0,1,1,2,3,3]
 * 解释：函数应返回新长度 length = 7, 并且原数组的前五个元素被修改为 0, 0, 1, 1, 2, 3, 3 。 你不需要考虑数组中超出新长度后面的元素。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author meijunjie
 */
public class LeetCode_80_Remove_Duplicates2 {

    public static int removeDuplicates(int[] nums) {

        if(nums==null || nums.length==0){
            return 0;
        }

        int j=0;
        int equalCompareCount=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[j]){
                // 第一次比较
                ++equalCompareCount;
                if(equalCompareCount<2){
                    nums[++j]=nums[i];
                }

            }else {
                // 重置计数
                equalCompareCount = 0;
                nums[++j] = nums[i];
            }
        }

        j++;
        return j;
    }

    public static void main(String[] args) {
        removeDuplicates(new int[]{0,0,0,0,1,1,1,1,2,3,3,4,4,5,6,6,6});
    }
}
