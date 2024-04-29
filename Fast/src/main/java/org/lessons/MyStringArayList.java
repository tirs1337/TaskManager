package org.lessons;

import java.util.*;

public class MyStringArayList implements List<String> {

    private int capacity;
    private String[] myArray;
    private int size;

    public MyStringArayList(int capacity) {
        this.capacity = capacity;
        this.myArray = new String[this.capacity];
        this.size = 0;
    }

    public MyStringArayList() {
        this.capacity = 3;
        this.size = 0;
        this.myArray = new String[this.capacity];
    }


    @Override
    public int size() {
//        int size = 0;
//        for (int i = 0; i < this.myArray.length; i++) {
//            if (this.myArray[i] != null) {
//                size ++;
//            }
//        }
//        this.size = size;
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return myArray.length == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<String> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(String s) {
        if (this.capacity - this.size == 1) {
            this.capacity *= 2;
            String[] newArray = new String[this.capacity];
            for (int i = 0; i < this.size; i++) {
                newArray[i] = this.myArray[i];
            }
            this.myArray = newArray;
        }
        this.myArray[this.size] = s;
        this.size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends String> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public String set(int index, String element) {
        return null;
    }

    @Override
    public void add(int index, String element) {
        if(index >= 0 && index <= this.size()) {
            String[] newArray = new String[this.capacity];
            for (int i = 0; i < this.size; i++) {
                newArray[i] = this.myArray[i];
            }
            this.myArray = newArray;
        }
        String s = this.myArray[this.size];
        this.size++;

    }

    @Override
    public String remove(int index) {
        String removedElement = this.myArray[index];
        this.myArray[--this.size] = null;
        return removedElement;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<String> listIterator() {
        return null;
    }

    @Override
    public ListIterator<String> listIterator(int index) {
        return null;
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public String removeLast() {
        if (this.size == 0) {
            throw new NoSuchElementException();
        }
            return this.remove(this.size() - 1);

    }
}
