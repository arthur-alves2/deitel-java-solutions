// This program prints all prime numbers between 1 and 10,000
// and counts the total number of prime numbers found in that range
// Author: Arthur Alves

package chapter06.exercise25;

public class PrimeNumbers {

    public static void main(String[] args) {

        System.out.println("Printing prime numbers between 1 and 10000: ");
        int primeCounter = 0;
        for (int counter = 2; counter <= 10000; counter++) {
            if (isPrime(counter)) {
                System.out.println("Prime number: " + counter);
                primeCounter++;
            }
        }
        System.out.printf("%nQuantity of prime numbers: " + primeCounter);
    }

    public static boolean isPrime(int number) {
        for (int counter = 2; counter <= Math.sqrt(number); counter++) {
            if (number % counter == 0) return false;
        }

        return true;
    }
}
