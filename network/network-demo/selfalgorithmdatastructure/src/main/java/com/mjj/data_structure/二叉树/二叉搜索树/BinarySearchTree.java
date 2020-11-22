package com.mjj.data_structure.二叉树.二叉搜索树;

import com.mjj.data_structure.二叉树.二叉搜索树.printer.BinaryTreeInfo;

import java.util.*;

/**
 * @author meijunjie
 */
public class BinarySearchTree<E>  implements BinaryTreeInfo{

    private int size;

    /**
     * 根节点
     */
    private Node<E> root;

    private Comparator<E> comparator;

    public BinarySearchTree(){

    }

    public BinarySearchTree(Comparator<E> comparator) {
        this.comparator = comparator;
    }

    /**
     * 返回当前BST的节点数
     * @return
     */
    public int size(){
        return size;
    }

    public void add(E element){
        elementNotNullCheck(element);

        // 添加第一个节点 如果根节点为null 当前树是一棵空树
        if(root == null){
            root = new Node<>(element,null);
            size++;
            return;
        }

        // 记录父节点 即要插入节点的父节点
        Node<E> parent = root;
        Node<E> current = root;
        int cmp = 0;
        while (current != null){
            cmp = compare(element,current.element);
            // 保存当前节点 作为插入的父节点
            parent = current;
            if(cmp > 0){
                current = current.right;
            }else if(cmp < 0){
                current = current.left;
            }else {
                current.element = element;
                return;
            }
        }

        Node<E> newNode = new Node<>(element,parent);

        // 通过比较目标元素的大小能 确定插入的位置
        if(cmp > 0){
            parent.right = newNode;
        }else {
            parent.left = newNode;
        }
        size++;
    }


    public void levelOrder(){
        if(root == null) {
            return;
        }
        Queue<Node<E>> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            Node<E> node = queue.poll();
            System.out.println(node.element);

            if(node.left != null){
                queue.offer(node.left);
            }

            if(node.right != null){
                queue.offer(node.right);
            }
        }
    }

    /**
     * 返回树的高度  等价于根节点的高度 递归计算
     * @return
     */
    public int height(){
        return height(root);
    }


    /**
     * 后序遍历
     */
    public void postOrderByIteration(){
        postOrderByIteration(root);
    }

    @SuppressWarnings("unchecked")
    private void postOrderByIteration(Node<E> node)
    {
        Stack<Node> stack = new Stack<>();
        Map<E,Integer> map = new HashMap<>();

        //将所有最子节点入栈，
        while (!stack.isEmpty() || node != null)
        {

            // 负责入栈操作
            if(node != null)
            {
                stack.push(node);
                map.put(node.element,1);
                node = node.left;
            }else
                {
                // 第一次访问
                // 访问栈顶元素
                 node = stack.peek();

                // 已被第二次访问了 需要弹出
                if(map.get(node.element) == 2)
                {
                    node = stack.pop();
                    System.out.println(node.element);
                    // 该节点出栈 继续向上遍历
                    node = null;
                }else
                    {
                    // 如果是首次访问
                    map.put(node.element,2);
                    // 同时将该节点的右孩子赋值给新节点入栈
                    node = node.right;
                    }

                }
            }
    }

    public void postOrderByDoubleStack(){
        postOrderByDoubleStack(root);
    }

    private void postOrderByDoubleStack(Node<E> node){
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        if(node == null) {return;}

        stack1.push(node);

        while (!stack1.isEmpty()){
            Node<E> tempNode = stack1.pop();
            stack2.push(tempNode);
            if(tempNode.left != null){
                stack1.push(tempNode.left);
            }
            if(tempNode.right != null){
                stack1.push(tempNode.right);
            }
        }

        while (!stack2.isEmpty()){
            System.out.println(stack2.pop().element);
        }
    }
    /**
     * 基于右进栈的前序遍历
     */

    public void preOrderByIteration(){
        preOrderByIteration(root);
    }

    /**
     * 中序遍历非递归
     */
    public void innerOrderByIteration(){
        innerOrderByIteration(root);
    }

    private void innerOrderByIteration(Node<E> node){
        Stack<Node<E>> stack = new Stack<>();
        while (!stack.isEmpty() || node != null){
            // 树的左侧节点全部入栈
            if(node != null){
                stack.push(node);
                node = node.left;
            }else {
                node = stack.pop();
                System.out.println(node.element);
                node = node.right;
            }
        }
    }

    private void preOrderByIteration(Node<E> root){
        if(root == null){
            return;
        }
        Stack<Node<E>> stack = new Stack<>();

        // 树的根节点入栈
        stack.push(root);

        while (!stack.empty()){
            // 节点出栈
            Node<E> node = stack.pop();

            // 右节点入栈
            if(node != null && node.right != null){
                stack.push(node.right);
            }

            // 左节点入栈
            if(node != null && node.left != null){
                stack.push(node.left);
            }
            System.out.println(node.element);
        }

    }

    public int heightByLevelOrder(){
        return heightByLevelOrder(root);
    }

    /**
     * 计算一棵树的高度
     * @param node
     * @return
     */
    private int heightByLevelOrder(Node<E> node){
        if(node == null) {return 0;}
        int height = 0;
        int levelSize = 1;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        while (!queue.isEmpty()){
            Node<E> eNode = queue.poll();
            levelSize--;
            if(eNode.left != null){
                queue.offer(eNode.left);
            }
            if (eNode.right != null) {
                queue.offer(eNode.right);
            }

            // 当前层遍历完毕 准备开启下一层
            if(levelSize == 0){
                levelSize = queue.size();
                height++;
            }
        }

        return height;
    }

    private int height(Node<E> node){
        if(node == null){
            return 0;
        }
        return 1 + Math.max(height(node.left),height(node.right));
    }

    private Node<E> predecessor(Node<E> node){
        if(node == null) {return null;}
        Node<E> p = node.left;

        // 当前节点有左子树，则当前节点的前驱节点在其左子树中
        if(p != null){
            while (p.right != null){
                p = p.right;
            }
            // 当最后一个p的右节点为null 则 p就是当前节点的前驱
            return p;
        }

        // 当前节点没有左子树 node.left == null && node.parent != null
        while (node.parent != null && node == node.parent.left){
            node = node.parent;
        }
        return node.parent;
    }

    private Node<E> successor(Node<E> node){
        if(node == null){return null;}

        Node<E> p = node.right;

        // 当前节点后继节点在它的右子树中，且一直是左节点
        if(p != null){
            while (p.left != null){
                p = p.left;
            }
            return p;
        }

        // 当前节点的右子树==null 且父节p.parent != null;
        while (node.parent != null && node == node.parent.right){
            node = node.parent;
        }
        return node.parent;
    }

    @SuppressWarnings("unchecked")
    private int compare(E element, E element1) {

        // 优先使用比较器Comparator
        if(comparator != null){
            return comparator.compare(element, element1);
        }
        // 其次使用Comparable接口
        return ((Comparable)element).compareTo(element1);
    }

    private void elementNotNullCheck(E element){
        if(element == null){
            throw new IllegalArgumentException("element must be not null");
        }
    }

    @Override
    public Object root() {
        return root;
    }

    @Override
    public Object left(Object node) {
        return ((Node<E>)node).left;
    }

    @Override
    public Object right(Object node) {
        return ((Node<E>)node).right;
    }

    @Override
    public Object string(Object node) {
        return ((Node<E>)node).element+"";
    }

    private static class Node<E>{
        E element;
        /**
         * 左子节点
         */
        Node<E> left;

        /**
         * 右子节点
         */
        Node<E> right;

        /**
         * 父节点
         */
        Node<E> parent;

        public Node(E element, Node<E> parent){
            this.element = element;
            this.parent = parent;
        }


        public boolean isLeaf(){
            // 没有叶子节点的
            return left == null && right == null;
        }

        public boolean hasTwoChildern(){
            return left!=null&&right!=null;
        }
    }






}
