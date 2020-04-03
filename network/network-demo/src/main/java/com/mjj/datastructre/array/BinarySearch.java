package com.mjj.datastructre.array;

import java.util.Objects;

public class BinarySearch {


    /**
     * 基于数组二分搜索算法
     * @param array
     * @param searchObject
     * @return
     */
    public static  int binarySearch(int[] array, int searchObject){

        if(!(array != null && array.length >= 1)){
            throw new IllegalArgumentException("param not correct.");
        }

        int lowBound = 0;
        int upperBound = array.length - 1;
        int currentIndex;

        /**
         * 注意边界条件的控制
         */
        while (lowBound <= upperBound){
            currentIndex = (lowBound + upperBound) / 2;
            if(array[currentIndex] == searchObject){
                return currentIndex;
            }else if(array[currentIndex] > searchObject){
                upperBound = currentIndex - 1;
            }else {
                lowBound = currentIndex + 1;
            }
        }
        return array.length;
    }


    public static int binarySearchRecursion(int[] array, int searchObject, int lowBound, int upperBound){
        int lowBound = 0;
        int upperBound = array.length - 1;
        int currentIndex = (lowBound + upperBound)/2;

        return 0;
    }


    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};

        System.out.println(binarySearch(array,5));
    }
}
