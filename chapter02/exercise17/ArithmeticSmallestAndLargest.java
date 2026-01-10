// This program prompts the user to enter three integer numbers. It then calculates and displays the sum, integer average, product,
// as well as the smallest and largest numbers among the three inputs.
// Author: Arthur Alves

package chapter02.exercise17;

import java.util.Scanner;

public class ArithmeticSmallestAndLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first integer: ");
        int x = input.nextInt();

        System.out.println("Enter the second integer: ");
        int y = input.nextInt();

        System.out.println("Enter the third integer: ");
        int z = input.nextInt();
        
        int sum = x + y + z;
        int average = (x + y + z) / 3;
        int product = x * y * z;
        int smallest = x;
        int largest = x;

        if (y < smallest) {
            smallest = y;        
        }

        if (z < smallest) {
            smallest = z;
        }
        
        if (y > largest) {
            largest = y;        
        }

        if (z > largest) {
            largest = z;        
        }

        System.out.printf("Sum: %d %n", sum);
        System.out.printf("Average: %d %n", average);
        System.out.printf("Product: %d %n", product);
        System.out.printf("Smallest: %d %n", smallest);
        System.out.printf("Largest: %d %n", largest);
        
    }
}
