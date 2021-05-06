package com.dataStructure;

public class Queue {
    private static class Node {
        private Object data;
        private Node next;
        private Node(Object data) {
            this.data = data;
        }
    }

    Node head;
    Node tail;

    public boolean isEmpty() {
        return head == null;
    }

    public Object peek() {
        if (head == null) return null;
        return head.data;
    }

    public void add(Object newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public Object remove() {
        if (head == null) return null;
        Object removedData = head.data;
        head = head.next;
        return removedData;
    }

    public Object getData(Node node) {
        return node.data;
    }
}
