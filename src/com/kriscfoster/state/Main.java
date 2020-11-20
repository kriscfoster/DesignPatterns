package com.kriscfoster.state;

public class Main {
    public static void main(String[] args) {
        Package p = new Package();
        p.printStatus();
        p.nextState();
        p.printStatus();
        p.nextState();
        p.printStatus();
    }
}
