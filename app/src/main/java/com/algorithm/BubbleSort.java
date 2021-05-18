package com.algorithm;

public class BubbleSort implements Sorter{

    public void sort(int[] array) {
        if (array.length <= 1) return;
        boolean isSorted = false;
        int lastUnsortedIndex = array.length - 1;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    isSorted = false;
                }
            }
            lastUnsortedIndex--;
        }


    }

    private void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

}
