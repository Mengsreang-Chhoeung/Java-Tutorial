package com.mengsreang.java.tutorial.inner_class;

public class Main {

    public static void main(String[] args) {

        // create objects
        Fruit fruit = new Fruit();
        Fruit.Apple apple = fruit.new Apple();
        // add values to attribute of objects
        fruit.name = "Apple";
        fruit.price = 1.0;
        // output
        apple.output();

    }

}
