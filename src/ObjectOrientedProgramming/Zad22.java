package ObjectOrientedProgramming;

/*
Write a Java program to create a class called "Customer" with attributes for name, email, and purchase history.
Implement methods to add purchases to the history and calculate total expenditure.
Create a subclass "LoyalCustomer" that adds a discount rate attribute and a method to apply the discount.
*/

import java.util.ArrayList;
import java.util.List;

class Customer{
    private String name;
    private String email;
    private List<Double> purchaseHistory;

    public Customer(String name, String email){
        this.name = name;
        this.email = email;
        this.purchaseHistory = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void addPurchase(double amount){
        purchaseHistory.add(amount);
    }

    public double totalExpenditure(){
        double total = 0;
        for(double purchase : purchaseHistory){
            total += purchase;
        }
        return total;
    }
}

class LoyalCustomer extends Customer{
    private double discountRate;

    public LoyalCustomer(String name, String email, double discountRate){
        super(name, email);
        this.discountRate = discountRate;
    }

    public double applyDiscount(double discount){
        return discount - (discount * discountRate / 100);
    }

    @Override
    public void addPurchase(double amount){
        double discountAmount = applyDiscount(amount);
        super.addPurchase(discountAmount);
    }
}

public class Zad22 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John Doe", "johndoe@123.com");
        customer1.addPurchase(500);
        customer1.addPurchase(900);
        System.out.println("Total expenditure for " + customer1.getName() + ": " + customer1.totalExpenditure());

        LoyalCustomer loyalCustomer = new LoyalCustomer("Loyal Customer", "loycust@123.com", 15);
        loyalCustomer.addPurchase(500);
        loyalCustomer.addPurchase(900);
        System.out.println("Total expenditure for " + loyalCustomer.getName() + " after discount: " + loyalCustomer.totalExpenditure());
    }
}
