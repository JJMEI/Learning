package com.mjj.data_structure.tree.avltree;

public class AVLNode<T extends Comparable> {
    /**
     * 左节点
     */
    public AVLNode<T> left;

    /**
     * 右节点
     */
    public AVLNode<T> right;

    public T data;

    /**
     * 当前节点的高度
     *
     * 树的高度和深度是两个相反的概念
     *      高度，是指当前节点到叶子节点的最长路径
     *      深度 根节点到当前节点的最大路径  根节点的深度为0 空子树的高度为-1  叶子节点的高度为0
     */
    public int hegiht;
}
