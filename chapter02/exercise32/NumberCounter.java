//
// Author: Arthur Alves

package chapter02.exercise32;

import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positiveCounter = 0;
        int negativeCounter = 0;
        int zeroCounter = 0;

        System.out.println("Enter the first integer: ");
        int firstNumber = input.nextInt();

        if (firstNumber > 0) {
            positiveCounter = positiveCounter + 1;        
        }

        if (firstNumber < 0) {
            negativeCounter = negativeCounter + 1;        
        }

        if (firstNumber == 0) {
            zeroCounter = zeroCounter + 1;        
        }

        System.out.println("Enter the second integer: ");
        int secondNumber = input.nextInt();

        if (secondNumber > 0) {
            positiveCounter = positiveCounter + 1;        
        }

        if (secondNumber < 0) {
            negativeCounter = negativeCounter + 1;        
        }

        if (secondNumber == 0) {
            zeroCounter = zeroCounter + 1;        
        }

        System.out.println("Enter the third integer: ");
        int thirdNumber = input.nextInt();
        
        if (thirdNumber > 0) {
            positiveCounter = positiveCounter + 1;        
        }

        if (thirdNumber < 0) {
            negativeCounter = negativeCounter + 1;
        }

        if (thirdNumber == 0) {
            zeroCounter = zeroCounter + 1;        
        }

        System.out.println("Enter the fourth integer: ");
        int fourthNumber = input.nextInt();
        
        if (fourthNumber > 0) {
            positiveCounter = positiveCounter + 1;
        }

        if (fourthNumber < 0) {
            negativeCounter = negativeCounter + 1;        
        }

        if (fourthNumber == 0) {
            zeroCounter = zeroCounter + 1;        
        }
        
        System.out.println("Enter the last integer: ");
        int fifthNumber = input.nextInt();
        
        if (fifthNumber > 0) {
            positiveCounter = positiveCounter + 1;        
        }

        if (fifthNumber < 0) {
            negativeCounter = negativeCounter + 1;
        }

        if (fifthNumber == 0) {
            zeroCounter = zeroCounter + 1;        
        }
        
        System.out.printf("Positives: %d%nNegatives: %d%nZeros: %d%n", positiveCounter, negativeCounter, zeroCounter);
        
    }
}
