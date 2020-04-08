package com.xxt.sort;

/**
 * 插入排序
 */
public class InsertionSort extends AbstractSort {
    @Override
    protected void sort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }
}
