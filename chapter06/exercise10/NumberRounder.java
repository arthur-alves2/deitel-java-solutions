// Reads a floating point number and shows it rounded to integer, tenths, hundredths, and thousandths
// Author: Arthur Alves

package chapter06.exercise10;

import java.util.Scanner;

public class NumberRounder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a floating point number or -1 to quit: ");
        double number = input.nextDouble();

        while (number != -1) {
            System.out.printf("Original value: %f%n", number);
            System.out.printf("To integer: %d%n", roundToInteger(number));
            System.out.printf("To tenths: %.1f%n", roundToTenths(number));
            System.out.printf("To hundredths: %.2f%n", roundToHundredths(number));
            System.out.printf("To thousandths: %.3f%n", roundToThousandths(number));

            System.out.print("Enter a floating point number or -1 to quit: ");
            number = input.nextDouble();
        }
    }

    public static int roundToInteger(double number) {
        return (int) Math.floor(number + 0.5);
    }

    public static double roundToTenths(double number) {
        return Math.floor(number * 10 + 0.5) / 10;
    }

    public static double roundToHundredths(double number) {
        return Math.floor(number * 100 + 0.5) / 100;
    }

    public static double roundToThousandths(double number) {
        return Math.floor(number * 1000 + 0.5) / 1000;
    }
}
