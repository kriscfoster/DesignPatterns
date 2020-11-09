package com.kriscfoster.templateMethod;

import static java.lang.String.format;

public class HTMLReport extends Report {
    protected void outputEnd() {
        System.out.println("</html>");
    }

    protected void outputBodyEnd() {
        System.out.println("</body>");
    }

    protected void outputBodyStart() {
        System.out.println("<body>");
    }

    public void outputStart() {
        System.out.println("<html>");
    }

    protected void outputHead() {
        System.out.println("<head>");
        System.out.println(format("<title>%s</title>", title));
        System.out.println("</head>");
    }

    protected void outputLine(String t) {
        System.out.println(t);
    }
}
