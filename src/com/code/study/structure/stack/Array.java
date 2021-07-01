package com.code.study.structure.stack;

/**
 * 基于数组的栈实现
 *
 * @author chaiyym
 * @createTime 2021/6/30 16:49
 */
public class Array implements Stack {
    /**
     * 数组的默认容量
     */
    public static final int CAPACITY = 1024;

    /**
     * 数组的实际容量
     */
    protected int capacity;

    /**
     * 对象数组
     */
    protected Object[] s;

    /**
     * 栈顶元素的位置
     */
    protected int top = -1;

    /**
     * 默认数组声明
     */
    public Array() {
        this(CAPACITY);
    }

    /**
     * 声明指定大小数组
     *
     * @param capacity 默认数组声明
     */
    public Array(int capacity) {
        this.capacity = capacity;
        s = new Object[capacity];
    }

    @Override
    public int getSize() {
        return top + 1;
    }

    @Override
    public boolean isEmpty() {
        return top < 0;
    }

    @Override
    public void push(Object ele) throws Exception {
        //防止数组溢出
        if (CAPACITY >= getSize()) {
            throw new Exception("栈溢出");
        }
    }

    @Override
    public Object pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("空栈");
        }
        return s[top];
    }

    @Override
    public Object top() throws Exception {
        //空数组无法取数据
        if (isEmpty()) {
            throw new Exception("空栈");
        }
        return s[top];
    }
}
