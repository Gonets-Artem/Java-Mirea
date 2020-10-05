package com.company;

import java.util.ArrayList;

public class Company {
    private final ArrayList<Employee> employees;

    public Company() {
        employees = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void fireEmployee(int index) {
        if (index < employees.size() && index >= 0) {
            employees.remove(index);
        }
    }

    public void doSomething(
            EmployeeSelector selector,
            EmployeeHandle handler
    ) {
        int count = 0;
        for (Employee employee : employees) {
            if (selector.isNeedEmployee(employee)) {
                handler.handleEmployee(employee, count);
            }
            count++;
        }
    }
}
