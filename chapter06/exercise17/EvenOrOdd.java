// This program reads a number of integers from the user and checks whether each number is even or odd
// Author: Arthur Alves

package chapter06.exercise17;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the quantity of numbers: ");
        int quantityOfNumbers = input.nextInt();

        for (int counter = 1; counter <= quantityOfNumbers; counter++) {

            System.out.print("Enter an integer: ");
            int number = input.nextInt();

            System.out.println("Is " + number + " even: " + isEven(number) + "\n");
        }
    }

    public static boolean isEven(int x) {
        return x % 2 == 0;
    }
}
