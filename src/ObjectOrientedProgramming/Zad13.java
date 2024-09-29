package ObjectOrientedProgramming;

/*
Write a Java program to create a class called "Inventory" with a collection of products and methods to add and remove products, and to check for low inventory.
*/

import java.util.ArrayList;
import java.util.List;

class Inventory{
    private List<Product> products;

    public Inventory(){
        this.products = new ArrayList<>();
    }

    public void addProducts(Product product){
        products.add(product);
    }

    public void removeProduct(Product product){
        products.remove(product);
    }

    public void printAll(){
        for(Product product : products){
            System.out.println(product);
        }
    }
}

class Product{
    private String name;
    private String barcode;
    private double price;

    public Product(String name, String barcode, double price){
        this.name = name;
        this.barcode = barcode;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public String getBarCode(){
        return barcode;
    }

    @Override
    public String toString(){
        return "Product: " + name + ", barcode: " + barcode + ", price: " + price;
    }
}

public class Zad13 {
    public static void main(String[] args) {
        Inventory inc = new Inventory();
        Product product = new Product("Apple", "A123", 2.99);
        Product product1 = new Product("HP Notebook", "L621", 2199.99);
        Product product2 = new Product("Knife", "K11", 19.99);

        inc.addProducts(product);
        inc.addProducts(product1);
        System.out.println("All products:");
        inc.printAll();

        inc.addProducts(product2);
        System.out.println("\nAdding: " + product2.getName());
        System.out.println("\nAll products:");
        inc.printAll();

        System.out.println("\nRemoving: " + product.getName());
        inc.removeProduct(product);
        System.out.println("\nAll products:");
        inc.printAll();
    }
}
