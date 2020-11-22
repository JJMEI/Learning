package main.线性表.链表;

public interface List<E> {

    void clear();
    int size();
    boolean isEmpty();

    void add(E element);

    boolean contains(E element);


}
