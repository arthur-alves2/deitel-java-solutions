// Simulates a Heads or Tails game
// The user can toss a coin repeatedly, and the program counts
// how many times HEADS and TAILS appear
// Author: Arthur Alves

package chapter06.exercise29;

import java.security.SecureRandom;
import java.util.Scanner;

public class HeadsOrTails {

    private static final SecureRandom randomNumbers = new SecureRandom();
    private enum Coin {HEADS, TAILS};


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int selectedOption;
        int headsCounter = 0;
        int tailsCounter = 0;

        do {
            System.out.println("---------- MENU ----------");
            System.out.println("[1] Toss Coin");
            System.out.println("[2] Quit");
            System.out.println("--------------------------");

            System.out.print("Enter the desired option: ");
            selectedOption = input.nextInt();

            if (selectedOption < 1 || selectedOption > 2) {
                System.out.println("\nPlease select valid options only!\n");

            } else if (selectedOption == 1) {
                Coin coin = flip();

                if (coin == Coin.HEADS) {
                    headsCounter++;
                } else {
                    tailsCounter++;
                }

                System.out.println("\nResult: " + coin + "\n");
            }
        } while (selectedOption != 2);

        System.out.printf("Heads counter: %d%nTails counter: %d%n", headsCounter, tailsCounter);
    }

    public static Coin flip() {
        return randomNumbers.nextInt(2) < 1 ? Coin.HEADS : Coin.TAILS;
    }
}
