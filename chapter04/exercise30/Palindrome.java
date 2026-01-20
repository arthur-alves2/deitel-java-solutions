// This program reads a five-digit integer and determines whether it is a palindrome
// Author: Arthur Alves

package chapter04.exercise30;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a five-digit number: ");
        int number = input.nextInt();
        while (number < 10000 || number > 99999) {
            System.out.println("Error! Please enter only five-digit number: ");
            number = input.nextInt();
        }
        int digit1 = number / 10000;
        int digit2 = number / 1000 % 10;
        int digit3 = number / 100 % 10;
        int digit4 = number / 10 % 10;
        int digit5 = number % 10;
        if (digit1 == digit5 && digit2 == digit4) {
            System.out.printf("The number %d is a palindrome%n", number);
        } else {
            System.out.printf("The number %d is not a palindrome%n", number);
        }
    }
}
