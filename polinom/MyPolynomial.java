package com.homework.task1.polinom;

public class MyPolynomial {

    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        String strPolynom = "";

        for (int i = 1; i <= coeffs.length; i++) {

            //join the last element
            strPolynom = strPolynom
                    .concat(String.valueOf(coeffs[coeffs.length - i]));

            //if index of element = 0, write nothing
            if (coeffs.length - i == 0) {
                break;
            } else if (coeffs.length - i == 1) {

                //if index of element = 1, join x
                strPolynom = strPolynom.concat("x");

                //if first element < 0.00001, write nothing
                if (coeffs[0] < 0) {
                    continue;
                }
                //if index of element = 1, join +
                strPolynom = strPolynom.concat("+");
                continue;
            }
            strPolynom = strPolynom
                    .concat("x^")
                    .concat(String.valueOf(coeffs.length - i));

            //if next element < 0.00001, write nothing
            if (coeffs[coeffs.length - (i + 1)] < 0) {
                continue;
            }
            strPolynom = strPolynom.concat("+");
        }
        return "\"" + strPolynom + "\"";
    }

    public double evaluate(double x) {
        double res = 0;

        for (int i = 0; i < coeffs.length; i++) {
            res += coeffs[i] * Math.pow(x, i);
        }

        return res;
    }

    public MyPolynomial add(MyPolynomial right) {
        MyPolynomial polinom = new MyPolynomial(this.coeffs);

        if (polinom.coeffs.length >= right.coeffs.length) {
            for (int i = 0; i < right.coeffs.length; i++) {
                polinom.coeffs[i] += right.coeffs[i];
            }
        } else {
            polinom = right;

            for (int i = 0; i < this.coeffs.length; i++) {
                polinom.coeffs[i] += this.coeffs[i];
            }

        }
        return polinom;
    }

    public MyPolynomial multiply(MyPolynomial right) {
        MyPolynomial polinom = new MyPolynomial();

        int length = (this.coeffs.length + right.coeffs.length) - 1;
        polinom.coeffs = new double[length];

        if (this.coeffs.length >= right.coeffs.length) {

            for (int i = 0; i < right.coeffs.length; i++) {

                for (int j = 0; j < this.coeffs.length; j++) {

                    polinom.coeffs[i + j] += this.coeffs[j] * right.coeffs[i];
                }
            }
        } else {
            for (int i = 0; i < this.coeffs.length; i++) {

                for (int j = 0; j < right.coeffs.length; j++) {

                    polinom.coeffs[i + j] += right.coeffs[j] * this.coeffs[i];
                }
            }
        }
        return polinom;
    }

}
























