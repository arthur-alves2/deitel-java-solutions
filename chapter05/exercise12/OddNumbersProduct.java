// Calculates the product of all odd integers from 1 to 15
// Author: Arthur Alves

package chapter05.exercise12;

public class OddNumbersProduct {

    public static void main(String[] args) {
        int product = 1;

        for (int counter = 15; counter >= 1; counter-= 2) {
            product *= counter;
        }

        System.out.printf("Product: %d%n", product);

    }
}
