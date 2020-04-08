package com.xxt.sort;

/**
 * 三向切分的快速排序
 * 对数组中包含大量重复元素的情况进行了优化
 */
public class QuickSort3Way extends QuickSort {

    @Override
    protected void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) return;
        int lt = lo, i = lo + 1, gt = hi;
        Comparable v = a[lo];
        while (i <= gt) {
            int cmp = a[i].compareTo(v);
            if (cmp < 0) {
                exch(a, lt++, i++);
            } else if (cmp > 0) {
                exch(a, i, gt--);
            } else i++;
        }

        //经过上述操作，[lt,gt]之间的元素就是等于v的元素，顺序已固定，不需要再参与递归，由此提升了效率
        sort(a, lo, lt - 1);
        sort(a, gt + 1, hi);
    }
}
