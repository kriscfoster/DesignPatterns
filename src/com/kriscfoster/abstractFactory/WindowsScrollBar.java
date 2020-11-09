package com.kriscfoster.abstractFactory;

public class WindowsScrollBar implements ScrollBar {

    @Override
    public void paint() {
        System.out.println("WindowsScrollBar created");
    }
}
