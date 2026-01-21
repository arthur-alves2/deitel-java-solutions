// This program prints a 16x16 checkerboard pattern to the console using asterisks and spaces
// Author: Arthur Alves

package chapter04.exercise32;

public class CheckersBoard {
    public static void main(String[] args) {
        int line = 1;
        int column = 1;
        while (line <= 16) {
            while (column <= 16) {
                if (line % 2 == 0) {
                    if (column % 2 == 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (column % 2 != 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print(" ");
                    }
                }
                column++;
            }
            System.out.println();
            line++;
            column = 1;
        }
    }
}
