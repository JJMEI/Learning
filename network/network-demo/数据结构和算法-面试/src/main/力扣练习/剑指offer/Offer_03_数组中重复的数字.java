package main.力扣练习.剑指offer;

import java.util.*;

public class Offer_03_数组中重复的数字 {

    /**
     * 此版本引入外部空间存储
     * @param nums
     * @return
     */
    public static int findRepeatNumberV1(int[] nums) {
        Map<Integer,Integer> tempMap = new HashMap<>(nums.length);

        for(int i=0;i<nums.length;i++){
            if(tempMap.containsKey(nums[i])){
                return nums[i];
            }
            tempMap.put(nums[i],i);
        }
        return -1;
    }


    /**
     * 此版本不引入外部存储空间 O(N^2) 时间复杂度高 pass
     * @param nums
     * @return
     */
    public static int findRepeatNumberV2(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    return nums[i];
                }
            }
        }
        return -1;
    }


    /**
     * 可以使用双指针  O(N)
     * @param nums
     * @return
     */
    public static int findRepeatNumberV3(int[] nums) {
        // 先排序然后有双指针

        Arrays.sort(nums);

        int j=0;

        for (int i=1;i<nums.length;i++){
            if(nums[j] == nums[i]){
                return nums[j];
            }else {
                j = i;
            }
        }

        return -1;
    }


    public static int findRepeatNumberV4(int[] nums) {
        // 先排序然后有双指针


        Set<Integer> tempSet = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(!tempSet.add(nums[i])){
                return nums[i];
            }
            tempSet.add(nums[i]);
        }
        return -1;
    }


    public static int findRepeatNumberV5(int[] nums) {
        int[] bucket = new int[nums.length];

        for(int i=0;i<nums.length;i++){

            // 当前桶中存放的元素个数加1
            bucket[nums[i]]++;
            if(bucket[nums[i]]>1){
                return nums[i];
            }
        }
        return -1;
    }



    public static int findRepeatNumberV6(int[] nums) {
        int temp ;

        for (int i=0;i<nums.length;i++){

            // 判断当前索引上的值是否和当前索引相等
            while (nums[i] != i){

                // 检查是否存在相等值
                if(nums[i] == nums[nums[i]]){
                    return nums[i];
                }

                temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;

                System.out.println("进行索引交换"  + "nums[" + i + "] " + nums[i] + " --> nums[" + temp + "] " + nums[temp]);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        findRepeatNumberV6(new int[]{2,3,1,0,2,5,3});
    }










}
