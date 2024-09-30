package ObjectOrientedProgramming;

/*
Write a Java program to create a class called "Vehicle" with attributes for make, model, and year.
Create subclasses "Car" and "Truck" that add specific attributes like trunk size for cars and payload capacity for trucks.
Implement a method to display vehicle details in each subclass.
*/

class Vehicle{
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public void displayDetails() {
        System.out.println("Vehicle Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle{
    private double trunkSize;

    public Car(String make, String model, int year, double trunkSize){
        super(make, model, year);
        this.trunkSize = trunkSize;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Trunk Size: " + trunkSize + " cubic feet");
    }
}

class Truck extends Vehicle{
    private double payloadCapacity;

    public Truck(String make, String model, int year, double payloadCapacity){
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Payload Capacity: " + payloadCapacity + " tons");
    }
}

public class Zad21 {
    public static void main(String[] args) {
        Car car = new Car("Honda", "Ivictus", 2010, 199.9);
        Truck truck = new Truck("Truck", "Trackmania", 2001, 19.5);

        car.displayDetails();
        System.out.println();
        truck.displayDetails();
    }
}
