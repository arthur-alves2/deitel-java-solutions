// Reads 5 integers between 10 and 100
// Stores only unique values in a fixed-size array (max 5 elements)
// After each valid input, prints the current set of unique values
// Author: Arthur Alves

package chapter07.exercise12;

import java.util.Scanner;

public class DuplicateRemover {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbersArray = new int[5];
        int uniqueCounter = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a value between 10 and 100: ");
            int value = input.nextInt();

            while (value < 10 || value > 100) {
                System.out.println("Invalid value!");
                System.out.print("Enter a value between 10 and 100: ");
                value = input.nextInt();
            }

            if (!(isDuplicated(value, numbersArray))) {
                System.out.println(value);
                uniqueCounter++;
                insertValue(value, uniqueCounter - 1, numbersArray);
            }

            printArray(uniqueCounter, numbersArray);
        }

    }

    public static void printArray(int counter, int[] array) {
        System.out.print("[");
        for (int i = 0; i < counter; i++) {
            System.out.print(array[i]);
            if (i < counter - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void insertValue(int value, int index, int[] array) {
        array[index] = value;
    }

    public static boolean isDuplicated(int value, int[] array) {
        for (int number : array) {
            if (number == value) {
                return true;
            }
        }

        return false;
    }
}
