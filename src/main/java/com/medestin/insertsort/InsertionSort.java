package com.medestin.insertsort;

public class InsertionSort {

    public void sort(int[] array) {

        for (int i = 1; i < array.length; ++i) {
            int currentElement = array[i];
            int iterator = 0;
            while (array[iterator] < currentElement && iterator < i) {
                ++iterator;
            }
            moveElement(array, i, iterator);
        }
    }

    private void moveElement(int[] array, int originPosition, int targetPosition){
        if(originPosition > targetPosition) {
            int placeholder = array[originPosition];
            for (int i = originPosition; i > targetPosition; --i){
                array[i] = array[i-1];
            }
            array[targetPosition] = placeholder;
        }
    }

}
