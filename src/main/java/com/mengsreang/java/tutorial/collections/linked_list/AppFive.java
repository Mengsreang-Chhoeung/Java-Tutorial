package com.mengsreang.java.tutorial.collections.linked_list;

import java.util.Collections;
import java.util.LinkedList;

public class AppFive {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(100);
        list.add(50);
        list.add(60);
        list.add(25);
        // Sorting the list
        Collections.sort(list);
        // Output
        for (Integer i : list) {
            System.out.println(i);
        }
    }

}
