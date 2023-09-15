package task01;
// Реализовать стэк с помощью массива. 
// Нужно реализовать методы:
// size(), empty(), push(), peek(), pop().

import java.util.Arrays;

public class GbStack<T> {
    private T[] array;
    private int top;
    private int capacity;

    public GbStack() {
        int size = 5;
        array = (T[])new Object[size];
        capacity = size;
        top = -1;
    }

    public int size() {
        return top + 1;
    }

    public boolean empty() {
        return top == -1;
    }

    public T peek() {
        if(!empty()) {
            return array[top];
        } else {
            throw new RuntimeException("Stack is empty.");
        }
    }

    public T pop() {
        if(empty()) {
            throw new RuntimeException("Stack is empty.");
        }
        peek();
        return array[top--];
    }

    public GbStack<T> push(T value) {
        if(isFull()) {
            addCapacity();
        }
        array[++top] = value;
        return this;
    }

    private boolean isFull() {
        return size() == capacity;
    }

    private void addCapacity() {
        T[] copy = (T[])new Object[array.length + array.length / 2];
        System.arraycopy(array, 0, copy, 0, array.length);
        array = copy;
        capacity = array.length;
    }

    @Override
    public String toString() {
        if(size() == 0) {
            return "[]";
        }
        return Arrays.toString(array);
    }

}
