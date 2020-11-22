package main.力扣练习.剑指offer;

import java.util.Arrays;

public class Offer_11_旋转数组的最小数字 {

    /**
     * 找到选择数组的最小数字
     * @param numbers
     * @return
     */
    public static int minArrayV1(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }


    // O(N)
    public static int minArrayV2(int[] numbers) {

        // 可能全是相同值
        int j=0;
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]>=numbers[j]){
                j++;
            }else{
                return numbers[i];
            }
        }

        return numbers[0];
    }


    /**
     * todo 二分查找
     * @param numbers
     * @return
     */
    public static int minArrayV3(int[] numbers) {
    return 0;
    }





}
