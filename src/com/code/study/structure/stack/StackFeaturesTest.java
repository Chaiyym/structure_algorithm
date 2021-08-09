package com.code.study.structure.stack;

/**
 * @author chaiyym
 * @createTime 2021/7/1 14:58
 */
public class StackFeaturesTest {
    public static void main(String[] args) throws Exception {

        //反转
//        System.out.println(Arrays.toString(StackFeaturesTest.reverse(new Integer[]{1, 2, 3})));
        //阶乘
//        System.out.println(StackFeaturesTest.factorial(4));
        System.out.println(StackFeaturesTest.parenMatch(new String[]{"{", "{", "}", "}", "}", "}"}));
    }

    /**
     * 利用栈的先进后出的的特性,进行数组倒置
     *
     * @param array
     * @return
     * @throws Exception
     */
    public static Integer[] reverse(Integer[] array) throws Exception {
        StackArray tmp = new StackArray(array.length);
        Integer[] res = new Integer[array.length];
//        123
        for (int i = 0; i < array.length; i++) {
            tmp.push(array[i]);
        }
//        321
        for (int i = 0; i < array.length; i++) {
            res[i] = (Integer) tmp.pop();
        }
        return res;
    }

    /**
     * 阶乘
     *
     * @param num
     * @return res
     */
    public static long factorial(long num) {
        if (num <= 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    /**
     * 符号是否匹配  {{{{}}}}
     *
     * @param s
     * @return
     */
    public static boolean parenMatch(String[] s) throws Exception {
        StackArray stackArray = new StackArray(s.length);
        for (String entry : s) {
            if ("{".equals(entry)) {
                stackArray.push(entry);
            } else if ("}".equals(entry)) {
                if (stackArray.isEmpty()) {
                    return false;
                }
                if (!stackArray.pop().equals("{")) {
                    return false;
                }
            }
        }
        if (stackArray.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }
}
