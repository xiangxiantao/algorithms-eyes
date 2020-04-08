package com.xxt.sort;

/**
 * 选择排序
 * 遍历数组选出最小元素与头元素交换
 */
public class SelectionSort extends AbstractSort {
    @Override
    protected void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            int minIdx = i;
            for (int j = i + 1; j < a.length; j++)
                if (less(a[j], a[minIdx]))
                    minIdx = j;
            exch(a, i, minIdx);
        }
    }
}
