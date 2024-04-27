package org.lessons;

public class MyArrayListExample {
    public static void main(String[] args) {
        MyArrayList<Integer> myList = new MyArrayList<>(5);
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        myList.add(50);

        for (int i = 0; i < myList.size(); i++) {
            System.out.println("Элемент по индексу " + i + ": " + myList.get(i));
        }
        myList.remove(2);
        System.out.println("Размер списка после удаления: " + myList.size());
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("Элемент по индексу " + i + ": " + myList.get(i));
        }
    }
}