package com.mjj.data_structure.二叉树.二叉搜索树;

public class BinarySearchTest {

    public static int binarySerach(int[] array, int target){
        if(array == null || array.length == 0){
            throw new IllegalArgumentException("array must is not empty");
        }
        int h = array.length - 1;
        int l = 0;
        while (l<=h){
            int mid = (h+l)/2;
            if(array[mid] == target){
                return mid;
            }else if(array[mid] > target){
                h = mid - 1;
            }else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public static int find(int[] array, int target){
        for(int i=0;i<array.length;i++){
            if(array[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arrays = new int[]{1,2,3,4,5,6,7,8};

        System.out.println(binarySerach(arrays,8));
        System.out.println(find(arrays,8));
    }
}
