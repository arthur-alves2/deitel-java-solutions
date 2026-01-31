// This program reads a series of integer pairs and determines whether the second integer is a multiple of the first
// Author: Arthur Alves

package chapter06.exercise16;

import java.util.Scanner;

public class Multiples {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Number of operations: ");
        int numberOfOperations = input.nextInt();

        for (int counter = 1; counter <= numberOfOperations; counter++) {
            System.out.print("Enter an integer for number 1: ");
            int number1 = input.nextInt();

            System.out.print("Enter an integer for number 2: ");
            int number2 = input.nextInt();

            System.out.println("Is " + number2 + " multiple of " + number1 + ": " + isMultiple(number1, number2));
            System.out.println();
        }
    }

    public static boolean isMultiple(int x, int y) {
        return y % x == 0;
    }
}
