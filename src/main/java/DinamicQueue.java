package main.java;

public class DinamicQueue<T> implements Queue<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }

        Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node<T> date;
    private Node<T> next;

    @Override
    public void push(T element) {

        tail.next = new Node<>(element);
        tail = tail.next;
        size++;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia");
        }
        T data = head.data;
        head = head.next;
        size--;
        return data;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia");
        }

        return head.data;
    }

    @Override
    public T back() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia");
        }
        return tail.data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
}
