package com.kriscfoster.abstractFactory;

public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("MacOSButton created");
    }
}
