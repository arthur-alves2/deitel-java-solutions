// This program prompts the user to enter the radius of a circle and then calculates and displays the radius, diameter, circumference, and area of the circle
// Author: Arthur Alves

package chapter02.exercise28;

import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle(integer): ");
        int radius = input.nextInt();
        System.out.printf("Radius: %d %n", radius);
        System.out.printf("Diameter: %d %n", 2 *  radius);
        System.out.printf("Circumference: %f %n", 2 * Math.PI * radius);
        System.out.printf("Area: %f %n", Math.PI * radius * radius);
    }
}
