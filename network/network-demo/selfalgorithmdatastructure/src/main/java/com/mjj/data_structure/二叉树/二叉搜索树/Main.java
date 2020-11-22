package com.mjj.data_structure.二叉树.二叉搜索树;

import com.mjj.data_structure.二叉树.二叉搜索树.printer.BinaryTrees;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Person> bst = new BinarySearchTree<>();
        BinarySearchTree<Person> bst2 = new BinarySearchTree<>((o1, o2) -> o2.getAge() - o1.getAge());

        int[] ages = new int[]{7,4,9,2,3,5,8,11,1,12,10,13};
        for(int i=0;i<ages.length;i++){
            bst.add(new Person(ages[i]));
            bst2.add(new Person(ages[i]));
        }

        BinaryTrees.print(bst);

        System.out.println();

        bst.levelOrder();

        System.out.println("树的高度 " + bst.height());

        System.out.println("树的高度 " + bst.heightByLevelOrder());


        // 前序遍历树 非递归
        bst.preOrderByIteration();

        bst.innerOrderByIteration();

        bst.postOrderByIteration();
        bst.postOrderByDoubleStack();

    }
}
