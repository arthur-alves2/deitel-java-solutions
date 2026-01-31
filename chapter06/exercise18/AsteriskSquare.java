// This program prints a square of asterisks (*) with a side length specified by the user
// Author: Arthur Alves

package chapter06.exercise18;

import java.util.Scanner;

public class AsteriskSquare {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side length of the square: ");
        int sideLength = input.nextInt();

        squareOfAsterisk(sideLength);
    }

    public static void squareOfAsterisk(int side) {
        for (int line = 1; line <= side; line++) {
            for (int column = 1; column <= side; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
