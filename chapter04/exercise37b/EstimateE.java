// This program calculates an estimate of e by adding fractions of factorials
// Author: Arthur Alves

package chapter04.exercise37b;

import java.util.Scanner;

public class EstimateE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of terms greater than or equal to 1: ");
        int numberOfTerms = input.nextInt();

        while (numberOfTerms < 1) {
            System.out.println("Invalid input!");
            System.out.print("Enter a number of terms greater than or equal to 1: ");
            numberOfTerms = input.nextInt();
        }

        double estimateE = 1;
        double factorial = 1;
        int term = 1;

        while (term <= numberOfTerms) {
            factorial *= term;
            estimateE += 1.0 / factorial;
            term++;
        }
        
        System.out.printf("Estimative for %d terms: %.2f", numberOfTerms, estimateE);
    }
}
