// This program generates and displays a table of numbers from 0 to 10, along with their squares and cubes
// Author: Arthur Alves

package chapter02.exercise31;

public class SquaresAndCubesTable {
    public static void main(String[] args) {
        System.out.println("number\tsquare\tcube");
        System.out.println("0\t0\t0");
        System.out.println("1\t1\t1");
        System.out.printf("%d\t%d\t%d%n", 2, 2 * 2, 2 * 2 * 2);
        System.out.printf("%d\t%d\t%d%n", 3, 3 * 3, 3 * 3 * 3);
        System.out.printf("%d\t%d\t%d%n", 4, 4 * 4, 4 * 4 * 4);
        System.out.printf("%d\t%d\t%d%n", 5, 5 * 5, 5 * 5 * 5);
        System.out.printf("%d\t%d\t%d%n", 6, 6 * 6, 6 * 6 * 6);
        System.out.printf("%d\t%d\t%d%n", 7, 7 * 7, 7 * 7 * 7);
        System.out.printf("%d\t%d\t%d%n", 8, 8 * 8, 8 * 8 * 8);
        System.out.printf("%d\t%d\t%d%n", 9, 9 * 9, 9 * 9 * 9);
        System.out.printf("%d\t%d\t%d%n", 10, 10 * 10, 10 * 10 * 10);
    }
}
