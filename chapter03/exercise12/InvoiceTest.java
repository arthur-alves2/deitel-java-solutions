// Test class for verifying the functionality of the Invoice class
// Author: Arthur Alves

package chapter03.exercise12;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("001", "Processor", 3, 899.90);
        Invoice invoice2 = new Invoice("002", "Motherboard", -5, 699.99); // negative quantityPurchased
        Invoice invoice3 = new Invoice("003", "Mouse", 7, -120.90); // negative PricePerItem
        System.out.printf("invoice1 description: %s%n", invoice1.getDescription());
        System.out.printf("invoice1 number: %s%n", invoice1.getNumber());
        System.out.printf("invoice1 quantity purchased: %d%n", invoice1.quantityPurchased);
        System.out.printf("invoice1 price per item: %.2f%n", invoice1.getPricePerItem());
        System.out.printf("invoice1 total: %.2f%n", invoice1.getInvoiceAmount());
        System.out.println("----------");
        System.out.printf("invoice2 description: %s%n", invoice2.getDescription());
        System.out.printf("invoice2 number: %s%n", invoice2.getNumber());
        System.out.printf("invoice2 quantity purchased: %d%n", invoice2.quantityPurchased);
        System.out.printf("invoice2 price per item: %.2f%n", invoice2.getPricePerItem());
        System.out.printf("invoice2 total: %.2f%n", invoice2.getInvoiceAmount());
        System.out.println("----------");
        System.out.printf("invoice3 description: %s%n", invoice3.getDescription());
        System.out.printf("invoice3 number: %s%n", invoice3.getNumber());
        System.out.printf("invoice3 quantity purchased: %d%n", invoice3.quantityPurchased);
        System.out.printf("invoice3 price per item: %.2f%n", invoice3.getPricePerItem());
        System.out.printf("invoice3 total: %.2f%n", invoice3.getInvoiceAmount());
    }
}
