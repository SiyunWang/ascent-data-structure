package com.dataStructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    private Stack stack;
    @BeforeEach
    public void setup() {
        stack = new Stack();
    }

    @Test
    public void isEmptyShouldBeTrueForEmptyStack() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void peekShouldReturnNullForEmptyStack() {
        assertEquals(null, stack.peek());
    }

    @Test
    public void peekShouldReturnTheTopObjectOnNonEmptyStack() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.peek());
    }

    @Test
    public void pushShouldAddNewObjectToTheTopOfStack() {
        stack.push(1);
        assertEquals(1, stack.peek());
        stack.push(2);
        assertEquals(2, stack.peek());
        stack.push(3);
        assertEquals(3, stack.peek());
    }

    @Test
    public void popShouldRemoveTheTopNodeAndReturnItsData() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.pop());
    }
}