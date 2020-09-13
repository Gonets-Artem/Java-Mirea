package com.company.task2num1;

public class Shape {
    private String name;
    private double area;

    public Shape(String name, double area) {
        setName(name);
        setArea(area);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String toString() {
        return "name: " + getName() +
                ", area: " + getArea();
    }
}
