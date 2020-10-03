package com.company;

import java.util.*;

public class Company {

    private List<Employee> employees = new ArrayList<>();

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getTopSalaryStaff(int count) {
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int)(o2.getSalary() - o1.getSalary());
            }
        });
        List<Employee> TopSalaryStaff = new ArrayList<>();
        if (count <= employees.size()) {
            if (count >= 1) {
                for (int i = 0; i < count; i++) {
                    TopSalaryStaff.add(employees.get(i));
                }
            }
        }
        else {
            for (int i = 0; i < employees.size(); i++) {
                TopSalaryStaff.add(employees.get(i));
            }
        }
        return TopSalaryStaff;
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int)(o1.getSalary() - o2.getSalary());
            }
        });
        List<Employee> TopSalaryStaff = new ArrayList<>();
        if (count <= employees.size()) {
            if (count >= 1) {
                for (int i = 0; i < count; i++) {
                    TopSalaryStaff.add(employees.get(i));
                }
            }
        }
        else {
            for (int i = 0; i < employees.size(); i++) {
                TopSalaryStaff.add(employees.get(i));
            }
        }
        return TopSalaryStaff;
    }

    public double getIncome() {
        double income = 0;
        for (int i = 0; i < employees.size(); i++) {
            income += employees.get(i).getPosition().getSalaryForCompany();
        }
        return income;
    }

    public void hire(Employee employee) {
        employees.add(employee);
    }

    public void hireAll(List<Employee> toHire) {
        employees.addAll(toHire);
    }

    // удаление с начала и с конца списка
//    public void fire(double percent) {
//        int delete = (int)(employees.size()*percent/100);
//        for (int i = 0; i < delete/2; i++) {
//            employees.remove(0);
//            employees.remove(employees.size() - 1);
//        }
//        if (delete % 2 == 1) {
//            employees.remove(0);
//        }
//    }

    // рандомное удаление
    public void fire(double percent) {
        int delete = (int)(employees.size()*percent/100);
        for (int i = 0; i < delete; i++) {
            employees.remove((int)(Math.random() * (employees.size() - 1)));
        }
    }
}