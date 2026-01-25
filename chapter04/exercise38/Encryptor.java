// This program encrypts a four-digit number by modifying each digit
// and swapping their positions to produce an encrypted result

// Author: Arthur Alves

package chapter04.exercise38;

import java.util.Scanner;

public class Encryptor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a four-digit number: ");
        int number = input.nextInt();

        while (number < 1000 || number > 9999) {
            System.out.print("Invalid input!");
            System.out.print("Enter a four-digit number: ");
            number = input.nextInt();

        }

        int digit1 = number / 1000;
        int digit2 = number / 100 % 10;
        int digit3 = number / 10 % 10;
        int digit4 = number % 10;

        digit1 = (digit1 + 7) % 10;
        digit2 = (digit2 + 7) % 10;
        digit3 = (digit3 + 7) % 10;
        digit4 = (digit4 + 7) % 10;

        int temp = digit1;
        digit1 = digit3;
        digit3 = temp;

        temp = digit2;
        digit2 = digit4;
        digit4 = temp;

        System.out.printf("Encrypted number: %d%d%d%d%n", digit1, digit2, digit3, digit4);
    }
}
