package com.homework.task1.ball;

import java.util.Arrays;
import java.util.Objects;

public class Ball {

    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Ball ball = (Ball) o;

        return Float.compare(ball.x, x) == 0 &&
                Float.compare(ball.y, y) == 0 &&
                radius == ball.radius &&
                Float.compare(ball.xDelta, xDelta) == 0 &&
                Float.compare(ball.yDelta, yDelta) == 0;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = (int) (prime * result + x);
        result = (int) (prime * result + y);
        result = prime * result + radius;
        result = (int) (prime * result + xDelta);
        result = (int) (prime * result + yDelta);

        return result;
    }

    public Ball(float x, float y, int radius, int speed, int direction) throws DirectionExeption {
        if (direction > 180 || direction < -180) {
            throw new DirectionExeption("The number does not belong to the range -180 to 180. Your number:" + direction);
        }

        this.x = x;
        this.y = y;
        this.radius = radius;
        xDelta = speed * (float) Math.cos(direction);
        yDelta = -speed * (float) Math.sin(direction);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getXDelta() {
        return xDelta;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move() {
        x += xDelta;
        y += yDelta;
    }

    public void reflectHorizontal() {
        xDelta = -xDelta;
    }

    public void reflectVertical() {
        yDelta = -yDelta;
    }

    @Override
    public String toString() {
        return "\"Ball[(" + x + "," + y
                + "),speed=(" + xDelta + "," + yDelta + ")]";
    }
}

























