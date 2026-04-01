// This class tests the capabilities of the Rational class
// Author: Arthur Alves

package chapter08.Exercise15;

public class RationalTest {
    public static void main(String[] args) {
        // Test constructors
        Rational rational1 = new Rational(); // default constructor
        if (rational1.getNumerator() == 1 && rational1.getDenominator() == 1) {
            System.out.println("Test default constructor: PASSED");
        } else {
            System.out.println("Test default constructor: FAILED (expected 1/1, got " + rational1 + ")");
        }

        Rational rational2 = new Rational(2, 4); // should reduce to 1/2
        if (rational2.getNumerator() == 1 && rational2.getDenominator() == 2) {
            System.out.println("Test constructor with reduction: PASSED");
        } else {
            System.out.println("Test constructor with reduction: FAILED (expected 1/2, got " + rational2 + ")");
        }

        // Test add
        Rational sum = Rational.add(new Rational(1, 2), new Rational(1, 3)); // 1/2 + 1/3 = 5/6
        if (sum.getNumerator() == 5 && sum.getDenominator() == 6) {
            System.out.println("Test add: PASSED");
        } else {
            System.out.println("Test add: FAILED (expected 5/6, got " + sum + ")");
        }

        // Test subtract
        Rational difference = Rational.subtract(new Rational(3, 4), new Rational(1, 2)); // 3/4 - 1/2 = 1/4
        if (difference.getNumerator() == 1 && difference.getDenominator() == 4) {
            System.out.println("Test subtract: PASSED");
        } else {
            System.out.println("Test subtract: FAILED (expected 1/4, got " + difference + ")");
        }

        // Test multiply
        Rational product = Rational.multiply(new Rational(2, 3), new Rational(3, 4)); // 2/3 * 3/4 = 1/2
        if (product.getNumerator() == 1 && product.getDenominator() == 2) {
            System.out.println("Test multiply: PASSED");
        } else {
            System.out.println("Test multiply: FAILED (expected 1/2, got " + product + ")");
        }

        // Test divide
        Rational quotient = Rational.divide(new Rational(3, 5), new Rational(9, 10)); // 3/5 ÷ 9/10 = 2/3
        if (quotient.getNumerator() == 2 && quotient.getDenominator() == 3) {
            System.out.println("Test divide: PASSED");
        } else {
            System.out.println("Test divide: FAILED (expected 2/3, got " + quotient + ")");
        }

        // Test toString with precision
        Rational rational3 = new Rational(1, 3);
        String decimal = rational3.toString(2); // should be "0.33"
        if (decimal.equals("0.33")) {
            System.out.println("Test toString with precision: PASSED");
        } else {
            System.out.println("Test toString with precision: FAILED (expected 0.33, got " + decimal + ")");
        }

        // Test exception for invalid denominator
        try {
            new Rational(1, 0);
            System.out.println("Test invalid denominator: FAILED (exception expected)");
        } catch (IllegalArgumentException e) {
            System.out.println("Test invalid denominator: PASSED");
        }
    }
}
