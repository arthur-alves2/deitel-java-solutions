// Simulates rolling two dice 36 million times and counts the occurrences of each possible sum
// Author: Arthur Alves

package chapter07.exercise17;

import java.util.Random;

public class DiceGame {

    private static final Random randomizer = new Random();

    public static void main(String[] args) {
        int[] occurrences = new int[13];

        for (int i = 0; i < 36000000; i++) {
            int total = (1 + randomizer.nextInt(6)) + (1 + randomizer.nextInt(6));
            occurrences[total]++;
        }

        System.out.printf("%s\t%s%n", "Category", "Occurrences");
        for (int i = 2; i < 13; i++ ) {
            System.out.printf("%-8d\t%-11d%n", i, occurrences[i]);
        }
    }
}
