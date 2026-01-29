// This program finds and prints all Pythagorean triples (a, b, c) with integer sides up to 500, where a² + b² = c²
// Author: Arthur Alves

package chapter05.exercise21;

public class PythagoreanTriples {

    public static void main(String[] args) {
        System.out.println("Leg 1\tLeg 2\tHypotenuse");
        for (int side1 = 1; side1 <= 500; side1++) {

            for (int side2 = 1; side2 <= 500; side2++) {

                for (int hypotenuse = 1; hypotenuse <= 500; hypotenuse++) {

                    if(side1 * side1 + side2 * side2 == hypotenuse * hypotenuse) {
                        System.out.printf("%-5d\t%-5d\t%d%n", side1, side2, hypotenuse);
                    }

                }

            }
        }
    }
}
