package com.mjj.data_structure.二叉树.二叉搜索树;

public class BSTTest {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        Integer[] ints = new Integer[]{7,4,9,2,5,8,11,3};

        for(Integer i : ints){
            bst.add(i);
        }
    }
}
