package main.力扣练习.位运算;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/single-number/
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * <p>
 * 说明：
 * <p>
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * <p>
 * 示例 1:
 * <p>
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 * <p>
 * 输入: [4,1,2,1,2]
 * 输出: 4
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/single-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author meijunjie
 */
public class LeetCode_136_只出现一次的数字 {

    public static int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>(nums.length);


        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else {
                map.put(nums[i],1);
            }

        }


        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return -1;
    }


    public static int singleNumberV2(int[] nums) {
        // 排序过后 双指针扫描
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            try{
            if(nums[i] == nums[++i]){

            }else {
                return nums[--i];
            }}catch (Exception e){
                return nums[nums.length-1];
            }
        }
        return nums[nums.length-1];
    }


    public static int singleNumberV3(int[] nums) {
        // 排序过后 双指针扫描

        // 异或运算 a^b^a = a^a^b 存在交换律
        int ans = nums[0];
        for(int i=1;i<nums.length;i++){
            ans = ans ^ nums[i];
        }
       return  ans;
    }





    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
        System.out.println(singleNumberV3(new int[]{4,1,2,1,2,3,3,4,5}));
    }
}
