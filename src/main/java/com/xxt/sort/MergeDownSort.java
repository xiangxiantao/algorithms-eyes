package com.xxt.sort;

/**
 * 自顶向下的归并排序
 */
public class MergeDownSort extends MergeSort {

    @Override
    protected void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }

    private void sort(Comparable[] a, int lo, int hi) {
        if (lo >= hi) return;//递归的终结条件
        int mid = (hi + lo) / 2;
        sort(a, lo, mid);//左半边递归排序
        sort(a, mid + 1, hi);//右半边递归排序
        merge(a, lo, mid, hi);
    }

}
