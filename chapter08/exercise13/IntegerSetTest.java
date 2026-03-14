// Demonstrates the functionality of the IntegerSet class
// Author: Arthur Alves
package chapter08.exercise13;

public class IntegerSetTest {

    public static void main(String[] args) {

        System.out.println("integerSet1: creating the set");
        IntegerSet integerSet1 = new IntegerSet();
        System.out.println("integerSet1: an empty set was created");
        System.out.println("integerSet1: displaying the set");
        System.out.println("integerSet1: " + integerSet1);
        System.out.println("integerSet1: inserting the elements 1, 2 and 3");
        integerSet1.insertElement(1);
        integerSet1.insertElement(2);
        integerSet1.insertElement(3);
        System.out.println("integerSet1: displaying the set");
        System.out.println("integerSet1: " + integerSet1);

        System.out.println("\n----------------------------------------\n");

        System.out.println("integerSet2: creating the set");
        IntegerSet integerSet2 = new IntegerSet();
        System.out.println("integerSet2: an empty set was created");
        System.out.println("integerSet2: displaying the set");
        System.out.println("integerSet2: " + integerSet2);
        System.out.println("integerSet2: inserting the elements 4, 5 and 6");
        integerSet2.insertElement(4);
        integerSet2.insertElement(5);
        integerSet2.insertElement(6);
        System.out.println("integerSet2: " + integerSet2);
        System.out.println("integerSet2: is equal to integerSet1? " + integerSet2.isEqualTo(integerSet1));

        System.out.println("\n----------------------------------------\n");

        System.out.println("integerSet3: creating a union set between integerSet1 and integerSet2");
        IntegerSet integerSet3 = IntegerSet.union(integerSet1, integerSet2);
        System.out.println("integerSet3: a union set between integerSet1 and integerSet2 was created");
        System.out.println("integerSet3: displaying the set");
        System.out.println("integerSet3: " + integerSet3);

        System.out.println("\n----------------------------------------\n");

        System.out.println("integerSet4: creating an intersection set between integerSet2 and integerSet3");
        IntegerSet integerSet4 = IntegerSet.intersection(integerSet2, integerSet3);
        System.out.println("integerSet4: an intersection set between integerSet2 and integerSet3 was created");
        System.out.println("integerSet4: displaying the set");
        System.out.println("integerSet4: " + integerSet4);
        System.out.println("integerSet4: is equal to integerSet2? " + integerSet4.isEqualTo(integerSet2));
        System.out.println("integerSet4: deleting the elements 4, 5, 6");
        integerSet4.deleteElement(4);
        integerSet4.deleteElement(5);
        integerSet4.deleteElement(6);
        System.out.println("integerSet4: displaying the set");
        System.out.println("integerSet4: " + integerSet4);

        System.out.println("integerSet4: trying to insert element 1000");
        try {
            integerSet4.insertElement(1000);
        } catch (IllegalArgumentException e) {
            System.out.printf("%s: %s%n", "integerSet4", e.getMessage());
        }

        System.out.println("integerSet4: trying to delete element 1000");
        try {
            integerSet4.deleteElement(1000);
        } catch (IllegalArgumentException e) {
            System.out.printf("%s: %s%n", "integerSet4", e.getMessage());
        }

        System.out.println("integerSet4: displaying the set");
        System.out.println("integerSet4: " + integerSet4);
    }
}
