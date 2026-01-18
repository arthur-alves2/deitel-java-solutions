// This program reads 10 integers from the user and finds the largest one
// Author: Arthur Alves

package chapter04.exercise21;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int number;
        int largest = 0;
        while (counter <= 10) {
            System.out.printf("Enter the number of units sold for the salesperson %d: ", counter);
            number = input.nextInt();
            if(number > largest) {
                largest = number;
            }
            counter++;
        }
        System.out.printf("Highest units sold: %d%n", largest);
    }
}
