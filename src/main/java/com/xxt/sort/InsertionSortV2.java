package com.xxt.sort;

/**
 * 插入排序，利用直接右移操作减少数组的访问次数
 */
public class InsertionSortV2 extends AbstractSort {
    @Override
    protected void sort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
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
