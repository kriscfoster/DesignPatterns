package com.kriscfoster.strategy;

import static java.lang.String.format;

public class HTMLFormatter implements Formatter {

    public void outputReport(String title, String[] text) {
        outputStart();
        outputHead(title);
        outputBodyStart();
        outputBody(text);
        outputBodyEnd();
        outputEnd();
    }

    private void outputEnd() {
        System.out.println("</html>");
    }

    private void outputBodyEnd() {
        System.out.println("</body>");
    }

    private void outputBodyStart() {
        System.out.println("<body>");
    }

    private void outputStart() {
        System.out.println("<html>");
    }

    private void outputHead(String title) {
        System.out.println("<head>");
        System.out.println(format("<title>%s</title>", title));
        System.out.println("</head>");
    }

    void outputBody(String[] text) {
        for (String t : text) {
            outputLine(t);
        }
    }

    private void outputLine(String t) {
        System.out.println(t);
    }
}
