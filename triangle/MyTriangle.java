package com.homework.task1.triangle;

public class MyTriangle {

    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    private TypeOfTriangle type;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1.setXY(x1, y1);
        this.v1.setXY(x2, y2);
        this.v1.setXY(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "\"MyTriangle[" +
                "v1=(" + v1.getX() + "," + v1.getY() + ")" +
                ",v2=(" + v2.getX() + "," + v2.getY() + ")" +
                ",v3=(" + v3.getX() + "," + v3.getY() + ")]\"";
    }

    public double getPerimeter() {
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }

    public boolean isEqualSides(double firstSide, double secondSide) {
        return Math.abs(firstSide - secondSide) < 0.00001;
    }

    public TypeOfTriangle getType() {
        if (isEqualSides(v1.distance(v2), v2.distance(v3)) &&
                isEqualSides(v2.distance(v3), v3.distance(v1)) &&
                isEqualSides(v1.distance(v2), v3.distance(v1))) {
            return type.EQUILATERAL;//all sides are equal
        }
        if (isEqualSides(v1.distance(v2), v2.distance(v3)) ||
                isEqualSides(v2.distance(v3), v3.distance(v1)) ||
                isEqualSides(v1.distance(v2), v3.distance(v1))) {
            return type.ISOSCELES;//2 sides are equal
        }
        return type.VERSATILE;//all sides are not equal
    }
}