package com.mjj.datastructre.tree.binary_tree;

/**
 * 树的节点类
 */
public class Node {
    /**
     * 树的关键字
     */
    public int iData;
    public double fData;

    /**
     * 左子节点
     */
    public Node leftChild;

    /**
     * 右子节点
     */
    public Node rightChild;

    public Node(int iData, double fData) {
        this.iData = iData;
        this.fData = fData;
    }


    @Override
    public String toString() {
        return "Node{" +
                "iData=" + iData +
                ", fData=" + fData +
                ", leftChild=" + leftChild +
                ", rightChild=" + rightChild +
                '}';
    }
}
