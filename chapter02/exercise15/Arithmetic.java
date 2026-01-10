// This program prompts the user to enter two integers, reads the input values, and then calculates and displays their sum, product, difference, and quotient.
// Author: Arthur Alves

package chapter02.exercise15;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int x = input.nextInt();
        System.out.println("Enter the final integer: ");
        int y = input.nextInt();
        System.out.printf("%d + %d = %d%n", x, y, x + y);
        System.out.printf("%d * %d = %d%n", x, y, x * y);
        System.out.printf("%d - %d = %d%n", x, y, x - y);
        System.out.printf("%d / %d = %d%n", x, y, x / y);
    }
}
