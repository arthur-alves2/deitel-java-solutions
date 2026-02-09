// CAI program for multiplication practice with varied feedback, performance tracking, and automatic reset
// Author: Arthur Alves

package chapter06.exercise37;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI {

    private static int x;
    private static int y;
    private static final SecureRandom randomizer = new SecureRandom();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int attempts = 0;
        int correctAnswers = 0;
        int incorrectAnswers = 0;

        askNewQuestion();

        while (true) {
            int answer = input.nextInt();
            attempts++;

            if (attempts <= 9) {
                if (answer == x * y) {
                    displayCorrectAnswerMessage();
                    correctAnswers++;
                    askNewQuestion();
                } else {
                    displayIncorrectAnswerMessage();
                    incorrectAnswers++;
                    ask();
                }
            }

            if (attempts == 10) {

                if (correctAnswers / 10.0 * 100.0 >= 75) {
                    System.out.println("Great job! It's time to advance to the next level!\n");
                } else {
                    System.out.println("Seek extra help from your teacher.\n");
                }

                attempts = 0;
                correctAnswers = 0;
                incorrectAnswers = 0;

                askNewQuestion();
            }
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
