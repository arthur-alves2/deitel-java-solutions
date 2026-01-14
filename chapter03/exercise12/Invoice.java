// Represents an item invoice for a store, storing item number, description, quantity, and price per item.
// Calculates the total amount and ensures quantity and price are non-negative
// Author: Arthur Alves

package chapter03.exercise12;

public class Invoice {
    private String number;
    private String description;
    int quantityPurchased;
    private double pricePerItem;

    public Invoice(String number, String description, int quantityPurchased, double pricePerItem) {
        this.number = number;
        this.description = description;
        this.quantityPurchased = quantityPurchased;
        this.pricePerItem = pricePerItem;
    }

    public double getInvoiceAmount() {
        double InvoiceAmount;
        if (quantityPurchased <= 0)
            return 0;
        if (pricePerItem <= 0)
            return 0;
        return quantityPurchased * pricePerItem;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantityPurchased() {
        return quantityPurchased;
    }

    public void setQuantityPurchased(int quantityPurchased) {
        this.quantityPurchased = quantityPurchased;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }
}
