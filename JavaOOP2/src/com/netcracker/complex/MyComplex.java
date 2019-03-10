package com.netcracker.complex;

public class MyComplex {

    private double real = 0.0;
    private double imag = 0.0;

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

    public double getImag() {
        return imag;
    }

    public void setReal(double real) {
        this.real = real;
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
        return getReal() + " i * " + getImag();
    }

    public boolean isReal() {
        if (getReal() != 0) return true;
        return false;
    }

    public boolean isImaginary() {
        if (getImag() != 0) return true;
        return false;
    }

    public boolean equals(double real, double imag) {
        if (this.real == real && this.imag == imag) return true;
        return false;
    }

    public boolean equals(MyComplex myComplex) {
        if (this.real == myComplex.getReal() && this.imag == myComplex.getImag()) return true;
        return false;
    }

    public double magnitude() {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imag, 2));
    }

    public double argument() {
        return Math.atan(imag / real);
    }

    public MyComplex addNew(MyComplex myComplex) {
        return new MyComplex(this.real + myComplex.getReal(), this.imag + myComplex.getImag());
    }

    public MyComplex substractNew(MyComplex myComplex) {
        return new MyComplex(this.real - myComplex.getReal(), this.imag - myComplex.getImag());
    }

    public MyComplex add(MyComplex myComplex) {
        this.real += myComplex.getReal();
        this.imag += myComplex.getImag();
        return this;
    }

    public MyComplex substract(MyComplex myComplex) {
        this.real -= myComplex.getReal();
        this.imag -= myComplex.getImag();
        return this;
    }

    public MyComplex multiply(MyComplex myComplex) {
        this.real = this.real * myComplex.getReal() - this.imag * myComplex.getImag();
        this.imag = this.real * myComplex.getImag() + this.imag * myComplex.getReal();
        return this;
    }

    public MyComplex devide(MyComplex myComplex) {
        this.real = (this.real * myComplex.getReal() + this.imag * myComplex.getImag())
                / (Math.pow(this.imag, 2) + Math.pow(myComplex.getImag(), 2));

        this.imag = (this.imag * myComplex.getReal() - this.real * myComplex.getImag())
                / (Math.pow(this.imag, 2) + Math.pow(myComplex.getImag(), 2));
        return this;
    }

    public MyComplex conjugate() {
        return new MyComplex(this.getReal(), (-1) * this.getImag());
    }

}
