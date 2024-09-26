package JavaEncapsulation;

/*
Write a Java program to create a class called House with private instance variables address, numberOfRooms, and area.
Provide public getter and setter methods to access and modify these variables.
Add a method called calculatePrice() that returns the price of the house based on its area and a price per square meter.
*/

class House{
    private String address;
    private int numberOfRooms;
    private double area;

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public int getNumberOfRooms(){
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms){
        this.numberOfRooms = numberOfRooms;
    }

    public double getArea(){
        return area;
    }

    public void setArea(double area){
        this.area = area;
    }

    public double calculatePrice(double pricePerSquare){
        return this.area * pricePerSquare;
    }
}

public class Zad11 {
    public static void main(String[] args) {
        House house = new House();
        house.setAddress("Oklahoma");
        house.setNumberOfRooms(4);
        house.setArea(120);

        System.out.println("Address: " + house.getAddress());
        System.out.println("Number of rooms: " + house.getNumberOfRooms());
        System.out.println("Area: " + house.getArea() + " square meters");
        System.out.println("Price: " + house.calculatePrice(2000));
    }
}
