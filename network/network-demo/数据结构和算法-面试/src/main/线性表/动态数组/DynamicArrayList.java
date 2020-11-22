package main.线性表.动态数组;

public class DynamicArrayList {

    private static final int DEFAULT_CAPACITY = 10;
    private int size;
    private int[] elements;

    public DynamicArrayList(int capacity) {
        capacity = capacity < DEFAULT_CAPACITY ? DEFAULT_CAPACITY : capacity;
        this.elements = new int[capacity];
    }

    public DynamicArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public void clear() {
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(int element) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == element) {
                return true;
            }
        }
        return false;
    }


    /**
     * 插入扩容 check当前数组容量大小 是否需要扩容
     * @param element
     */
    public void add(int element){

        // check 当前数组容量
        if(size + 1 > elements.length){

            System.out.println("触发扩容...");
            // 执行扩容操作 扩容两倍
            int[] newElements = new int[2*elements.length];
            for(int i=0;i<elements.length;i++){
                newElements[i] = elements[i];
            }
            elements = newElements;
            newElements = null;
        }
        elements[size++] = element;
    }
}
