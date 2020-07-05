package com.mjj.data_structure.动态数组;

/**
 * @author meijunjie
 */
@SuppressWarnings("unchecked")
public class ArrayList<E> {

    /**
     * 默认的数组容量
     */
    private static final int DEFAULT_CAPACITY = 10;
    private static final int ELEMENT_NOT_FOUND = -1;
    /**
     * 动态数组元素数量
     */
    private int size;
    /**
     * 动态数组中的元素
     */
    private E[] elements;

    public ArrayList(int capacity) {
        if (capacity < DEFAULT_CAPACITY) {
            capacity = DEFAULT_CAPACITY;
        }
        this.elements = (E[]) new Object[capacity];
    }

    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size < 1;
    }

    public void add(E element) {
        // check 检查当前数据的容量
        rangeCheckForAdd();
        elements[size++] = element;
    }

    /**
     * 在指定位置添加元素
     *
     * @param index   指定索引位置
     * @param element 元素
     */
    public void add(int index, E element) {

        // 检查索引是否和里
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("index out of bounds");
        }

        // 检查当前数组是否需要动态扩容
        rangeCheckForAdd();

        // 插入点的数据需要进行挪移
        // 需要挪移的数据array[index]~array[size - 1]
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }

        // 赋值
        elements[index] = element;
        //元素个数增加
        size++;
    }

    private void rangeCheckForAdd() {
        // ++size  表示要增加的元素过后整个数组中的数据
        if (size + 1 > elements.length) {
            // 进行扩容
            int oldCapacity = elements.length;
            int newCapacity = oldCapacity + (oldCapacity >> 1);
            E[] newElements = (E[]) new Object[newCapacity];

            // 移动数据, ArrayList采用的数组拷贝的方法
            for (int i = 0; i < oldCapacity; i++) {
                newElements[i] = elements[i];
            }
            // 将elements元素指向扩容之后的数组
            elements = newElements;
        }
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return elements[index];
    }


    /**
     * 删除指定元素的位置
     *
     * @param index
     * @return
     */
    public E remove(int index) {
        // check index
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index out of bounds");
        }

        E removedValue = elements[index];

        // 迁移数据  array[i+1] ---> array[i]
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }

        // 最后一位
        elements[--size] = null;
        return removedValue;
    }

    /**
     * 判断当前数组是否包含这个元素
     *
     * @param element
     * @return
     */
    public boolean contains(E element) {

        if (element == null) {
            for (int i = 0; i < size; i++) {
                if (elements[i] == null) {
                    return true;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (element.equals(elements[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * @param element
     * @return
     */
    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if(element == null){
                if(elements[i] == null){
                    return i;
                }
            }else {
                if(element.equals(elements[i])){
                    return i;
                }
            }
        }
        return ELEMENT_NOT_FOUND;
    }


}
