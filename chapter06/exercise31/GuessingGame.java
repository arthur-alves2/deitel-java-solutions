// Modified from Exercise 6.30 to count guesses and give feedback based on the number of attempts
// Author: Arthur Alves

package chapter06.exercise31;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessingGame {

    private static final SecureRandom randomNumbers = new SecureRandom();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userGuess;
        int playAgain;

        do {
            int secretNumber = 1 + randomNumbers.nextInt(1000);
            int attempts = 0;

            do {
                System.out.println("Guess a number between 1 and 1000: ");
                userGuess = input.nextInt();
                attempts++;

                if (userGuess > secretNumber) {
                    System.out.println("Too high. Try again.");
                } else if(userGuess < secretNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number.");

                    if (attempts > 10) {
                        System.out.println("You should be able to do better.");
                    } else if (attempts == 10) {
                        System.out.println("Aha! You know the secret!");
                    } else {
                        System.out.println("Either you know the secret or you got lucky!");
                    }
                }

            } while (userGuess != secretNumber);

            System.out.println("Do you want to play again? [1 - Yes / 0 - No]");
            playAgain = input.nextInt();

        } while (playAgain == 1);

    }
}
