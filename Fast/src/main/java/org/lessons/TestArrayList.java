package org.lessons;

import java.util.ArrayList;

/**
 * тест коллекции ArrayList.
 */

public class TestArrayList {
    /**
     * метод main.
     * @param args - аргумент метода main.
     */
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Sergey");
        names.add("Slava");
        names.add("Vladimir");
        names.add("Sonya");
        names.add(2, ("Alesha"));
        for(String el : names) {
            System.out.println(el);
        }
        //System.out.println(names.size());
        //System.out.println(names.get(2));


    }
}
