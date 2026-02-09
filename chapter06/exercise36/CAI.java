// CAI program for multiplication practice with varied feedback messages
// Author: Arthur Alves

package chapter06.exercise36;

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
                displayIncorrectAnswerMessage();
                ask();
                answer = input.nextInt();
            }
            displayCorrectAnswerMessage();
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

    public static void displayCorrectAnswerMessage() {
        int number = 1 + randomizer.nextInt(4);
        switch (number) {
            case 1:
                System.out.println("great job!");
                break;
            case 2:
                System.out.println("Excellent work!");
                break;
            case 3:
                System.out.println("Well done!");
                break;
            case 4:
                System.out.println("Keep up the great work!");
        }
    }

    public static void displayIncorrectAnswerMessage() {
        int number = 1 + randomizer.nextInt(4);
        switch (number) {
            case 1:
                System.out.println("Not quite. Give it another try!");
                break;
            case 2:
                System.out.println("That's not correct. Try once more!");
                break;
            case 3:
                System.out.println("Don't give up—you're getting there!");
                break;
            case 4:
                System.out.println("Not this time. Keep practicing!");
        }
    }
}
