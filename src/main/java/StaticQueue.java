package main.java;

public class StaticQueue<T> implements Queue<T> {

    private final T[] elements;
    private int head;
    private int tail;
    private int size;
    private final int capacity;

    @SuppressWarnings("unchecked")
    public StaticQueue(int capacity) {
        this.capacity = capacity;
        this.elements = (T[]) new Object[capacity];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }

    @Override
    public void push(T element) {
        if (size == capacity) {
            throw new IllegalStateException("Fila cheia");
        }

        elements[tail] = element;
        tail = (tail + 1) % capacity;
        size++;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia");
        }

        T removed = elements[head];
        elements[head] = null;

        head = (head + 1) % capacity;
        size--;

        return removed;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia");
        }

        return elements[head];
    }

    @Override
    public T back() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia");
        }

        int lastIndex = (tail - 1 + capacity) % capacity;
        return elements[lastIndex];
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
        for (int i = 0; i < capacity; i++) {
            elements[i] = null;
        }

        head = 0;
        tail = 0;
        size = 0;
    }
}