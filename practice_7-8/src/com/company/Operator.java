package com.company;

public class Operator implements EmployeePosition {
    private Company comp;
    private double salaryForCompany = 0;

    public Operator(Company comp) {
        this.comp = comp;
    }

    @Override
    public String getJobTitle() {
        return "Operator";
    };

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary;
    };

    @Override
    public double getSalaryForCompany() {
        return salaryForCompany;
    }
}