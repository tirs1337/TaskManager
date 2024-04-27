package org.lessons;

import java.util.Arrays;

public class MyArrayList<T> {
    private T[] array;
    private int size;

    public MyArrayList() {
        this(10);
    }

    public MyArrayList(int initialCapacity) {
        array = (T[]) new Object[initialCapacity];
    }

    public void add(T element) {
        if (size == array.length) {
            resize();
        }
        array[size++] = element;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return array[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        array[--size] = null; // Очищаем последний элемент
    }

    public int size() {
        return size;
    }

    private void resize() {
        int newCapacity = array.length * 2;
        array = Arrays.copyOf(array, newCapacity);
    }
}
