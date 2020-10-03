package com.company;

public class Manager implements EmployeePosition {
    private Company comp;
    private double salaryForCompany = Math.random() * 25000 + 115000;

    public Manager(Company comp) {
        this.comp = comp;
    }

    @Override
    public String getJobTitle() {
        return "Manager";
    };

    @Override
    public double calcSalary(double baseSalary){
        return baseSalary + salaryForCompany * 0.05;
    };

    @Override
    public double getSalaryForCompany() {
        return salaryForCompany;
    }
}