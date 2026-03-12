// Demonstrates the Rectangle class: creates rectangles, calculates area and perimeter
// Handles exceptions for invalid height or width values
// Author: Arthur Alves

package chapter08.exercise4;

public class RectangleTest {

    public static void main(String[] args) {

        // Rectangle r1 without arguments
        Rectangle r1 = new Rectangle();
        System.out.println("Rectangle r1 without arguments");
        System.out.println("Height: " + r1.getHeight());
        System.out.println("Width: " + r1.getWidth());
        System.out.println("Area: " + r1.calculateArea());
        System.out.println("Perimeter: " + r1.calculatePerimeter());


        System.out.println("\n----------------------------------------\n");


        // Rectangle r2 with valid arguments
        Rectangle r2 = new Rectangle(5.0, 10.0);
        System.out.println("Rectangle r2 with valid arguments");
        System.out.println("Height: " + r2.getHeight());
        System.out.println("Width: " + r2.getWidth());
        System.out.println("Area: " + r2.calculateArea());
        System.out.println("Perimeter: " + r2.calculatePerimeter());


        // Setting r2's height to an invalid value
        System.out.println("\nSetting r2's height to an invalid value");
        try {
            r2.setHeight(-5.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        // Setting r2's width to an invalid value
        System.out.println("\nSetting r2's width to an invalid value");
        try {
            r2.setWidth(-10.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("\n----------------------------------------\n");


        // Rectangle r3 with invalid height and valid width
        System.out.println("Rectangle r3 with invalid height");
        try {
            Rectangle r3 = new Rectangle(-5.0, 10.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("\n----------------------------------------\n");


        // Rectangle r4 with valid height and invalid width
        System.out.println("Rectangle r4 with invalid width");
        try {
            Rectangle r4 = new Rectangle(5.0, -10.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("\n----------------------------------------\n");


        // Rectangle r5 with invalid height and width
        System.out.println("Rectangle r5 with invalid height and width");
        try {
            Rectangle r5 = new Rectangle(-5.0, -10.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
