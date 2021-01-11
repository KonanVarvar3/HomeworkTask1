package com.homework.task1.shapes;

import java.util.Objects;

public class Rectangle {

    private float length;
    private float width;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) o;

        return Float.compare(rectangle.length, length) == 0 &&
                Float.compare(rectangle.width, width) == 0;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = (int) (prime * result + length);
        result = (int) (prime * result + width);

        return result;
    }

    public Rectangle() {
        length = 1.0f;
        width = 1.0f;
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return (length + width) * 2;
    }

    @Override
    public String toString() {
        return "\"Rectangle[" +
                "length=" + length +
                ",width=" + width + "]\"";
    }
}






















