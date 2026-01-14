// EmployeeTest class: tests the Employee class by creating two employees,
// displaying their annual salaries, giving a 10% raise, and showing the updated salaries.
// Author: Arthur Alves

package chapter03.exercise13;

public class EmployeeTest {
    public static void main() {
        Employee employee1 = new Employee("Gustavo", "Machado", 3500.00);
        Employee employee2 = new Employee("Letícia", "Ferreira", 6700.00);

        System.out.println("---------- Employe 1 ----------");
        System.out.printf("First name: %s%n", employee1.getName());
        System.out.printf("Last name: %s%n", employee1.getLastName());
        System.out.printf("Annual salary: %.2f%n", employee1.getSalary() * 12);
        System.out.printf("Monthly salary: %.2f%n", employee1.getSalary());
        System.out.printf("Increasing %s %s's salary by 10%%%n", employee1.getName(), employee1.getLastName());
        employee1.setSalary(0.10 * employee1.getSalary() + employee1.getSalary());
        System.out.printf("New %s %s monthly salary: %.2f%n", employee1.getName(), employee1.getLastName(),
                employee1.getSalary());
        System.out.printf("%n---------- Employee 2 ----------%n");
        System.out.printf("First name: %s%n", employee2.getName());
        System.out.printf("Last name: %s%n", employee2.getLastName());
        System.out.printf("Annual salary: %.2f%n", employee2.getSalary() * 12);
        System.out.printf("Monthly salary: %.2f%n", employee2.getSalary());
        System.out.printf("Increasing %s %s's salary by 10%%%n", employee2.getName(), employee2.getLastName());
        employee2.setSalary(0.10 * employee2.getSalary() + employee2.getSalary());
        System.out.printf("New %s %s's monthly salary: %.2f%n", employee2.getName(), employee2.getLastName(),
                employee2.getSalary());
    }
}
