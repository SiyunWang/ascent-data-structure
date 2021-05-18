package com.algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {
    MergeSort mergeSorter = new MergeSort();

    @Test
    public void mergeSort_doNothing_emptyArray() {
        // setup
        int[] array = {};
        // execute
        mergeSorter.sort(array);
        // assert
        assertEquals(0, array.length);
    }

    @Test
    public void mergeSort_doNothing_oneElementArray() {
        // setup
        int[] array = {5};
        int[] expected = {5};
        // execute
        mergeSorter.sort(array);
        // assert
        assertArrayEquals(expected, array);
    }

    @Test
    public void mergeSort_sortTheArray_evenSizeGreaterThanOne() {
        // setup
        int[] array = {3, 5, 6, 4, 7, 1};
        int[] expected = {1, 3, 4, 5, 6, 7};
        // execute
        mergeSorter.sort(array);
        // assert
        assertArrayEquals(expected, array);
    }

    @Test
    public void mergeSort_sortTheArray_oddSizeGreaterThanOne() {
        // setup
        int[] array = {3, -1, 5, 6, 4, 7, 1};
        int[] expected = {-1, 1, 3, 4, 5, 6, 7};
        // execute
        mergeSorter.sort(array);
        // assert
        assertArrayEquals(expected, array);
    }
}