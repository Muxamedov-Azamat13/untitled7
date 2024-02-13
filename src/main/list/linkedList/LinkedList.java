package main.list.linkedList;

import main.list.GbList;

import java.util.Iterator;

public class LinkedList<T> implements GbList<T> {
    private Node<T> head;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void insertBeginning(T elem) {
        Node<T> newNode = new Node<>(elem);
        newNode.next = head;
        head = newNode;
        size++;
    }

    @Override
    public void insertEnd(T elem) {
        Node<T> newNode = new Node<>(elem);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    @Override
    public T getElementIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Индекс находиться вне диапазона!");
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<T> current = head;

        while (current != null) {
            result.append(current.data);
            if (current.next != null) {
                result.append(", ");
            }
            current = current.next;
        }

        result.append("]");
        return result.toString();
    }
}
