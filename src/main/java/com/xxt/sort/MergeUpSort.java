package com.xxt.sort;

/**
 * 自底向上的归并排序
 */
public class MergeUpSort extends MergeSort {
    @Override
    protected void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        for (int size = 1; size < a.length; size = size * 2) {//子数组大小
            for (int lo = 0; lo < a.length - size; lo += size + size) {//子数组索引
                merge(a, lo, lo + size - 1, Math.min(lo + size + size - 1, a.length - 1));
            }
        }
    }
}
