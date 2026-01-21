// The program enters an infinite loop, printing multiples of 2.
// When the values exceed the maximum value of an int, overflow occurs,
// causing it to print negative numbers and then zero, continuing indefinitely
// Author: Arthur Alves

package chapter04.exercise33;

public class InfinityLoop {
    public static void main(String[] args) {
        int multipleOfTwo = 2;
        while (true) {
            System.out.println(multipleOfTwo);
            multipleOfTwo *= 2;
        }
    }
}
