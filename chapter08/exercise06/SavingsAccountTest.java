// Tests the SavingsAccount class by creating two accounts with initial balances, applying a
// shared annual interest rate, and displaying monthly balances over a given period
// Demonstrates how interest rate changes affect account balances
// Author: Arthur Alves

package chapter08.exercise06;

public class SavingsAccountTest {

    public static void main(String[] args) {

        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        SavingsAccount.modifyInterestRate(0.04);

        displayBalances(saver1, saver2, 12);

        SavingsAccount.modifyInterestRate(0.05);

        displayBalances(saver1, saver2, 1);
    }

    public static void displayBalances(SavingsAccount saver1, SavingsAccount saver2, int months) {
        for (int month = 0; month < months; month++) {
            System.out.printf("----- Month %d -----%n", (month + 1));

            saver1.calculateMonthlyInterest();
            System.out.printf("saver1's balance: %.2f%n", saver1.getSavingsBalance());

            saver2.calculateMonthlyInterest();
            System.out.printf("saver2's balance: %.2f%n", saver2.getSavingsBalance());

            System.out.println();
        }
    }
}
