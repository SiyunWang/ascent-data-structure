package com.algorithm;

public class QuickSort implements Sorter{
    @Override
    public void sort(int[] array) {
        if (array.length <= 1) return;
        sort(array, 0, array.length - 1);
    }

    public void sort(int[] array, int left, int right) {
        if (left >= right) return;
        int index = partition(array, left, right);
        sort(array, left, index - 1);
        sort(array, index, right);
    }

    private int partition(int[] array, int left, int right) {
        int pivot = array[left + (right - left) / 2];
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
