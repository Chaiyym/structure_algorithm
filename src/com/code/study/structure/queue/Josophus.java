package com.code.study.structure.queue;

/**
 * @author chaiyym
 * @createTime 2021/7/20 15:12
 */
public class Josophus {
    //利用队列结构模拟Josophus环
    public static Object Josephus(Queue Q, int k) throws Exception {
        if (Q.isEmpty()) {
            return null;
        }
        while (Q.getSize() > 1) {//不断迭代
            Q.traversal();//显示当前的环
            for (int i = 0; i < k; i++)//将山芋向前传递k次
            {
                Q.enqueue(Q.dequeue());
            }
            Object e = Q.dequeue();//拿着山芋的孩子退出
            System.out.println("\n\t" + e + "退出");
        }
        return Q.dequeue();//最后剩下的那个孩子
    }

    public static Queue buildQueue(Object a[]) {
        Queue Q = new QueueArray();
        for (int i = 0; i < a.length; i++) {
            try {
                Q.enqueue(a[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return Q;
    }

//测试用mai
}
