// This program reads three floating-point numbers from the user and displays the smallest value
// Author: Arthur Alves

package chapter06.exercise23;

import java.util.Scanner;

public class MinimumFinder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first floating point number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter the second floating point number: ");
        double number2 = input.nextDouble();

        System.out.print("Enter the third floating point number: ");
        double number3 = input.nextDouble();

        System.out.println("Smallest value: " + minimum3(number1, number2, number3));
    }

    public static double minimum3(double x, double y, double z) {
        double minimum = Math.min(x, y);
        return Math.min(minimum, z);
    }
}
