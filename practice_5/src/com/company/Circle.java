package com.company;

public class Circle extends Shape{
    private double radius;

    public Circle() {
        this(1);
    }

    public Circle(double radius) {
        super();
        setRadius(radius);
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle: radius = " + getRadius() +
                ", area = " + getArea() +
                ", perimeter = " + getPerimeter() +
                ", color = " + getColor() +
                ", filled = " + isFilled();
    }
}