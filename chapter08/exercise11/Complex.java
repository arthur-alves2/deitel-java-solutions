// Represents a complex number with real and imaginary parts, provides getters, setters, methods to
// add, subtract complex numbers, and to display them in (real, imaginary) format
// Author: Arthur Alves

package chapter08.exercise11;

public class Complex {
    private double realPart;
    private double imaginaryPart;

    public Complex() {
        realPart = 0.0;
        imaginaryPart = 0.0;
    }

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public void add(Complex complex) {
        this.realPart += complex.getRealPart();
        this.imaginaryPart += complex.getImaginaryPart();
    }

    public void subtract(Complex complex) {
        this.realPart -= complex.getRealPart();
        this.imaginaryPart -= complex.getImaginaryPart();
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getRealPart() {
        return this.realPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public double getImaginaryPart() {
        return this.imaginaryPart;
    }

    public String toString() {
        return String.format("(%.2f, %.2f)", realPart, imaginaryPart);
    }
}
