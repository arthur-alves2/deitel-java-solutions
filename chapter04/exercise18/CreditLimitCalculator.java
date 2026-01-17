// Calculates a customer's new balance and checks if their credit limit is exceeded
// Author: Arthur Alves

package chapter04.exercise18;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the account number or -1 to quit: ");
        int accountNumber = input.nextInt();
        while (accountNumber != -1) {
            System.out.print("Balance at the beginning of the month: ");
            int beginningBalance = input.nextInt();
            System.out.print("Total of all items charged to the customer during the month: ");
            int totalCharges = input.nextInt();
            System.out.print("Total credits applied to the customer during the month: ");
            int totalCredits = input.nextInt();
            System.out.print("Authorized credit limit: ");
            int creditLimit = input.nextInt();
            int balance = beginningBalance + totalCharges - totalCredits;
            System.out.printf("Balance: %d%n", balance);
            if(balance > creditLimit) {
                System.out.println("Credit limit exceeded!");
            }
            System.out.print("Enter the account number or -1 to quit: ");
            accountNumber = input.nextInt();
        }
    }
}
