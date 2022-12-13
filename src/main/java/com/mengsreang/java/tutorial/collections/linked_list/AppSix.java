package com.mengsreang.java.tutorial.collections.linked_list;

import java.util.LinkedList;

public class AppSix {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        // Get First Element
        System.out.println("First element: " + list.getFirst());
        // Get Last Element
        System.out.println("Last element: " + list.getLast());
        // Add First Element
        list.addFirst("Cherry");
        // Add Last Element
        list.addLast("Coconut");
        // Output
        System.out.println(list);
        // Remove First Element
        list.removeFirst();
        // Remove Last Element
        list.removeLast();
        // Output
        System.out.println(list);
    }

}
