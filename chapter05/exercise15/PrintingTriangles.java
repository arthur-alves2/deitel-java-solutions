// This program prints four different types of triangles using asterisks
// Author: Arthur Alves

package chapter05.exercise15;

public class PrintingTriangles {

    public static void main(String[] args) {

        for (int line = 1; line <= 10; line++) {
            for (int column = 1; column <= 10; column++) {
                if (column <= line) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int line = 1; line <= 10; line++) {
            for (int column = 1; column <= 10; column++) {
                if ( column <= 11 - line) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int line = 1; line <= 10; line++) {
            for (int column = 1; column <= 10; column++) {
                if (column <= line) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int line = 1; line <= 10; line++) {
            for (int column = 1; column <= 10; column++) {
                if(column <= 11 - line) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
