package com.mjj.datastructre.sort;

import java.util.Arrays;

/**
 * 简单排序
 *
 * @author meijunjie
 */
public class Sort {

    /**
     * 冒泡排序 O(N^2)
     *
     * @param array
     * @return
     */
    public static int[] bubbleSort(int[] array) {
        if (array == null || array.length == 1) {
            throw new IllegalArgumentException("param not correct.");
        }

        /**
         * 每一次确定一个最大值，放在
         */
        for (int out = array.length - 1; out > 0; out--) {
            for (int in = 0; in < out; in++) {

                // 如果第一位 大于第二为则交换二者的数据
                if (array[in] > array[in + 1]) {
                    int temp = array[in + 1];
                    array[in + 1] = array[in];
                    array[in] = temp;
                }
            }
        }
        return array;
    }


    /**
     * 选择排序 N*(N-1)/2次比较 但是少于10次的交换
     *
     * @param array
     * @return
     */
    public static int[] selectSort(int[] array) {

        if (array == null || array.length == 1) {
            throw new IllegalArgumentException("param not correct.");
        }

        for (int out = 0; out < array.length - 1; out++) {

            // 记录最小值的索引
            int min = out;
            // 这一步找 1~array.length - 1 之后的最小值，找到并记录
            for (int in = out + 1; in < array.length; in++) {
                if (array[in] < array[min]) {
                    min = in;
                }
            }
            int temp = array[out];
            array[out] = array[min];
            array[min] = temp;
        }
        return array;
    }


    /**
     * 插入排序
     * @param array
     * @return
     */
    public static int[] insertSort(int[] array){
        if (array == null || array.length == 1) {
            throw new IllegalArgumentException("param not correct.");
        }

        for (int out = 1; out < array.length ; out++){

            int temp = array[out];
            int in = out;

            // 这里是交换的关键
            while (in > 0 && array[in-1] >= temp){
                array[in] = array[in-1];
                --in;
            }
            array[in] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1, 2423, 2, 2, 123, 12, 1233, 2, 44, 223, 412, 555, 334, 23, 333, 234, 4223, 3, 34, 24232, 2, 2, 2423};

        array = bubbleSort(array);

        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.toString(selectSort(new int[]{1, 2423, 2, 2, 123, 12, 1233, 2, 44, 223, 412, 555, 334, 23, 333, 234, 4223, 3, 34, 24232, 2, 2, 2423})));

        System.out.println(Arrays.toString(insertSort(new int[]{1, 2423, 2, 2, 123, 12, 1233, 2, 44, 223, 412, 555, 334, 23, 333, 234, 4223, 3, 34, 24232, 2, 2, 2423})));

    }
}
