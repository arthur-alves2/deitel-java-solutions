// This program reads 10 integers from the user and determines the largest and second largest numbers entered
// Author: Arthur Alves

package chapter04.exercise23;

import java.util.Scanner;

public class LargestNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int number;
        System.out.printf("Enter a number %d: ", counter);
        int largest = input.nextInt();
        System.out.printf("Enter a number %d: ", counter);
        int secondLargest = input.nextInt();
        if(largest < secondLargest) {
            int temp = largest;
            largest = secondLargest;
            secondLargest = temp;
        }
        while (counter <= 8) {
            System.out.printf("Enter number %d: ", counter);
            number = input.nextInt();
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest) {
                secondLargest = number;
            }
            counter++;
        }
        System.out.printf("Largest number: %d%n", largest);
        System.out.printf("Second largest number: %d%n", secondLargest);
    }
}
