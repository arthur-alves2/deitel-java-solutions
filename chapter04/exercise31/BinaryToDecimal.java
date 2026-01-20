// Converts a binary number entered by the user into its decimal equivalent
// Author: Arthur Alves

package chapter04.exercise31;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int binaryNumber = input.nextInt();
        int decimal = 0;
        int multiplier = 1;
        while (binaryNumber > 0) {
            int digit = binaryNumber % 10;
            decimal += multiplier * digit;
            binaryNumber /= 10;
            multiplier *= 2;
        }
        System.out.printf("Decimal value: %d%n", decimal);
    }
}
