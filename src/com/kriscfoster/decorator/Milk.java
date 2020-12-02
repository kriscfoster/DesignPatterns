package com.kriscfoster.decorator;

public class Milk extends CoffeeCondiment {

    public Milk(Coffee coffee) {
        super(coffee);
    }

    public String description() {
        return super.description() + ", milk";
    }

    public Double price() {
        return super.price() + 0.25;
    }
}
