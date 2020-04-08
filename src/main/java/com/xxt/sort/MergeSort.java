package com.xxt.sort;

/**
 * 自顶向下的归并排序
 */
public abstract class MergeSort extends AbstractSort {

    protected Comparable[] aux;

    /**
     * 抽象出的原地归并实现
     * 它将a的子数组a[lo,mid]和a[mid+1,hi]归并成一个有序数组并将结果放在a[]中
     * 这个操作需要一个辅助数组，用于存放a[]中的元素然后进行归并到原数组
     *
     * @param a
     * @param lo
     * @param mid
     * @param hi
     */
    protected void merge(Comparable[] a, int lo, int mid, int hi) {
        int i = lo;
        int j = mid + 1;

        //复制
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        //回归
        for (int k = lo; k <= hi; k++) {
            if (i > mid) a[k] = aux[j++];//表示左半已经回归完了
            else if (j > hi) a[k] = aux[i++];//表示右半已经回归完了
                // 谁小回归谁
            else if (less(aux[i], aux[j])) a[k] = aux[i++];
            else a[k] = aux[j++];
        }
    }
}
