package com.algorithm;

public class QuickSort {

    public void quickSort(int[] array) {
        if (array.length <= 1) return;
        quickSort(array, 0, array.length - 1);
    }

    public void quickSort(int[] array, int left, int right) {
        if (left >= right) return;
        int pivot = array[left + (right - left) / 2];
        int index = partition(array, left, right, pivot);
        quickSort(array, left, index - 1);
        quickSort(array, index, right);
    }

    private int partition(int[] array, int left, int right, int pivot) {
        while (left <= right) {
            while (array[left] < pivot) {
                left++;
            }
            while (array[right] > pivot) {
                right--;
            }
            if (left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    private void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
