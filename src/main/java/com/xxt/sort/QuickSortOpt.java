package com.xxt.sort;

/**
 * 数组元素小于M时转为插入排序的快速排序算法
 */
public class QuickSortOpt extends QuickSort {

    //指定当数组长度小于M时使用插入排序
    private int M;

    public QuickSortOpt(int m) {
        M = m;
    }

    @Override
    protected void sort(Comparable[] a, int lo, int hi) {
        if (lo + M >= hi) {
            //使用插入排序
            insertionSort(a, lo, hi);
            return;
        }
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }


    /**
     * 内嵌一个插入排序
     *
     * @param a
     */
    private void insertionSort(Comparable[] a, int lo, int hi) {
        for (int i = lo + 1; i < hi - lo + 1; i++) {
            int idx = i;
            Comparable temp = a[i];
            for (int j = i; j > 0 && less(temp, a[j - 1]); j--) {
                a[j] = a[j - 1];
                idx = j - 1;
            }
            a[idx] = temp;
        }
    }
}
