// Simple CAI program to help students practice multiplication
// Generates two random single-digit numbers, asks the user to multiply them,
// and gives feedback until the correct answer is provided
// Author: Arthur Alves

package chapter06.exercise35;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI {

    private static int x;
    private static int y;
    private static final SecureRandom randomizer = new SecureRandom();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
           askNewQuestion();
           int answer = input.nextInt();
           while (answer != x * y) {
               System.out.println("No, please try again.");
               ask();
               answer = input.nextInt();
           }
            System.out.println("Very good! ");
        }
    }

    public static void askNewQuestion() {
        x = 1 + randomizer.nextInt(9);
        y = 1 + randomizer.nextInt(9);
        System.out.printf("How much is %d times %d? ", x, y);
    }

    public static void ask() {
        System.out.printf("How much is %d times %d? ", x, y);
    }
}
