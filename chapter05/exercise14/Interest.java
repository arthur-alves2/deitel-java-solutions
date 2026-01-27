// Compound-interest calculations with different rates using for
// Author: Arthur Alves

package chapter05.exercise14;

public class Interest {
    public static void main(String[] args) {
        double principal = 1000.0;
        double rate = 0.05;

        System.out.printf("%s\t%s\t%s%n", "Year", "Rate", "Amount on deposit");

        for (int year = 1; year <= 10; ++year) {

            for (int rates = 1; rates <= 6; rates++) {
                double amount = principal * Math.pow(1.0 + rate, year);
                System.out.printf("%-4d\t%.2f\t%.2f%n", year, rate, amount);
                rate += 0.01;
            }

            rate = 0.05;
            System.out.println("-------------------------");

        }
    }
}
