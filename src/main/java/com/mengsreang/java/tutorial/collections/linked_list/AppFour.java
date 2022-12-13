package com.mengsreang.java.tutorial.collections.linked_list;

import java.util.Collections;
import java.util.LinkedList;

public class AppFour {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        // Sorting the list
        Collections.sort(list);
        // Output
        for (String s : list) {
            System.out.println(s);
        }
    }

}
