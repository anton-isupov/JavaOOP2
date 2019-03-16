package com.netcracker.polinomial;


import java.util.Arrays;

public class MyPolinomial {

    private double[] coefs;


    public MyPolinomial(double... coefs) {
        this.coefs = new double[coefs.length];
        for (int i = 0; i < coefs.length; i++) {
            this.coefs[i] = coefs[i];
        }
    }

    public int getDegree() {
        return this.coefs.length;
    }

    @Override
    public String toString() {
        String polinom = "";
        for (int i = 0; i < this.coefs.length; i++) {
            if (i == 0) continue;
            if (i == 1) polinom += this.coefs[i] + "* x";
            polinom += this.coefs[i] + "* x^" + i;
        }
        return polinom;
    }

    public MyPolinomial add(MyPolinomial myPolinomial) {
        MyPolinomial newPolinomial = new MyPolinomial();

        for (int i = 0; i < this.coefs.length; i++) {
            newPolinomial.coefs[i] = this.coefs[i] + myPolinomial.coefs[i];
        }
        return newPolinomial;
    }

    public MyPolinomial multiply(MyPolinomial myPolinomial) {

        MyPolinomial newPolinomial = new MyPolinomial();

        for (int j = 0; j < this.coefs.length; j++) {
            for (int i = 0; i < myPolinomial.coefs.length; i++) {
                newPolinomial.coefs[i] = newPolinomial.coefs[i] + this.coefs[j] * myPolinomial.coefs[i];
            }
        }
        return newPolinomial;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyPolinomial)) return false;
        MyPolinomial polinom = (MyPolinomial) o;
        return Arrays.equals(polinom.coefs, coefs);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(coefs);
    }
}
