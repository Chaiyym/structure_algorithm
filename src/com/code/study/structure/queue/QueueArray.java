package com.code.study.structure.queue;

/**
 * @author chaiyym
 * @createTime 2021/7/19 14:56
 */
public class QueueArray implements Queue {
    //数组的默认容量
    public static final int CAPACITY = 1000;
    //数组的实际容量
    protected int capacity;
    //对象数组
    protected Object[] Q;
    //队首元素的位置
    protected int f = 0;
    //队尾元素的位置
    protected int r = 0;

    public QueueArray() {
        this(CAPACITY);
    }


    public QueueArray(int capacity) {
        Q = new Object[capacity];
    }

    @Override
    public int getSize() {
        return (capacity - f + r) % capacity;
    }

    @Override
    public boolean isEmpty() {
        return (f == r);
    }

    @Override
    public Object front() throws Exception {
        if (isEmpty()) {
            throw new Exception("意外：队列空");
        }
        return Q[f];
    }

    @Override
    public void enqueue(Object obj) throws Exception {
        if (getSize() == capacity - 1) {
            throw new Exception("Queue overflow.");
        }
        Q[r] = obj;
        r = (r + 1) % capacity;
    }

    @Override
    public Object dequeue() throws Exception {
        Object elem;
        if (isEmpty()) {
            throw new Exception("意外：队列空");
        }
        elem = Q[f];
        Q[f] = null;
        f = (f + 1) % capacity;
        return elem;
    }

    @Override
    public void traversal() {
        for (int i = f; i < r; i++) {
            System.out.print(Q[i] + " ");
        }
        System.out.println();
    }
}
