package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {
    private final String firstName;
    private final LocalDate date;
    private String secondName, town, phoneNumber;
    private int salary;

    public Employee(String firstName, String secondName, LocalDate date, String town, String phoneNumber, int salary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.date = date;
        this.town = town;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "first_name='" + firstName + '\'' +
                ", second_name='" + secondName + '\'' +
                ", date=" + DateTimeFormatter.ofPattern("dd-MM-yyyy").format(date) +
                ", town=" + town +
                ", phoneNumber=" + phoneNumber +
                ", salary=" + salary +
                '}';
    }
}
