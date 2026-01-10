// This program prompts the user to enter five integer numbers. It then displays the smallest and largest numbers among the five inputs
// Author: Arthur Alves

package chapter02.exercise24;

import java.util.Scanner;

public class LargestAndSmallest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first integer: ");
        int firstInteger = input.nextInt();

        int smallestInteger = firstInteger;
        int largestInteger = firstInteger;

        System.out.println("Enter the second integer: ");
        int secondInteger = input.nextInt();

        if (secondInteger < smallestInteger){
            smallestInteger = secondInteger;        
        }
        
        if (secondInteger > largestInteger) {
            largestInteger = secondInteger;        
        }

        System.out.println("Enter the third integer: ");
        int thirdInteger = input.nextInt();
        
        if (thirdInteger < smallestInteger) {
            smallestInteger = thirdInteger;        
        }
        
        if (thirdInteger > largestInteger) {
            largestInteger = thirdInteger;        
        }

        System.out.println("Enter the fourth integer: ");
        int fourthInteger = input.nextInt();

        if (fourthInteger < smallestInteger) {
            smallestInteger = fourthInteger;        
        }
        
        if (fourthInteger > largestInteger) {
            largestInteger = fourthInteger;        
        }

        System.out.println("Enter the fifth integer: ");
        int fifthInteger = input.nextInt();
        
        if (fifthInteger < smallestInteger) {
            smallestInteger = fifthInteger;        
        }
        
        if (fifthInteger > largestInteger) {
            largestInteger = fifthInteger;        
        }
        
        System.out.printf("Smallest integer: %d %n", smallestInteger);
        System.out.printf("Largest integer: %d %n", largestInteger);
        
    }
}


