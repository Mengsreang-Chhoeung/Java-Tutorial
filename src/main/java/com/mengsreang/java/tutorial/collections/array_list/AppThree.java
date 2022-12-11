package com.mengsreang.java.tutorial.collections.array_list;

import java.util.ArrayList;

public class AppThree {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        // Accessing the element
        System.out.println("Element of index 0: " + list.get(0));
        // Changing the element
        System.out.println("Changing element of index 0 ....");
        list.set(0, "Cherry");
        // Accessing the element
        System.out.println("Element of index 0: " + list.get(0));
        // Removing the element
        System.out.println("Removing element of index 0 ....");
        list.remove(0);
        // Output
        for (String s : list) {
            System.out.println(s);
        }
        // Clearing the elements
        System.out.println("Clearing element ....");
        list.clear();
        // Output
        System.out.println(list);
    }

}
