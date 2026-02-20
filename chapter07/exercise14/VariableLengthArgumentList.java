// This program reads a set of numbers from the user
// and calculates their product using a variable-length argument method
// Author: Arthur Alves

package chapter07.exercise14;

import java.util.Scanner;

public class VariableLengthArgumentList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter? ");
        int[] numbers = new int[input.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the " + i + 1 + " number: ");
            numbers[i] = input.nextInt();
        }

        System.out.println("Product: " + calculateProduct(numbers));
    }

    public static int calculateProduct(int ... numbers) {
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        return product;
    }
}
