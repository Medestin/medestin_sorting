package com.medestin.mergesort;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MergesortTestSuite {
    private int[] array = new int[5];

    @Before
    public void initArray() {
        array = new int[100];

        for (int i = 0; i < array.length; ++i) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    @Test
    public void testMergeSort() {
        Mergesort.mergesort(array);

        for (int i = 0; i < array.length - 1; ++i) {
            assertTrue(array[i] <= array[i + 1]);
        }
    }
}