package com.homework.task1.triangle;

import java.util.Objects;

public class MyTriangle {

    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    private TypeOfTriangle type;

    public MyPoint getV1() {
        return v1;
    }

    public MyPoint getV2() {
        return v2;
    }

    public MyPoint getV3() {
        return v3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        MyTriangle triangle = (MyTriangle) o;

        return (v1 == triangle.v1 || (v1!=null && v1.equals(triangle.getV1()))) &&
                (v2 == triangle.v2 || (v2!=null && v2.equals(triangle.getV2()))) &&
                (v3 == triangle.v3 || (v3!=null && v3.equals(triangle.getV3()))) &&
                type == triangle.type;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((v1 == null) ? 0 : v1.hashCode());
        result = prime * result + ((v2 == null) ? 0 : v2.hashCode());
        result = prime * result + ((v3 == null) ? 0 : v3.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());

        return result;
    }

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
