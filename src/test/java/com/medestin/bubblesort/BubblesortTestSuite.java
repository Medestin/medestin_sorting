package com.medestin.bubblesort;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BubblesortTestSuite {
    private Bubblesort bubblesort = new Bubblesort();
    private int[] array = new int[5];

    @Before
    public void initArray(){
        array = new int[10000];

        for(int i = 0; i < array.length; ++i){
            array[i] = (int) (Math.random() * 1000);
        }
    }

    @Test
    public void testBubblesort(){
       bubblesort.sort(array);

       for(int i = 0; i < array.length-1; ++i){
           assertTrue(array[i] <= array[i+1]);
       }
    }
}