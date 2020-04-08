package com.xxt.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 基础快速排序
 * 算法改进：
 * 1.切换到插入算法：对于小数组，插入比快排更快
 */
public class QuickSort extends AbstractSort {

    @Override
    public void sort(Comparable[] a) {
        //乱序
        List<Comparable> comparables = Arrays.asList(a);
        Collections.shuffle(comparables);
        a = comparables.toArray(a);

        sort(a, 0, a.length - 1);

    }

    protected void sort(Comparable[] a, int lo, int hi) {
        if (lo >= hi) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    /**
     * 分组
     *
     * @param a
     * @param lo
     * @param hi
     * @return
     */
    protected int partition(Comparable[] a, int lo, int hi) {
        int m = lo;
        int n = hi + 1;
        Comparable v = a[lo];
        while (true) {
            //从lo的右侧第一位开始，不断右移直到找到一个大于a[lo]的数或者移动到数组尾部停止
            while (less(a[++m], v)) {
                if (m == hi)
                    break;
            }

            //从数组尾部不断左移直到找到一个小于a[lo]的数或者移动到数组头部停止
            while (less(v, a[--n])) {
                if (n == lo)//这个条件其实时冗余的。当n==lo时，less(v,a[n])==less(v,a[lo])==false，进入不了这个循环
                    break;
            }

            //循环的退出条件
            if (m >= n)
                break;

            exch(a, m, n);
        }

        //切分到达中止条件时，m和n的位置已经发生了互换，所以这里lo是和n(起始指向数组尾部的索引)交换
        exch(a, lo, n);
        return n;
    }

}
