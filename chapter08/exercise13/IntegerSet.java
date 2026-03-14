// Represents a set of integers from 0 to 100 using a boolean array, provides methods to insert/delete elements,
// check equality, compute union/intersection, and generate a string representation
// Author: Arthur Alves

package chapter08.exercise13;

public class IntegerSet {

    private static final int SIZE = 101;
    private boolean[] set;
    private static final String ERROR_MESSAGE = "must be greater than or equal to 0 and less than or equal to " + (SIZE - 1);

    public IntegerSet() {
        this(new boolean[SIZE]);
    }

    public IntegerSet(boolean[] set) {
        boolean[] initialSet = new boolean[SIZE];
        for (int number = 0; number < SIZE; number++) {
            initialSet[number] = set[number];
        }
        this.set = initialSet;
    }

    public static IntegerSet union(IntegerSet integerSet1, IntegerSet integerSet2) {
        boolean[] set = new boolean[SIZE];
        for (int number = 0; number < SIZE; number++) {
            set[number] = integerSet1.getElement(number) || integerSet2.getElement(number);
        }

        return new IntegerSet(set);
    }

    public static IntegerSet intersection(IntegerSet integerSet1, IntegerSet integerSet2) {
        boolean[] set = new boolean[SIZE];
        for (int number = 0; number < SIZE; number++) {
            set[number] = integerSet1.getElement(number) && integerSet2.getElement(number);
        }

        return new IntegerSet(set);
    }

    public void insertElement(int k) {
        if (k < 0 || k >= SIZE) {
            throw new IllegalArgumentException(String.format("%s %s", "k", ERROR_MESSAGE));
        } else {
            set[k] = true;
        }
    }

    public void deleteElement(int m) {
        if (m < 0 || m >= SIZE) {
            throw new IllegalArgumentException(String.format("%s %s", "m", ERROR_MESSAGE));
        } else {
            set[m] = false;
        }
    }

    public boolean isEqualTo(IntegerSet integerSet) {
        for (int number = 0; number < SIZE; number++) {
            if (set[number] != integerSet.getElement(number)) {
                return false;
            }
        }

        return true;
    }

    private boolean isEmpty() {
        for (boolean bool : set) {
            if (bool) {
                return false;
            }
        }

        return true;
    }

    public boolean getElement(int element) {
        if (element < 0 ||element >= SIZE) {
            throw new IllegalArgumentException(String.format("%s %s", "element", ERROR_MESSAGE));
        } else {
            return this.set[element];
        }
    }

    public String toString() {
        String integerSetText = "";
        if (isEmpty()) {
            return "---";
        } else {
            for (int number = 0; number < SIZE; number++) {
                integerSetText += set[number] ? number + " " : "";
            }
        }

        return integerSetText;
    }
}
