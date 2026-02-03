// Computes and displays the Greatest Common Divisor (GCD) of two integers entered by the user
// Author: Arthur Alves

package chapter06.exercise27;

import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int number2 = input.nextInt();

        System.out.println("GCD: " + gcd(number1, number2));

    }

    public static int gcd(int a, int b) {
        int remainder;
        while ((a % b) > 0) {
            remainder = a % b;
            a = b;
            b = remainder;
        }

        return b;
    }

}
