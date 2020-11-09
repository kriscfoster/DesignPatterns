package com.kriscfoster.templateMethod;

public class Main {

    public static void main(String[] args) {
        System.out.println("HTML Report");
        HTMLReport htmlReport = new HTMLReport();
        htmlReport.outputReport();

        System.out.println();
        System.out.println("Plain Text Report");
        PlainTextReport plainTextReport = new PlainTextReport();
        plainTextReport.outputReport();
    }
}
