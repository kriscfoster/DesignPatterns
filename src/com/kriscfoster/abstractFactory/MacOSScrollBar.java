package com.kriscfoster.abstractFactory;

public class MacOSScrollBar implements ScrollBar {
    @Override
    public void paint() {
        System.out.println("MacOSScrollBar created");
    }
}
