// Represents a savings account with an individual balance, using a shared annual interest rate
// Allows modifying the interest rate, calculating monthly interest, and retrieving the current balance
// Author: Arthur Alves

package chapter08.exercise06;

public class SavingsAccount {

    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static void modifyInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void calculateMonthlyInterest() {
        savingsBalance += savingsBalance * (annualInterestRate / 12);
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }
}
