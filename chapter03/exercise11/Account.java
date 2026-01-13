// The Account class stores a holder’s name and balance, allowing deposits, withdrawals, and info retrieval safely
// Author: Arthur Alves

package chapter03.exercise11;

public class Account {

    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        if( balance > 0.0) 
            this.balance = balance; 
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) 
            this.balance = balance + depositAmount;
    }
    
    public void withdraw(double amountToWithdraw) {
        if (amountToWithdraw > balance)
            System.out.println("Withdrawal amount exceeded account balance");
        if (amountToWithdraw <= balance)
            balance = balance - amountToWithdraw;
    }
    
    public double getBalance() {
        return balance;    
    }
    
    public void setName(String name) {
        this.name = name;    
    }
    
    public String getName() {
        return name;
    }
}

