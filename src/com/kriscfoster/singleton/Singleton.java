package com.kriscfoster.singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton() {}

    protected static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
