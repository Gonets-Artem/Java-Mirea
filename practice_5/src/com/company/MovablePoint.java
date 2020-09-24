package com.company;

public class MovablePoint implements Movable {
    private double x, y;

    public MovablePoint(double x, double y) {
        setX(x);
        setY(y);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String toString() {
        return "point (" + x +
                ", " + y + ")";
    }

    public void move(double xSpeed, double ySpeed) {
        x += xSpeed;
        y += ySpeed;
    }
}
