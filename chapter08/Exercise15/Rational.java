// Represents a rational number with integer numerator and denominator, provides static methods for the four operations
// It also has two ways of representing the object as a String
// Author: Arthur Alves

package chapter08.Exercise15;

public class Rational {

    private int numerator;
    private int denominator;

    public Rational() {
        this(1, 1);
    }

    public Rational(int numerator, int denominator) {
        if (denominator < 1) {
            throw new IllegalArgumentException(String.format("Denominator (%d) must be a positive number", denominator));
        }

        int gcd = getGcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    public static Rational add(Rational rational1, Rational rational2) {
        int numerator = rational1.getNumerator() * rational2.getDenominator() + rational2.getNumerator() * rational1.getDenominator();
        int denominator = rational1.getDenominator() * rational2.getDenominator();
        return new Rational(numerator, denominator);
    }

    public static Rational subtract(Rational rational1, Rational rational2) {
        int numerator = rational1.getNumerator() * rational2.getDenominator() - rational2.getNumerator() * rational1.getDenominator();
        int denominator = rational1.getDenominator() * rational2.getDenominator();
        return new Rational(numerator, denominator);
    }

    public static Rational multiply(Rational rational1, Rational rational2) {
        int numerator = rational1.getNumerator() * rational2.getNumerator();
        int denominator = rational1.getDenominator() * rational2.getDenominator();
        return new Rational(numerator, denominator);
    }

    public static Rational divide(Rational rational1, Rational rational2) {
        int numerator = rational1.getNumerator() * rational2.getDenominator();
        int denominator = rational1.getDenominator() * rational2.getNumerator();
        return new Rational(numerator, denominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    private static int getGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public String toString() {
        return String.format("%d/%d", numerator, denominator);
    }

    public String toString(int precision) {
        return String.format("%." + precision + "f", ((double) numerator / denominator));
    }
}