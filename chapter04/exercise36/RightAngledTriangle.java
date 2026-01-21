// This program checks whether three positive integers can form a right-angled triangle
// Author: Arthur Alves

package chapter04.exercise36;

import java.util.Scanner;

public class RightAngledTriangle {
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

        int hypotenuse = 0;
        int leg1 = 0;
        int leg2 = 0;

        if (sideA >= sideB && sideA >= sideC) {
            hypotenuse = sideA;
            leg1 = sideB;
            leg2 = sideC;
        }

        if (sideB >= sideA && sideB >= sideC) {
            hypotenuse = sideB;
            leg1 = sideA;
            leg2 = sideC;
        }

        if (sideC >= sideA && sideC >= sideB) {
            hypotenuse = sideC;
            leg1 = sideA;
            leg2 = sideB;
        }

        if (hypotenuse * hypotenuse == leg1 * leg1 + leg2 * leg2) {
            System.out.println("Can form a right angled triangle");
        } else {
            System.out.println("Can't form a right angled triangle");
        }
    }
}
