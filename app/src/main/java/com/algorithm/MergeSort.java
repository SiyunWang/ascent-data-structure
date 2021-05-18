package com.algorithm;

public class MergeSort {
    public void mergeSort(int[] array) {
        if (array.length <= 1) return;
        mergeSort(array, 0, array.length - 1);
    }

    public void mergeSort(int[] array, int left, int right) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);
        merge(array, left, mid, right);
    }

    private void merge(int[] array, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int p1 = left;
        int p2 = mid + 1;
        int p = 0;

        while (p1 <= mid && p2 <= right) {
            if (array[p1] <= array[p2]) {
                temp[p] = array[p1];
                p1++;
            } else {
                temp[p] = array[p2];
                p2++;
            }
            p++;
        }
        while (p1 <= mid) {
            temp[p] = array[p1];
            p1++;
            p++;
        }
        while (p2 <= right) {
            temp[p] = array[p2];
            p2++;
            p++;
        }
        
        for (int i = left; i <= right; i++) {
            array[i] = temp[i - left];
        }
    }
}
