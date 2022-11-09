package com.mengsreang.java.tutorial.inheritance.multiple;

// Sub Class
public class Apple implements FruitName, FruitPrice {
    @Override
    public void printFruitName() {
        System.out.println("Fruit name: Apple");
    }

    @Override
    public void printFruitPrice() {
        System.out.println("Fruit price: $1.0");
    }
}
