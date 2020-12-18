package com.homework.task1.shapes;

import static java.lang.Math.pow;

public class Circle {

    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this(radius);
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "\"Circle[" +
                "radius=" + radius +
                ",color='" + color +
                "]\"";
    }

    public double getArea() {
        return Math.PI * pow(radius, 2);
    }
}




































