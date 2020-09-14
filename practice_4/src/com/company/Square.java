package com.company;

public class Square extends Shape {

    protected double side;

    public Square() {
        this(1);
    }
    public Square(double side) {
        super();
        setSide(side);
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return Math.pow(side, 2);
    }

    public double getPerimeter() {
        return 4*side;
    }


    public String toString() {
        return "Square: side = " + getSide() +
            ", area = " + getArea() +
                ", perimeter = " + getPerimeter() +
                ", color = " + getColor() +
                ", filled = " + isFilled();
    }
}
