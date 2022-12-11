package com.mengsreang.java.tutorial.collections.array_list;

import java.util.ArrayList;
import java.util.Iterator;

public class AppTwo {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        // Output size of list
        System.out.println(list.size());
        // Output
        for (String s : list) {
            System.out.println(s);
        }
    }

}
