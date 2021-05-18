package com.algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    Sorter bubbleSorter = new BubbleSort();

    @Test
    public void bubbleSort_doNothing_emptyArray() {
        // setup
        int[] array = {};
        // execute
        bubbleSorter.sort(array);
        // assert
        assertEquals(0, array.length);
    }

    @Test
    public void bubbleSort_doNothing_oneElementArray() {
        // setup
        int[] array = {3};
        int[] expected = {3};
        // execute
        bubbleSorter.sort(array);
        // assert
        assertArrayEquals(expected, array);
    }

    @Test
    public void bubbleSort_sortTheArray_evenSizeGreaterThanOne() {
        // setup
        int[] array = {3, 5, 6, 4, 7, 1};
        int[] expected = {1, 3, 4, 5, 6, 7};
        // execute
        bubbleSorter.sort(array);
        // assert
        assertArrayEquals(expected, array);
    }

    @Test
    public void bubbleSort_sortTheArray_oddSizeGreaterThanOne() {
        // setup
        int[] array = {3, -1, 5, 6, 4, 7, 1};
        int[] expected = {-1, 1, 3, 4, 5, 6, 7};
        // execute
        bubbleSorter.sort(array);
        // assert
        assertArrayEquals(expected, array);
    }
}