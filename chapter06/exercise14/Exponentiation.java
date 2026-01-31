// Reads a base and exponent, computes the power using the integerPower method, and prints the result
// Author: Arthur Alves

package chapter06.exercise14;

import java.util.Scanner;

public class Exponentiation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer for the base: ");
        int base = input.nextInt();

        System.out.print("Enter an integer for the exponent: ");
        int exponent = input.nextInt();

        System.out.printf("%d ^ %d = %d%n", base, exponent, integerPower(base, exponent));
    }

    public static int integerPower(int base, int exponent) {
        int result = 1;

        for (int counter = 1; counter <= exponent; counter++) {
            result *= base;
        }

        return result;
    }
}
