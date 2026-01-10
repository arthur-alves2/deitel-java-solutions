// Prompts the user to enter two integers and displays the larger one. If the numbers are equal, a message indicates equality.
// Author: Arthur Alves

package chapter02.exercise16;

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int x = input.nextInt();
        System.out.println("Enter the last integer: ");
        int y = input.nextInt();

        if (x > y) {
            System.out.printf("%d is larger %n", x);        
        }

        if (y > x) {
            System.out.printf("%d is larger %n", y);
        }
        
        if (x == y) {
            System.out.println("These numbers are equal");        
        }
    }
}
