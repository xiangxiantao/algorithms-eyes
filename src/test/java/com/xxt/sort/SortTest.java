package com.xxt.sort;

import org.junit.Test;

import java.util.Random;

public class SortTest {

    private static Comparable[] example = new Comparable[10000000];

    static {
        Random random = new Random();
        for (int i = 0; i < 10000000; i++) {
            example[i] = random.nextInt(10000000);
        }
    }

    @Test
    public void testSelection() {
        AbstractSort sort = new SelectionSort();
        sort.sort(example);
        //sort.show(example);
    }

    @Test
    public void testInsertionV1() {
        AbstractSort sort = new InsertionSort();
        sort.sort(example);
        //sort.show(example);
    }

    @Test
    public void testInsertionV2() {
        AbstractSort sort = new InsertionSortV2();
        sort.sort(example);
        //sort.show(example);
    }


    @Test
    public void testMergeDown() {
        AbstractSort sort = new MergeDownSort();
        sort.sort(example);
        //sort.show(example);
    }

    @Test
    public void testMergeUp() {
        AbstractSort sort = new MergeUpSort();
        sort.sort(example);
        //sort.show(example);
    }

    /**
     * 10000000:3s458
     */
    @Test
    public void testQuick() {
        AbstractSort sort = new QuickSort();
        sort.sort(example);
        //sort.show(example);
    }

    /**
     * 10000000:3s141
     */
    @Test
    public void testQuickOpt() {
        AbstractSort sort = new QuickSortOpt(100);
        sort.sort(example);
        //sort.show(example);
    }

    @Test
    public void testQuick3Way() {
        AbstractSort sort = new QuickSort3Way();
        sort.sort(example);
        //sort.show(example);
    }

}
