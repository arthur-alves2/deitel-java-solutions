// This program reads five integers between 1 and 30 and displays a bar chart using asterisks for each value
// Author: Arthur Alves

package chapter05.exercise16;

import java.util.Scanner;

public class BarChart {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number1 = input.nextInt();
        while (number1 < 1 || number1 > 30 ) {
            System.out.print("Enter a number: ");
            number1 = input.nextInt();
        }

        System.out.print("Enter a number: ");
        int number2 = input.nextInt();
        while (number2 < 1 || number2 > 30) {
            System.out.print("Enter a number: ");
            number2 = input.nextInt();
        }

        System.out.print("Enter a number: ");
        int number3 = input.nextInt();
        while (number3 < 1 || number3 > 30) {
            System.out.print("Enter a number: ");
            number3 = input.nextInt();
        }

        System.out.print("Enter a number: ");
        int number4 = input.nextInt();
        while (number4 < 1 || number4 > 30) {
            System.out.print("Enter a number: ");
            number4 = input.nextInt();
        }

        System.out.print("Enter a number: ");
        int number5 = input.nextInt();
        while (number5 < 1 || number5 > 30) {
            System.out.print("Enter a number: ");
            number5 = input.nextInt();
        }

        for (int counter = 1; counter <= number1; counter++) {
            System.out.print("*");
        }

        System.out.println();

        for (int counter = 1; counter <= number2; counter++) {
            System.out.print("*");
        }

        System.out.println();

        for (int counter = 1; counter <= number3; counter++) {
            System.out.print("*");
        }

        System.out.println();

        for (int counter = 1; counter <= number4; counter++) {
            System.out.print("*");
        }

        System.out.println();

        for (int counter = 1; counter <= number5; counter++) {
            System.out.print("*");
        }

    }
}
