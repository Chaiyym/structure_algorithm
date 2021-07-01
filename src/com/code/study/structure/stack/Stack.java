package com.code.study.structure.stack;

/**
 * 栈接口定义
 *
 * @author chaiyym
 * @createTime 2021/6/30 16:41
 */
public interface Stack {
    /**
     * 获取栈中元素数量
     *
     * @return 栈中元素数量
     */
    int getSize();

    /**
     * 判断栈是否为空
     *
     * @return 栈是否为空
     */
    boolean isEmpty();

    /**
     * 入栈
     *
     * @param ele 入栈元素
     */
    void push(Object ele) throws Exception;

    /**
     * 出栈
     *
     * @return 栈元素
     */
    Object pop() throws Exception;

    /**
     * 取栈顶元素(不出栈)
     *
     * @return 栈顶元素
     */
    Object top() throws Exception;
}
