package JavaEncapsulation;

/*
Write a Java program to create a class called Product with private instance variables productName, productCode, and price.
Provide public getter and setter methods to access and modify these variables.
Add a method called applyDiscount() that takes a percentage and reduces the price by that percentage.
*/

class Product{
    private String productName;
    private String productCode;
    private double price;

    public String getProductName(){
        return productName;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public String getProductCode(){
        return productCode;
    }

    public void setProductCode(String productCode){
        this.productCode = productCode;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void applyDiscount(double discount){
        if(discount > 0 && discount <= 100){
            price -= price * (discount / 100);
        }
    }
}

public class Zad14 {
    public static void main(String[] args) {
        Product product = new Product();
        int price = 10;
        int discount = 30;

        product.setProductName("Apple");
        product.setProductCode("15243");
        product.setPrice(price);

        System.out.println("Product name: " + product.getProductName());
        System.out.println("Product code: " + product.getProductCode());
        System.out.println("Product price: " + product.getPrice());
        product.applyDiscount(discount);
        System.out.println("Applying " + discount + "% discount");
        System.out.println("Product price after discount: " + product.getPrice());
    }
}
