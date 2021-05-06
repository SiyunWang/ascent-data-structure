package com.dataStructure;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class LinkedListTest {
    @Test
    public void linkedListIsEmptyWhenInitiated() {
        LinkedList linkedList = new LinkedList();
        assertTrue(linkedList.isEmpty());
    }
    @Test
    public void linkedListIsNotEmptyAfterAddingANode() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        assertFalse(linkedList.isEmpty());
    }
    @Test
    public void addsNodeToLinkedList() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add("second");
        assertEquals(1, linkedList.getFirst());
        assertEquals("second", linkedList.getLast());
    }
    @Test
    public void getFirstShouldReturnFirstNodeDataFromLinkedList() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add("second");
        assertEquals(1, linkedList.getFirst());
    }
    @Test
    public void getLastShouldReturnLastNodeFromLinkedList() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add("second");
        assertEquals("second", linkedList.getLast());
    }
    @Test
    public void getShouldReturnTheNthObject() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add("second");
        linkedList.add(true);
        assertEquals(1, linkedList.get(1));
        assertEquals("second", linkedList.get(2));
        assertEquals(true, linkedList.get(3));
    }
    @Test
    public void getShouldThrowExceptionWhenIndexOutOfBounds() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add("second");
        linkedList.add(true);
        assertThrows(IndexOutOfBoundsException.class, () -> {
            linkedList.get(4);
        });
    }
    @Test
    public void getShouldThrowExceptionWhenEmpty() {
        LinkedList linkedList = new LinkedList();
        assertThrows(IndexOutOfBoundsException.class, () -> {
            linkedList.get(1);
        });
    }
    @Test
    public void containsShould_ReturnTheIndexOfObjectIfExists() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add("second");
        linkedList.add(true);
        assertEquals(0, linkedList.contains(1));
        assertEquals(1, linkedList.contains("second"));
        assertEquals(2, linkedList.contains(true));
    }
    @Test
    public void containsShould_ReturnNeg1IfDoesNotExists() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add("second");
        linkedList.add(true);
        assertEquals(-1, linkedList.contains(4));
    }
    @Test
    public void deleteShouldRemoveGivenNode() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add("second");
        linkedList.add(true);
        linkedList.delete("second");
        assertEquals(-1, linkedList.contains("second"));
        assertEquals(0, linkedList.contains(1));
        assertEquals(1, linkedList.contains(true));
    }
    @Test
    public void deleteShouldRemoveNodeGivenInt() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add("second");
        linkedList.add(true);
        linkedList.delete(2);
        assertEquals(-1, linkedList.contains("second"));
        assertEquals(0, linkedList.contains(1));
        assertEquals(1, linkedList.contains(true));
    }
}