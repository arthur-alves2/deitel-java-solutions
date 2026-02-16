// This program calculates weekly sales commissions for salespeople, categorizes them into ranges
// and displays the number of salespeople in each commission range
// Author: Arthur Alves

package chapter07.exercise10;

import java.util.Scanner;

public class SalesCommission {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] sales = new int[11];

        while (true) {
            System.out.print("Enter the amount of gross sales made this week by the salesperson: ");
            int gross = input.nextInt();

            if (gross == -1) break;

            int  commission = (int) (200 + 0.09 * gross);
            if (commission >= 1000) {
                sales[10]++;
            } else if (commission >= 900) {
                sales[9]++;
            } else if (commission >= 800) {
                sales[8]++;
            } else if (commission >= 700) {
                sales[7]++;
            } else if (commission >= 600) {
                sales[6]++;
            } else if (commission >= 500) {
                sales[5]++;
            } else if (commission >= 400) {
                sales[4]++;
            } else if (commission >= 300) {
                sales[3]++;
            } else {
                sales[2]++;
            }
        }

        for(int counter = 10; counter >= 2; counter--) {
            if (counter == 10) {
                System.out.printf("$1000 or more %4d%n", sales[10]);
            } else {
                System.out.printf("%-13s %4d%n", "$" + counter * 100 + "-" + (counter * 100 + 99), sales[counter]);
            }
        }
    }
}
