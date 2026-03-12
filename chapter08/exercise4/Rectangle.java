// Represents a rectangle with height and width
// Includes validated setters, getters, and methods to calculate area and perimeter
// Author: Arthur Alves

package chapter08.exercise4;

public class Rectangle {

    private double height;
    private double width;
    private final String errorMessage = "must be greater than 0.0 and less than 20.0";

    Rectangle() {
        this(1.0, 1.0);
    }

    Rectangle(double height, double width) {
        if (isHeightValid(height) && isWidthValid(width)) {
            this.height = height;
            this.width = width;
        } else {
            throw new IllegalArgumentException(String.format("%s and %s %s%n", "Height", "width", errorMessage));
        }
    }

    public double calculateArea() {
        return height * width;
    }

    public double calculatePerimeter() {
        return 2 * (height + width);
    }

    public void setHeight(double height) {
        if (isHeightValid(height)) {
            this.height = height;
        } else {
            throw new IllegalArgumentException(String.format("%s %s", "Height", errorMessage));
        }
    }

    public double getHeight(){
        return height;
    }

    public void setWidth(double width) {
        if (isWidthValid(width)) {
            this.width = width;
        } else {
            throw new IllegalArgumentException(String.format("%s %s", "Width", errorMessage));
        }
    }

    public double getWidth(){
        return width;
    }

    private boolean isHeightValid(double height) {
        return height > 0.0 && height < 20.0;
    }

    private boolean isWidthValid(double width) {
        return width > 0.0 && width < 20.0;
    }
}
