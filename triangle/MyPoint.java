package com.homework.task1.triangle;

import java.util.Objects;

public class MyPoint {

    private int x = 0;
    private int y = 0;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MyPoint myPoint = (MyPoint) o;

        return x == myPoint.x &&
                y == myPoint.y;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + x;
        result = prime * result + y;

        return result;
    }

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] array = new int[]{x, y};
        return array;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double distance(int x, int y) {
        double horizontalDistance;
        double verticalDistance;

        horizontalDistance = x - this.x;
        verticalDistance = y - this.y;

        return Math.sqrt(Math.pow(horizontalDistance, 2) + Math.pow(verticalDistance, 2));
    }

    public double distance(MyPoint another) {
        double horizontalDistance;
        double verticalDistance;

        horizontalDistance = another.getX() - this.x;
        verticalDistance = another.getY() - this.y;

        return Math.sqrt(Math.pow(horizontalDistance, 2) + Math.pow(verticalDistance, 2));
    }

    public double distance() {
        double horizontalDistance;
        double verticalDistance;

        horizontalDistance = -this.x;
        verticalDistance = -this.y;

        return Math.sqrt(Math.pow(horizontalDistance, 2) + Math.pow(verticalDistance, 2));
    }
}
