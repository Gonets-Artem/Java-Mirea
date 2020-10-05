package com.company;

public class SalarySelector implements EmployeeSelector{

    private double salaryMin;
    private double salaryMax;

    public SalarySelector(double salaryMin, double salaryMax) {
        this.salaryMin = salaryMin;
        this.salaryMax = salaryMax;
    }

    @Override
    public boolean isNeedEmployee(Employee employee) {
        return employee.getSalary() >= salaryMin
                && employee.getSalary() <= salaryMax;
    }
}
