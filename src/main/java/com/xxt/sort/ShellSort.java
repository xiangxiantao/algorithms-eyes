package com.xxt.sort;

/**
 * 希尔排序
 * 序列：（3^k-1）/2  :1,4,13,40...
 * 依照自己排序数组的大小来确定k的值
 * 最终k=1时，希尔排序就是插入排序
 */
public class ShellSort extends AbstractSort {
    @Override
    protected void sort(Comparable[] a) {
        //首先确定序列
        int h = 1;
        while (h < a.length / 3) h = 3 * h + 1;//1,4,13,40...
        while (h >= 1) {

            //使数组变为h有序(插入排序的思想)
            for (int i = h; i < a.length; i++) {
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    exch(a, j, j - h);
                }
            }

            h = h / 3;
        }
    }
}
