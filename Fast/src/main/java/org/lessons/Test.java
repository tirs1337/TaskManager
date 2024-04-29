package org.lessons;

import java.util.ArrayList;
import java.util.List;

import static org.lessons.MyStringArayList.*;

public class Test {

    public static void main(String[] args) {

        List<String> myArrayList = new MyStringArayList();
        System.out.println(myArrayList.size());
        myArrayList.add("Vova");
        myArrayList.add("Vova");
        myArrayList.add("Vova");
        myArrayList.add("Vova");
        myArrayList.add(2, "more");
        myArrayList.add(5, "more");
        System.out.println(myArrayList.size());
        myArrayList.removeLast();
        System.out.println(myArrayList.size());







    }
}
