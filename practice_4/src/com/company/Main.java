package com.company;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(4.0, "blue", false);
        System.out.println(shape);

        Circle circle = (Circle)shape;
        circle.setRadius(2.0);
        circle.setColor("red");
        circle.setFilled(true);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle(3.0, 1.5);
        System.out.println(rectangle);

        Square square = new Square();
        System.out.println(square);
    }
}
