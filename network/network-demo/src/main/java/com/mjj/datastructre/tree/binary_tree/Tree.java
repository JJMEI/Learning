package com.mjj.datastructre.tree.binary_tree;

import java.util.*;

public class Tree {

    private Node root;

    public Tree(Node root) {
        this.root = root;
    }


    /**
     * 根据关键字查找对应的节点
     * @param iData
     * @return
     */
    public Node find(int iData){
        Node current = root;
        while (current != null){
            // 如果当前节点的关键字大于目标值，则访问其左子树
            if(current.iData > iData){
                current = current.leftChild;

                // 如果当前节点的关键字小于目标值，则访问其右子树
            }else if(current.iData < iData){
                current = current.rightChild;
            }else {
                return current;
            }
        }

        return null;
    }


    public void insert(int iData, double fData){
        Node newNode = new Node(iData,fData);
        if(root == null){
            root = newNode;
        }else {
            // 记录当前newNode的父节点
            Node parent;

            // 当前遍历的节点为根节点
            Node current = root;
            while (true){

                // 每次父节点 == 当前遍历的节点
                parent = current;

                // 当前节点大于目标值，则变量当前节点的左子树
                if(current.iData > iData){
                    // 将遍历的节点的左子节点设为下次要遍历的节点
                    current = current.leftChild;
                    // 如果左子节点不存在 则说明
                    if(current == null){
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


    /**
     * 查找二叉搜索树的最小值，一直遍历当前节点的左子树
     * @return
     */
    public Node findMin(){
        Node current = root;
        Node min;
        while (true){
            min = current;
            if(current.leftChild != null){
                current = current.leftChild;
            }else {
                return min;
            }
        }
    }

    /**
     * 查找二叉搜索树的最大值，一直遍历当前节点的右子树
     * @return
     */
    public Node findMax(){
        Node current = root;
        Node max;
        while (true){
            max = current;
            if(max.rightChild != null){
                current = current.rightChild;
            }else {
                return max;
            }
        }
    }


    /**
     * 前序遍历 递归写法
     * @param root
     */
    public void preOrder(Node root){
        if(root != null){
            // 1 访问节点自身
            System.out.print(root.iData + " ");
            // 2 访问左子节点
            preOrder(root.leftChild);
            // 3 访问右子节点
            preOrder(root.rightChild);
        }
    }

    public void preOrderNoRec(Node root){

        Stack<Node> stack = new Stack<>();
        if(root == null){
            return;
        }else {
            stack.push(root);
        }

        // 栈非空
        while (!stack.empty()){
            // 前序遍历先弹出
            Node node = stack.pop();

            if(node.rightChild != null){
                stack.push(node.rightChild);
            }

            if(node.leftChild != null){
                stack.push(node.leftChild);
            }

            // 访问节点
            System.out.print(node.iData + " ");

        }

    }




    public void inOrder(Node root){
        if(root != null){
            // 1. 先访问左子树
            inOrder(root.leftChild);
            // 2. 访问自身
            System.out.print(root.iData + " ");
            // 3. 访问右子树
            inOrder(root.rightChild);
        }
    }

    public void postOrder(Node root){
        if(root != null){
            // 1 先访问左子树
            inOrder(root.leftChild);
            // 2 访问右子树
            inOrder(root.rightChild);
            // 3 访问自身
            System.out.print(root.iData + " ");
        }
    }


    public List<List<Integer>> layerOrder(Node root){

        if(root == null){
            return null;
        }else {
            List<List<Integer>> result = new ArrayList<>();

            Queue<Node> queue = new ArrayDeque<>();
            queue.add(root);

            while (!queue.isEmpty()){
                // 弹出
                Node node = queue.poll();

                if(node.leftChild != null){
                    queue.add(node.leftChild);
                }
                if(node.rightChild != null){
                    queue.add(node.rightChild);
                }

                System.out.println(node.iData + " ");
            }
            return null;
        }

    }


    public static void main(String[] args) {
        Node node = new Node(15,0.23d);
        Tree tree = new Tree(node);

        tree.insert(6,0.3d);
        tree.insert(23,0.32d);
        tree.insert(4,0.233d);
        tree.insert(7,0.323);
        tree.insert(19,0.22d);
        tree.insert(71,0.33d);
        tree.insert(5,12.2d);
        tree.insert(17,33.22d);
        tree.insert(50,12.2d);
        tree.insert(75,33.22d);


        tree.layerOrder(tree.root);
//        tree.preOrder(tree.root);
//        System.out.println();
//
//        tree.preOrderNoRec(tree.root);

//        tree.inOrder(tree.root);
//        System.out.println();
//
//        tree.postOrder(tree.root);
//        System.out.println();
//
//        System.out.println(tree.find(829));
//
//        System.out.println(tree.findMin());
//
//        System.out.println(tree.findMax());
    }
}
