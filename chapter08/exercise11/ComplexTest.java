// Demonstrates the functionality of the Complex class
// Author: Arthur Alves

package chapter08.exercise11;

public class ComplexTest {

    public static void main(String[] args) {

        Complex complex1 = new Complex(5.0, 10.0);
        Complex complex2 = new Complex(2.0, 4.0);

        System.out.println("Complex 1: " + complex1);
        System.out.println("Complex 2:" + complex2);

        System.out.println("Adding complex 2 to complex 1");
        complex1.add(complex2);
        System.out.println("Complex 1 after adding complex 2: " + complex1);

        System.out.println("Subtracting complex 2 to complex 1");
        complex1.subtract(complex2);
        System.out.println("Complex 1 after subtracting complex 2: " + complex1);
    }
}
