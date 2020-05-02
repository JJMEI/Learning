package com.mjj.algorithm.tree.binary_search_tree;

public class Node {

    /**
     * 关键字值
     */
    public int iData;

    /**
     * 节点数据
     */
    public double dData;

    /**
     * 当前节点的左子节点
     */
    public Node leftChild;

    /**
     * 当前节点的右子节点
     */
    public Node rightChild;



    public void displayNode(){
        System.out.print('{');
        System.out.print(iData);
        System.out.print(", ");
        System.out.print(dData);
        System.out.print("} ");
    }


    public int getiData() {
        return iData;
    }

    public void setiData(int iData) {
        this.iData = iData;
    }

    public double getdData() {
        return dData;
    }

    public void setdData(double dData) {
        this.dData = dData;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}
