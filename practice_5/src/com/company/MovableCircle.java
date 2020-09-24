package com.company;

public class MovableCircle extends Circle implements Movable {
    private MovablePoint center;

    public MovableCircle(double x, double y, double radius) {
        this.center = new MovablePoint(x, y);
        setRadius(radius);
    }

    public MovablePoint getCenter() {
        return center;
    }

    public void setCenter(double x, double y) {
        center.setX(x);
        center.setY(y);
    }

    public String toString() {
        return "circle: center " + center +
                ", radius = " + getRadius();
    }

    public void move(double xSpeed, double ySpeed) {
        center.move(xSpeed, ySpeed);
    }
}