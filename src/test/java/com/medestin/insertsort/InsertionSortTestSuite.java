package com.medestin.insertsort;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class InsertionSortTestSuite {
    private InsertionSort insertionSort = new InsertionSort();
    private int[] array = new int[5];

    @Before
    public void initArray(){
        array = new int[100];

        for(int i = 0; i < array.length; ++i){
            array[i] = (int) (Math.random() * 100);
        }
    }

    @Test
    public void testInsertionSort(){
        insertionSort.sort(array);

        for(int i = 0; i < array.length-1; ++i){
            assertTrue(array[i] <= array[i+1]);
        }
    }
}