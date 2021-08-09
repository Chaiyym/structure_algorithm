package com.code.study.structure.queue;

/**
 * @author chaiyym
 * @createTime 2021/7/13 13:49
 */
public interface Queue {
    /**
     * 返回队列中元素数目
     *
     * @return
     */
    int getSize();

    /**
     * 判断队列是否为空
     *
     * @return
     */
    boolean isEmpty();

    /**
     * 取队首元素（但不删除）
     *
     * @return
     * @throws Exception
     */
    Object front() throws Exception;

    /**
     * 入队
     *
     * @param obj
     * @throws Exception
     */
    void enqueue(Object obj) throws Exception;

    /**
     * 出队
     *
     * @return
     * @throws Exception
     */
    Object dequeue() throws Exception;

    /**
     * 遍历
     */
    void traversal();
}









