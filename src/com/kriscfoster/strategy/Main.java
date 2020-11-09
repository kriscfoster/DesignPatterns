package com.kriscfoster.strategy;

public class Main {

    public static void main(String[] args) {
        Report report = new Report(new HTMLFormatter(), "something", new String[]{ "this", "is", "cool" });
        System.out.println("HTML Report\n---------");
        report.outputReport();
        report.setFormatter(new PlainTextFormatter());
        System.out.println("\nPlain Text Report\n---------");
        report.outputReport();
    }
}
