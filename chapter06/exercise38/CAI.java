// CAI program for multiplication practice with difficulty levels,
// performance tracking, automatic reset and random feedback messages
// Author: Arthur Alves

package chapter06.exercise38;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI {

    private static int difficulty;
    private static int x;
    private static int y;
    private static final SecureRandom randomizer = new SecureRandom();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        askDifficultyLevel();
        difficulty = input.nextInt();
        
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

                askDifficultyLevel();
                difficulty = input.nextInt();

                attempts = 0;
                correctAnswers = 0;
                incorrectAnswers = 0;

                askNewQuestion();
            }
        }
    }

    public static void askDifficultyLevel() {
        System.out.println("[1] Easy 1 - 9\n[2] Normal 10 - 99\n[3] Hard 100 - 999");
        System.out.print("Enter the difficulty level: ");
    }

    public static void askNewQuestion() {
        if (difficulty == 1) {
            x = 1 + randomizer.nextInt(9);
            y = 1 + randomizer.nextInt(9);
        } else if(difficulty == 2) {
            x = 10 + randomizer.nextInt(90);
            y = 10 + randomizer.nextInt(90);
        } else {
            x = 100 + randomizer.nextInt(900);
            y = 100 + randomizer.nextInt(900);
        }
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
