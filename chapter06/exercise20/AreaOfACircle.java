// This program calculates and displays the area of a circle based on a user-provided radius
// Author: Arthur Alves

package chapter06.exercise20;

import java.util.Scanner;

public class AreaOfACircle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        System.out.printf("Area: %.2f%n", circleArea(radius));

    }

    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
