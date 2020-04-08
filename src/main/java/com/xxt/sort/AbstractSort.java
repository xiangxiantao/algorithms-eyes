package com.xxt.sort;

/**
 * 排序算法的抽象类
 */
public abstract class AbstractSort {

    /**
     * 排序
     *
     * @param a
     */
    protected abstract void sort(Comparable[] a);

    /**
     * 两个元素大小比较
     * 后者比前者大返回ture
     *
     * @param a
     * @param b
     * @return
     */
    protected boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    /**
     * 交换数组中两个元素的位置
     */
    protected void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "    ");
        }
    }

    /**
     * 判断数组是否有序
     *
     * @param a
     * @return
     */
    public boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1]))
                return false;
        }
        return true;
    }

}
