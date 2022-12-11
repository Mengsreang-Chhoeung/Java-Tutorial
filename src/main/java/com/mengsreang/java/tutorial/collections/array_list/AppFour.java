package com.mengsreang.java.tutorial.collections.array_list;

import java.util.ArrayList;
import java.util.Collections;

public class AppFour {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
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
