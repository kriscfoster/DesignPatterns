package com.kriscfoster.templateMethod;

import static java.lang.String.format;

public class PlainTextReport extends Report {

    protected void outputEnd() {}

    protected void outputBodyEnd() {}

    protected void outputBodyStart() {}

    protected void outputStart() {}

    protected void outputHead() {
        System.out.println(format("*** %s ***", title));
    }

    protected void outputLine(String t) {
        System.out.println(t);
    }
}
