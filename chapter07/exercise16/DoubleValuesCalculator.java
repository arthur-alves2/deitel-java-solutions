// This program sums all command-line arguments interpreted as double values and prints the total
// Author: Arthur Alves

package chapter07.exercise16;

public class DoubleValuesCalculator {

    public static void main(String[] args) {
        double total = 0;

        for (String argument : args) {
            total += Double.parseDouble(argument);
        }

        System.out.printf("Total: %.2f%n", total);
    }
}
