// This program prompts the user to enter an integer, then determines whether the entered number is even or odd, and prints the result
// Author: Arthur Alves

package chapter02.exercise25;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        System.out.printf("Number %d is ", number);

        if (number % 2 == 0) {
            System.out.println("even");        
        }

        if (number % 2 != 0) {
            System.out.println("odd");      
        }  
    }
}
