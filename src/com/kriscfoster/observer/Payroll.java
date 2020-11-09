package com.kriscfoster.observer;

public class Payroll implements Observer {

    @Override
    public void update(Subject subject) {
        Employee employee = (Employee) subject;
        String string = employee.getName() +
                " salary is now " +
                employee.getSalary();
        System.out.println(string);
    }
}
