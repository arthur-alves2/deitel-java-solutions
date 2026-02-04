// Calculates the distance between two points in 2D using the Euclidean formula
// Author: Arthur Alves

package chapter06.exercise32;

import java.util.Scanner;

public class DistanceBetweenPoints {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the position of x1: ");
        double x1 = input.nextDouble();

        System.out.print("Enter the position of y1: ");
        double y1 = input.nextDouble();

        System.out.print("Enter the position of x2: ");
        double x2 = input.nextDouble();

        System.out.print("Enter the position of y2: ");
        double y2 = input.nextDouble();

        System.out.printf("Distance: %.2f%n", distance(x1, y1, x2, y2));
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}
