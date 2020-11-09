package com.kriscfoster.strategy;

public class Report {

    private Formatter formatter;
    private String title;
    private String[] text;

    public Report(Formatter formatter, String title, String[] text) {
        this.formatter = formatter;
        this.title = title;
        this.text = text;
    }

    public void setFormatter(Formatter formatter) {
        this.formatter = formatter;
    }

    public void outputReport() {
        formatter.outputReport(title, text);
    }
}
