package com.kriscfoster.decorator;

public class Decaf implements Coffee {

    public String description() {
        return "decaf coffee";
    }

    public Double price() {
        return 2.5;
    }
}
