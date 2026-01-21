// // Checks if three positive numbers can form a triangle
// Author: Arthur Alves

package chapter04.exercise35;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number for side a: ");
        int sideA = input.nextInt();
        while (sideA <= 0) {
            System.out.println("Invalid input! Please enter only positive integers");
            System.out.print("Enter a positive number for side a: ");
            sideA = input.nextInt();
        }

        System.out.print("Enter a positive number for side b: ");
        int sideB = input.nextInt();
        while (sideB <=0) {
            System.out.println("Invalid input! Please enter only positive integers");
            System.out.print("Enter a positive number for side b: ");
            sideB = input.nextInt();
        }

        System.out.print("Enter a positive number for side c: ");
        int sideC = input.nextInt();
        while (sideC <= 0) {
            System.out.println("Invalid input! Please enter only positive integers");
            System.out.print("Enter a positive number for side c: ");
            sideC = input.nextInt();
        }

        if (sideA + sideB > sideC && sideB + sideC > sideA && sideA + sideC > sideB) {
            System.out.println("Can form a triangle!");
        } else {
            System.out.println("Can't form a triangle!");
        }
    }
}
