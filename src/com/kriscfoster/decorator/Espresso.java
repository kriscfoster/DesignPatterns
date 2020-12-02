package com.kriscfoster.decorator;

public class Espresso implements Coffee {

    public String description() {
        return "espresso coffee";
    }

    public Double price() {
        return 2.0;
    }
}
