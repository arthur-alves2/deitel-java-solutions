// Finds a value close to pi by adding and subtracting fractions
// Author: Arthur Alves

package chapter05.exercise20;

public class PiCalculator {

    public static void main(String[] args) {

        double pi = 4;
        double denominator = 3;

        for (int term = 2; term <= 200000; term++) {

            if(term % 2 == 0) {
                pi -= 4 / denominator;
            } else {
                pi += 4 / denominator;
            }
            denominator += 2;

            if(pi - 3.14159 <= 0.00001 && pi - 3.14159 >= - 0.00001) {
                System.out.printf("Found it! Term: %d%n", term);
                break;
            }

        }
    }
}
