package com.mengsreang.java.tutorial.collections.array_list;

import java.util.ArrayList;
import java.util.Collections;

public class AppFive {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
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
