package com.kriscfoster.decorator;

public abstract class CoffeeCondiment implements Coffee {
    private Coffee coffee;

    public CoffeeCondiment(Coffee coffee) {
        this.coffee = coffee;
    }

    public String description() {
        return coffee.description();
    }

    public Double price() {
        return coffee.price();
    }
}
