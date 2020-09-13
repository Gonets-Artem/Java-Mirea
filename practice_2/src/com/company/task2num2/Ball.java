package com.company.task2num2;

public class Ball {
    private double diameter, pressure;
    private String material, color;

    public Ball(double diameter, double pressure, String material, String color) {
        setDiameter(diameter);
        setPressure(pressure);
        setMaterial(material);
        setColor(color);
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "diameter: " + getDiameter() +
                ", pressure: " + getPressure() +
                ", material: " + getMaterial() +
                ", color: " + getColor();
    }
}
