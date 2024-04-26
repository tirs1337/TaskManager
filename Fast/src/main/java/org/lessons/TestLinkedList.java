package org.lessons;

import java.util.LinkedList;

/**
 * тест коллекции LinkedList.
 */
public class TestLinkedList {
    /**
     * метод main.
     * @param args - аргумент метода main.
     */
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(43);
        numbers.add(76);
        numbers.add(1337);
        numbers.add(2, 3);
        System.out.println(numbers);
        numbers.add(3, 222);
        System.out.println(numbers);


    }
}
