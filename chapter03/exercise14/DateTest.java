// The DateTest class is a test application that creates Date objects
// and demonstrates the functionality of the Date class.
// Author: Arthur Alves

package chapter03.exercise14;

public class DateTest {
    public static void main() {
        Date date1 = new Date(1, 14, 2026);
        System.out.printf("Moth: %d%n", date1.getMonth());
        System.out.printf("Day: %d%n", date1.getDay());
        System.out.printf("Year: %d%n", date1.getYear());
        date1.displayDate();
    }
}
