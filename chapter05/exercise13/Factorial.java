// Calculates the factorial of numbers from 1 to 20
// Author: Arthur Alves

package chapter05.exercise13;

public class Factorial {

    public static void main(String[] args) {
        System.out.printf("%s\t%s%n", "Number", "Factorial");
        long factorial = 1;

        for (int number = 1; number <= 20; number++) {
            factorial *= number;
            System.out.printf("%-6d\t%d%n", number, factorial);
        }

    }
}
