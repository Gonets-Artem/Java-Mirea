package com.company;

public class TopManager implements EmployeePosition {
    private Company comp;
    private double salaryForCompany = 0;

    public TopManager(Company comp) {
        this.comp = comp;
    }

    @Override
    public String getJobTitle() {
        return "TopManager";
    };

    @Override
    public double calcSalary(double baseSalary) {
        if (comp.getIncome() > Math.pow(10, 7)) {
            return 2.5 * baseSalary;
        }
        else {
            return baseSalary;
        }
    }

    @Override
    public double getSalaryForCompany() {
        return salaryForCompany;
    }
}