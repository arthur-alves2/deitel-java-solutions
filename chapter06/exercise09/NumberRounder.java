// Reads floating-point numbers, rounds them to the nearest integer, and displays both values
// Author: Arthur Alves

package chapter06.exercise09;

import java.util.Scanner;

public class NumberRounder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a floating point number or -1 to quit: ");
        double x = input.nextDouble();

        while (x != -1) {
            System.out.printf("Original value: %f%n", x);
            int y = (int) Math.floor(x + 0.5);
            System.out.printf("Rounded value: %d%n%n", y);

            System.out.print("Enter a floating point number or -1 to quit: ");
            x = input.nextDouble();

        }

    }
}
