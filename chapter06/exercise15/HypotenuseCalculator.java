// Reads two sides from the user and calculates the hypotenuse using the hypotenuse method
// Author: Arthur Alves

package chapter06.exercise15;

import java.util.Scanner;

public class HypotenuseCalculator {

    public static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a floating point number for side 1: ");
        double side1 = input.nextDouble();

        System.out.print("Enter a floating point number for side 2: ");
        double side2 = input.nextDouble();

        System.out.printf("Hypotenuse: %.1f%n", hypotenuse(side1, side2));
    }

    public static double hypotenuse(double side1, double side2) {
        double hypotenuseSquared = Math.pow(side1, 2) + Math.pow(side2, 2);
        return Math.sqrt(hypotenuseSquared);
    }
}
