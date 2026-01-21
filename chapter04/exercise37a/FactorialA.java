// This program calculates the factorial of an integer greater than 0 entered by the user
// Author: Arthur Alves

package chapter04.exercise37a;

import java.util.Scanner;

public class FactorialA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number greater or equal to 1: ");
        int number = input.nextInt();
        
        while (number < 1) {
            System.out.println("Invalid input!");
            System.out.print("Enter a number greater or equal to 1: ");
            number = input.nextInt();
        }

        int factorial = 1;

        while (number >= 1) {
            factorial *= number;
            number--;
        }
        System.out.printf("Factorial: %d%n", factorial);
    }
}
