package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	    Company company = new Company();
        List<Employee> arr = new ArrayList<>();

	    for (int i = 0; i < 180; i++) {
            String firstName = "Оператор";
            String secondName = String.valueOf(i);
            double baseSalary = Math.random() * 15000 + 30000;
            company.hire(new Employee(firstName, secondName, baseSalary, new Operator(company)));
        }
	    for (int i = 0; i < 80; i++) {
            String firstName = "Менеджер";
            String secondName = String.valueOf(i);
            double baseSalary = Math.random() * 10000 + 40000;
            company.hire(new Employee(firstName, secondName, baseSalary, new Manager(company)));
            //company.getEmployees().get(0).setPosition(new Operator(company));
        }
	    for (int i = 0; i < 10; i++) {
            String firstName = "ТопМенеджер";
            String secondName = String.valueOf(i);
            double baseSalary = Math.random() * 5000 + 50000;
            company.hire(new Employee(firstName, secondName, baseSalary, new TopManager(company)));
        }

        System.out.println("Список из 15 самых высоких зарплат (если пусто, то неправильное значение count)");
        arr = company.getTopSalaryStaff(15);
        for (int i = 0; i < arr.size(); i++) {
            System.out.printf("%.0f", arr.get(i).getSalary());
            System.out.println();
        }
        System.out.println("Список из 30 самых низких зарплат (если пусто, то неправильное значение count)");
        arr = company.getLowestSalaryStaff(30);
        for (int i = 0; i < arr.size(); i++) {
            System.out.printf("%.0f", arr.get(i).getSalary());
            System.out.println();
        }

        company.fire(50);

        System.out.println("Список из 15 самых высоких зарплат (если пусто, то неправильное значение count)");
        arr = company.getTopSalaryStaff(15);
        for (int i = 0; i < arr.size(); i++) {
            System.out.printf("%.0f", arr.get(i).getSalary());
            System.out.println();
        }
        System.out.println("Список из 30 самых низких зарплат (если пусто, то неправильное значение count)");
        arr = company.getLowestSalaryStaff(30);
        for (int i = 0; i < arr.size(); i++) {
            System.out.printf("%.0f", arr.get(i).getSalary());
            System.out.println();
        }
    }
}
