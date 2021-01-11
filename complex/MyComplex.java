package com.homework.task1.complex;

import java.util.Objects;

public class MyComplex {

    private double real;
    private double imag;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MyComplex myComplex = (MyComplex) o;

        return Double.compare(myComplex.real, real) == 0 &&
                Double.compare(myComplex.imag, imag) == 0;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = (int) (prime * result + real);
        result = (int) (prime * result + imag);

        return result;
    }

    public MyComplex() {
        real = 0.0;
        imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        if (positiveNumber(imag)) {
            return "(" + real + "+" + imag + "i)";
        } else if (imag == 0.0) {
            return "(" + real + ")";
        }

        return "(" + real + imag + "i)";


    }

    public boolean positiveNumber(double number) {
        return number > 0.00001;
    }

    public boolean isReal() {
        return positiveNumber(real);
    }

    public boolean isImaginary() {
        return positiveNumber(imag);
    }

    public boolean isEqualNumbers(double first, double second) {
        return Math.abs(first - second) < 0.00001;
    }

    public boolean equals(double real, double imag) {
        return isEqualNumbers(this.real, real) && isEqualNumbers(this.imag, imag);
    }

    public boolean equals(MyComplex another) {
        return isEqualNumbers(this.real, another.real) && isEqualNumbers(this.imag, another.imag);
    }

    public double magnitude() {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imag, 2));
    }

    public double argument() {
        double tg;
        double degree;

        tg = imag / real;
        degree = 180 * tg / Math.PI;

        while (degree >= 180) {
            degree -= 180;
        }

        degree = degree * Math.PI / 180;

        return degree;
    }

    public MyComplex add(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        MyComplex number = new MyComplex(this.real, this.imag);
        number.real += right.real;
        number.imag += right.imag;
        return number;
    }

    public MyComplex Subtract(MyComplex right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public MyComplex SubtractNew(MyComplex right) {
        MyComplex number = new MyComplex(this.real, this.imag);
        number.real -= right.real;
        number.imag -= right.imag;
        return number;
    }

    public MyComplex multiply(MyComplex right) {
        double realNumber;
        double imagNumber;

        realNumber = this.real;
        imagNumber = this.imag;

        this.real = realNumber * right.real - imagNumber * right.imag;
        this.imag = realNumber * right.imag + imagNumber * right.real;
        return this;
    }

    public MyComplex divide(MyComplex right) {
        double realNumber;
        double imagNumber;
        double divideNumber;

        realNumber = this.real;
        imagNumber = this.imag;

        divideNumber = Math.pow(right.real, 2) + Math.pow(right.imag, 2);

        this.real = (realNumber * right.real + imagNumber * right.imag) / divideNumber;

        this.imag = (right.real * imagNumber - realNumber * right.imag) / divideNumber;
        return this;
    }

    public MyComplex conjugate() {
        MyComplex number = new MyComplex(this.real, this.imag);
        number.imag = -this.imag;
        return number;
    }

}
