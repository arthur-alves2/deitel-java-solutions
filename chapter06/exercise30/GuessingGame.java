// A number guessing game where the user tries to guess a randomly chosen number between 1 and 1000
// Author: Arthur Alves

package chapter06.exercise30;

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

            do {
                System.out.println("Guess a number between 1 and 1000: ");
                userGuess = input.nextInt();

                if (userGuess > secretNumber) {
                    System.out.println("Too high. Try again.");
                } else if(userGuess < secretNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number.");
                }

            } while (userGuess != secretNumber);

            System.out.println("Do you want to play again? [1 - Yes / 0 - No]");
            playAgain = input.nextInt();

        } while (playAgain == 1);

    }
}
