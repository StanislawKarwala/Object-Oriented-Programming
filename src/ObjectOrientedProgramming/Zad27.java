package ObjectOrientedProgramming;

/*
Write a Java program to create a class called "CustomerOrder" with attributes for order ID, customer, and order date.
Create a subclass "OnlineOrder" that adds attributes for delivery address and tracking number.
Implement methods to calculate delivery time based on the address and update the tracking status.
*/

import java.time.LocalDate;

class CustomerOrder{
    private int id;
    private String customer;
    private LocalDate date;

    public CustomerOrder(int id, String customer, LocalDate date){
        this.id = id;
        this.customer = customer;
        this.date = date;
    }

    public void displayOrderDetails(){
        System.out.println("Order id: " + id);
        System.out.println("Order customer: " + customer);
        System.out.println("Order date: " + date);
    }
}

class OnlineOrder extends CustomerOrder{
    private String deliveryAddress;
    private String trackingNumber;

    public OnlineOrder(int id, String customer, LocalDate date, String deliveryAddress, String trackingNumber){
        super(id, customer, date);
        this.deliveryAddress = deliveryAddress;
        this.trackingNumber = trackingNumber;
    }

    public double calculateDeliveryTime(){
        return deliveryAddress.length() * 0.1;
    }

    public void updateTrackingStatus(String newStatus){
        System.out.println("Tracking number: " + trackingNumber + " - Status: " + newStatus);
    }

    @Override
    public void displayOrderDetails(){
        super.displayOrderDetails();
        System.out.println("Delivery time: " + calculateDeliveryTime());
        System.out.println("Tracking number: " + trackingNumber);
    }
}

public class Zad27 {
    public static void main(String[] args) {
        OnlineOrder online = new OnlineOrder(1, "John", LocalDate.of(2024,10,05), "Krakow 35", "10345");
        online.displayOrderDetails();
        System.out.println();
        online.updateTrackingStatus("Shipping");

    }
}
