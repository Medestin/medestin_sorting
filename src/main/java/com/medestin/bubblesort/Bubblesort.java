package com.medestin.bubblesort;

public final class Bubblesort {

    public void sort(int[] array){
        int length = array.length;
        boolean somethingSwapped = true;

        while(somethingSwapped) {
            somethingSwapped = false;
            for (int i = 0; i < length - 1; ++i) {
                if (array[i] > array[i + 1]) {
                    int placeholder = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = placeholder;
                    somethingSwapped = true;
                }
            }
        }
    }
}
