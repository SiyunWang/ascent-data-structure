package com.dataStructure;

public class Stack {
    private static class Node {
        private Object data;
        private Node next;
        private Node(Object data) {
            this.data = data;
        }
    }

    Node top;

    public boolean isEmpty() {
        return top == null;
    }

    public Object peek() {
        if (top == null) return null;
        return top.data;
    }

    public void push(Object newObject) {
        Node newNode = new Node(newObject);
        newNode.next = top;
        top = newNode;
    }

    public Object pop() {
        if (top == null) return null;
        Object removedData = top.data;
        top = top.next;
        return removedData;
    }
}
