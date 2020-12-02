package com.kriscfoster.decorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Sugar(new Milk(new Espresso()));
        System.out.println("Description: " + coffee.description());
        System.out.println("Price: " + coffee.price());

        Coffee coffee2 = new Sugar(new Milk(new Decaf()));
        System.out.println("\nDescription: " + coffee2.description());
        System.out.println("Price: " + coffee2.price());
    }
}
