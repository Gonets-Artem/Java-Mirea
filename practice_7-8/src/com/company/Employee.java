package com.company;

public class Employee extends Company{

    private String firstName, secondName;
    private double baseSalary, salary;
    private EmployeePosition position;

    public Employee(String firstName, String secondName, double baseSalary, EmployeePosition position) {
        setFirstName(firstName);
        setSecondName(secondName);
        setBaseSalary(baseSalary);
        setPosition(position);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getSalary() {
        return position.calcSalary(baseSalary);
    }

    public EmployeePosition getPosition() {
        return position;
    }

    public void setPosition(EmployeePosition position) {
        this.position = position;
    }
}
