package com.kriscfoster.state;

public class OrderedState implements PackageState {

    public void next(Package p) {
        p.setState(new DeliveredState());
    }

    public void print() {
        System.out.println("Package ordered, not delivered to the office yet.");
    }
}
