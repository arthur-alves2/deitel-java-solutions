// This program decrypts a four-digit number by reversing the encryption
// process and restoring the original value

// Author: Arthur Alves

package chapter04.exercise38;

import java.util.Scanner;

public class Decryptor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the encrypted number: ");
        int number = input.nextInt();

        int digit1 = number / 1000;
        int digit2 = number / 100 % 10;
        int digit3 = number / 10 % 10;
        int digit4 = number % 10;

        int temp = digit1;
        digit1 = digit3;
        digit3 = temp;

        temp = digit2;
        digit2 = digit4;
        digit4 = temp;

        digit1 = (digit1 + 10 - 7) % 10;
        digit2 = (digit2 + 10 - 7) % 10;
        digit3 = (digit3 + 10 - 7) % 10;
        digit4 = (digit4 + 10 - 7) % 10;

        System.out.printf("Decrypted number: %d%d%d%d%n", digit1, digit2, digit3, digit4);
    }
}
