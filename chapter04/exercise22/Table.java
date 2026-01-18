// This program prints a table of numbers from 1 to 5 and their multiples by 10, 100, and 1000
// Author: Arthur Alves

package chapter04.exercise22;

public class Table {
    public static void main(String[] args) {
        int counter = 1;
        System.out.printf("N\t10*N\t100*N\t1000*N%n%n");
        while(counter <= 5) {
            System.out.println(counter + "\t" + counter * 10 + "\t\t" + counter * 100 + "\t\t" + counter * 1000);
            counter++;
        }
    }
}
