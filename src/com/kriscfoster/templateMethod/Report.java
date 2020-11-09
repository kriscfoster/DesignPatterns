package com.kriscfoster.templateMethod;

public abstract class Report {
    protected String title;
    protected String[] text;

    Report() {
        title = "Monthly Report";
        text = new String[]{"Things are going", "very, very well"};
    }

    public void outputReport() {
        outputStart();
        outputHead();
        outputBodyStart();
        outputBody();
        outputBodyEnd();
        outputEnd();
    }

    void outputBody() {
        for (String t : text) {
            outputLine(t);
        }
    }

    protected abstract void outputEnd();

    protected abstract void outputBodyEnd();

    protected abstract void outputBodyStart();

    protected abstract void outputStart();

    protected abstract void outputHead();

    protected abstract void outputLine(String t);
}
