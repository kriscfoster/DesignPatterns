package com.kriscfoster.strategy;

import static java.lang.String.format;

public class PlainTextFormatter implements Formatter {

    public void outputReport(String title, String[] text) {
        outputHead(title);
        outputBody(text);
    }

    private void outputHead(String title) {
        System.out.println(format("*** %s ***", title));
    }

    private void outputBody(String[] text) {
        for (String t : text) {
            outputLine(t);
        }
    }

    private void outputLine(String t) {
        System.out.println(t);
    }
}
