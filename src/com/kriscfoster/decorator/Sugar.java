package com.kriscfoster.decorator;

public class Sugar extends CoffeeCondiment {

    public Sugar(Coffee coffee) {
        super(coffee);
    }

    public String description() {
        return super.description() + ", sugar";
    }

    public Double price() {
        return super.price() + 0.1;
    }
}
