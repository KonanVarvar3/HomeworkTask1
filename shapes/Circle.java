package com.homework.task1.shapes;

import java.util.Objects;

import static java.lang.Math.pow;

public class Circle {

    private double radius;
    private String color;

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Circle circle = (Circle) o;

        return Double.compare(circle.radius, radius) == 0 &&
                Objects.equals(color, circle.getColor());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = (int) (prime * result + radius);
        result = prime * result + ((color == null) ? 0 : color.hashCode());

        return result;
    }

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




































