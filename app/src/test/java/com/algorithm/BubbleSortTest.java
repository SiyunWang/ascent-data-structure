package com.algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    BubbleSort sorter = new BubbleSort();

    @Test
    public void bubbleSort_doNothing_emptyArray() {
        // setup
        int[] array = {};
        // execute
        sorter.bubbleSort(array);
        // assert
        assertEquals(0, array.length);

    }

    @Test
    public void bubbleSort_doNothing_oneElementArray() {
        // setup
        int[] array = {3};
        int[] expected = {3};
        // execute
        sorter.bubbleSort(array);
        // assert
        assertArrayEquals(expected, array);
    }

    @Test
    public void bubbleSort_sortTheArray_sizeGreaterThanOne() {
        // setup
        int[] array = {3, 5, 6, 4, 7, 1};
        int[] expected = {1, 3, 4, 5, 6, 7};
        // execute
        sorter.bubbleSort(array);
        // assert
        assertArrayEquals(expected, array);
    }
}