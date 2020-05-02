package com.mjj.algorithm.tree.binary_search_tree;

public class Tree {

    /**
     * 根节点
     */
    private Node root;


    public void setRoot(Node root) {
        this.root = root;
    }

    /**
     * 构造一个空tree
     */
    public Tree(){
        root = null;
    }


    public Node find(int key){
        Node current = root;

        // 这里假设没有空树
        while (current.iData != key){

            // 查左子节点
            if(key < current.iData){
                current = current.leftChild;
            }else {
                current = current.rightChild;
            }

            if(current == null){
                return null;
            }
        }
        return current;
    }


    public void insert(int id, double dd){
        Node newNode = new Node();
        newNode.setiData(id);
        newNode.setdData(dd);

        // 判断根节点是否存在
        if(root == null){
            root = newNode;
        }else {

            // 根节点存在 需要选择一个合适的位置，找到要插入节点的父节点
            Node current = root;

            // 要插入节点的父节点
            Node parent;

            while (true){
                parent = current;
                if(id < current.iData){
                    current = current.leftChild;

                    // 当前节点没有左子节点
                    if (current == null){
                        parent.leftChild = newNode;
                        return;
                    }
                }else {
                    current = current.rightChild;
                    if(current == null){
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }


}
