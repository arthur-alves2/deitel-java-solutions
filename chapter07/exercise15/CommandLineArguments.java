// Initializes an integer array with a default size of 10 or a size specified via command-line arguments,
// then prints each index and its corresponding value (initialized to 0)
// Author: Arthur Alves

package chapter07.exercise15;

public class CommandLineArguments {

    public static void main(String[] args) {
        int[] array;

        if (args.length == 0) {
            array = new int[10];
        } else {
            array = new int[Integer.parseInt(args[0])];
        }

        System.out.printf("%s%8s%n", "Index", "Value");

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%5d%8d%n", i, array[i]);
        }
    }
}
