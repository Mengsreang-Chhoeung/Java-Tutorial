package com.mengsreang.java.tutorial.collections.linked_list;

import java.util.LinkedList;

public class AppTwo {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
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
