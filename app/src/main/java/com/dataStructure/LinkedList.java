package com.dataStructure;

public class LinkedList {

    private static class Node {
        private Object data;
        private Node next;
        private Node(Object data) {
            this.data = data;
        }

    }

    Node head;

    public boolean isEmpty() {
        return head == null;
    }

    public void add (Object newObject) {
        Node newNode = new Node(newObject);
        if (head == null) {
            head = newNode;
            return;
        }
        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = newNode;
    }

    public Object getFirst() {
        return head.data;
    }

    public Object getLast() {
        if (head == null) return null;
        if (head.next == null) return head.data;
        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        return cur.data;
    }

    public Object get(int num) {
        Node cur = head;
        int count = 1;
        while (cur != null) {
            if (count == num) {
                return cur.data;
            }
            cur = cur.next;
            count++;
        }
        throw new IndexOutOfBoundsException();
    }
    public int contains(Object object) {
        Node cur = head;
        int index = 0;
        while (cur != null) {
            if (object.equals(cur.data)) {
                return index;
            }
            cur = cur.next;
            index++;
        }
        return -1;
    }
    public void delete(Object object) {
        Node prev = null;
        Node cur = head;
        while (!object.equals(cur.data)) {
            prev = cur;
            cur = cur.next;
        }
        prev.next = cur.next;
    }

    public void delete(int num) {
        Node cur = null;
        Node next = head;
        int count = 1;
        while (count != num) {
            cur = next;
            next = next.next;
            count++;
        }
        cur.next = next.next;
    }

}


