// This program reads a user-specified number of integers and determines the smallest one
// Author: Arthur Alves

package chapter05.exercise11;

import java.util.Scanner;

public class FindingSmallestInteger {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Quantity of numbers you want to enter: ");
        int numberOfValues = input.nextInt();

        int number;
        int smallest = Integer.MAX_VALUE;

        for (int counter = 1; counter <= numberOfValues; counter++) {
            System.out.print("Enter a value: ");
            number = input.nextInt();

            if(number < smallest) {
                smallest = number;
            }
        }
        System.out.printf("Smallest: %d%n", smallest);
    }
}
