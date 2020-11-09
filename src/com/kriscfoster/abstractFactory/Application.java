package com.kriscfoster.abstractFactory;

public class Application {
    private Button button;
    private ScrollBar scrollBar;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        scrollBar = factory.createScrollBar();
    }

    public void paint() {
        button.paint();
        scrollBar.paint();
    }
}
