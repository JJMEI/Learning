package main.线性表.链表;

public class LinkedList<E> {

    private int size;

    Node<E> firstNode;

    private static class Node<E>{

        // 数据域
        E element;

        // 指向下一个数据
        Node next;

        public Node(E element, Node next) {
            this.element = element;
            this.next = next;
        }
    }



}
