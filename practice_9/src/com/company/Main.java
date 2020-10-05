package com.company;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Company company = new Company();
        String[] arrFirstName = {"Ivan", "Artem", "Anatoliy", "Egor", "Maksim", "Gleb", "Andrei", "Dmitriy", "Igor", "Matvey"};
        String[] arrSecondName = {"Filatov", "Gonets", "Dmitriev", "Gridasov", "Grevtsov", "Karvasarniy", "Pyrkin", "Karpov", "Chen", "Samokhin"};
        String[] arrTown = {"Moscow", "Tomsk", "Omsk", "Voronezh", "Volgograd", "Kazan", "Ryazan", "Kaluga", "Ufa", "Penza"};
        for (int i = 0; i < 100; i++) {
            String firstName = arrFirstName[(int)(Math.random()*10)];
            String secondName = arrSecondName[(int)(Math.random()*10)];
            LocalDate date = LocalDate.of(
                    (int)(Math.random() * 47 + 1955),
                    (int)(Math.random() * 11 + 1),
                    (int)(Math.random() * 28 + 1)
            );
            String town = arrTown[(int)(Math.random()*10)];
            String phoneNumber = "89" + ((int)(Math.random() * 9 * Math.pow(10, 8) + Math.pow(10, 8)));
            int salary = (int)(Math.random() * 80000 + 20000);
            company.addEmployee((new Employee(firstName, secondName, date, town, phoneNumber, salary)));
        }

        company.doSomething(
                new SalarySelector(66666, 77777),
                ((employee, index) -> System.out.println("^^^^^^^" + index + ": " + employee))
        );
        System.out.println();

        company.doSomething(new EmployeeSelector() {
            @Override
            public boolean isNeedEmployee(Employee employee) {
                return employee.getSalary() >= 66666
                        && employee.getSalary() <= 77777;
            }
        }, new EmployeeHandle() {
            @Override
            public void handleEmployee(Employee employee, int index) {
                System.out.println("*******" + index + ": " + employee);
            }
        });
        System.out.println();

        ArrayList<Employee> selection = new ArrayList<>();
        company.doSomething(
                employee -> employee.getSalary() >= 66666 && employee.getSalary() <= 77777,
                (employee, index) -> selection.add(employee)
        );
        for (int i = 0; i < selection.size(); i++) {
            System.out.println("-------" + i + ": " + selection.get(i));
        }
    }
}
