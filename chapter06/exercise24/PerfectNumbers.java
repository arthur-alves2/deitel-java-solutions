// This program identifies perfect numbers
// It determines whether a number is perfect by summing its proper divisors
// and displays all perfect numbers between 1 and 1000 along with their factors
// Author: Arthur Alves

package chapter06.exercise24;

import java.util.Scanner;

public class PerfectNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.println("Is " + number + " a perfect number? " + isPerfect(number));

        System.out.printf("%nPrinting Perfect numbers between 1 and 1000: %n");
        for (int counter = 1; counter <= 1000; counter++) {
            if (isPerfect(counter)) {
                printExpression(counter);
            }
        }

    }

    public static boolean isPerfect(int number) {
        int total = 0;

        for (int counter = 1; counter <= number / 2; counter++) {
            if (number % counter == 0) total += counter;

        }

        return total == number;
    }

    public static void printExpression(int number) {
        int total = 0;

        for (int counter = 1; counter <= number / 2; counter++) {
            if (number % counter == 0) {
                total += counter;

                System.out.print(counter);
                if (total == number) {
                    System.out.printf(" = %d%n", total);
                } else {
                    System.out.print(" + ");
                }
            }
        }
    }
}
