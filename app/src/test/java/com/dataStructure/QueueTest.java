package com.dataStructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    private Queue queue;
    @BeforeEach
    public void setup() {
        queue = new Queue();
    }

    @Test
    public void isEmptyShouldBeTrueForEmptyQueue() {
        assertTrue(queue.isEmpty());
    }

    @Test
    public void peakShouldReturnNullForEmptyQueue() {
        assertEquals(null, queue.peek());
    }

    @Test
    public void peakShouldReturnDataForTheFrontItem() {
        queue.add(1);
        queue.add(2);
        queue.add(3);
        assertEquals(1, queue.peek());
    }

    @Test
    public void addShouldAddNewNodeToBackOfQueue() {

        queue.add(1);
        assertEquals(1, queue.getData(queue.tail));

        queue.add(2);
        assertEquals(2, queue.getData(queue.tail));

        queue.add(3);
        assertEquals(3, queue.getData(queue.tail));
    }

    @Test
    public void removeShouldRemoveTheFrontItemAndReturnItsData() {

        queue.add(1);
        queue.add(2);
        queue.add(3);
        assertEquals(1, queue.remove());
    }
}