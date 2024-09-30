package ObjectOrientedProgramming;

/*
Write a Java program to create a class called "ElectronicsProduct" with attributes for product ID, name, and price.
Implement methods to apply a discount and calculate the final price.
Create a subclass " WashingMachine" that adds a warranty period attribute and a method to extend the warranty.
*/

class ElectronicProduct{
    private int id;
    private String name;
    private double price;

    public ElectronicProduct(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public void applyDiscount(int discount){
        price -= (price * discount / 100);
    }
}

class WashingMachine extends ElectronicProduct{
    private int warrantyPeriod;

    public WashingMachine(int id, String name, double price, int warrantyPeriod){
        super(id, name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    public int getWarrantyPeriod(){
        return warrantyPeriod;
    }

    public void extendWarranty(int amount){
        warrantyPeriod += amount;
    }

    @Override
    public void applyDiscount(int discount){
        super.applyDiscount(discount);
        System.out.println("Discount applied to washing machine: " + getName());
    }
}

public class Zad24 {
    public static void main(String[] args) {
        ElectronicProduct eProd = new ElectronicProduct(1, "Phone", 999);
        WashingMachine wMach = new WashingMachine(2, "Washing Machine", 1500, 12);
        System.out.println("Electronic product: ");
        System.out.println("Name: " + eProd.getName());
        System.out.println("Price: " + eProd.getPrice());
        eProd.applyDiscount(10);
        System.out.println("Price after 10 % discount: " + eProd.getPrice());

        System.out.println("\nWashing machine: ");
        System.out.println("Name: " + wMach.getName());
        System.out.println("Price: " + wMach.getPrice());
        wMach.applyDiscount(20);
        System.out.println("Price after discount: " + wMach.getPrice());
        System.out.println("Warranty period: " + wMach.getWarrantyPeriod());
        wMach.extendWarranty(3);
        System.out.println("Extended warranty period: " + wMach.getWarrantyPeriod());
    }
}
