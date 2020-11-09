package com.kriscfoster.observer;

public class Employee extends Subject {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void changeSalary(int newSalary) {
        this.salary = newSalary;
        notifyObservers();
    }
}
