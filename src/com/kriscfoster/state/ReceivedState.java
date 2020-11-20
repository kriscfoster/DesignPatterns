package com.kriscfoster.state;

public class ReceivedState implements PackageState {

    public void next(Package p) {
        System.out.println("This package is already received by a client.");
    }

    public void print() {
        System.out.println("Package received by recipient, nothing more to do.");
    }
}
