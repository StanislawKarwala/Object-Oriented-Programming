package JavaInheritance;

/*
Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses Truck, Car and Motorcycle.
Each subclass should have properties such as make, model, year, and fuel type.
Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.
*/

abstract class Vehiclee{
    private String make;
    private String model;
    private int year;
    private String fuelType;
    private double fuelEfficiency;

    public Vehiclee(String make, String model, int year, String fuelType, double fuelEfficiency){
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.fuelEfficiency = fuelEfficiency;
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
    public String getFuelType(){
        return fuelType;
    }
    public double getFuelEfficiency(){
        return fuelEfficiency;
    }
    public abstract double calculateFuelEfficiency();
    public abstract double calculateDistanceTravelled();
    public abstract double getMaxSpeed();
}

class Truck extends Vehiclee{
    private double cargoCapacity;

    public Truck(String make, String model, int year, String fuelType, double fuelEfficiency, double cargoCapacity){
        super(make, model, year, fuelType, fuelEfficiency);
        this.cargoCapacity = cargoCapacity;
    }
    public double getCargoCapacity(){
        return cargoCapacity;
    }
    @Override
    public double calculateFuelEfficiency(){
        return getFuelEfficiency() * (1.0 / (1.0 + (getCargoCapacity())));
    }
    @Override
    public double calculateDistanceTravelled(){
        return calculateFuelEfficiency() * getFuelEfficiency();
    }
    @Override
    public double getMaxSpeed(){
     return 120.0;
    }
}

class Carr extends Vehiclee{
    private double carCapacity;

    public Carr(String make, String model, int year, String fuelType, double fuelEfficiency, double carCapacity){
        super(make, model, year, fuelType, fuelEfficiency);
        this.carCapacity = carCapacity;
    }
    public double getCarCapacity(){
        return carCapacity;
    }
    @Override
    public double calculateFuelEfficiency(){
        return getFuelEfficiency() * (1.0 / (1.0 + (getCarCapacity())));
    }
    @Override
    public double calculateDistanceTravelled(){
        return calculateFuelEfficiency() * getFuelEfficiency();
    }
    @Override
    public double getMaxSpeed(){
        return 200.0;
    }

}

class Motorcycle extends Vehiclee{
    private double motorcycleCapacity;

    public Motorcycle(String make, String model, int year, String fuelType, double fuelEfficiency, double motorcycleCapacity){
        super(make, model, year, fuelType, fuelEfficiency);
        this.motorcycleCapacity = motorcycleCapacity;
    }
    public double getMotorcycleCapacity(){
        return motorcycleCapacity;
    }
    @Override
    public double calculateFuelEfficiency(){
        return getFuelEfficiency() * (1.0 / (1.0 + (getMotorcycleCapacity())));
    }
    @Override
    public double calculateDistanceTravelled(){
        return calculateFuelEfficiency() * getFuelEfficiency();
    }
    @Override
    public double getMaxSpeed(){
        return 260.0;
    }
}

public class Zad9 {
    public static void main(String[] args) {
        Truck truck = new Truck("Tatra", "Tatra 810 4x4", 2020, "GASOLINE", 8.112, 4.5);
        Carr car = new Carr("Volkswagen", "Virtus", 2019, "HYBRID", 6.123, 8);
        Motorcycle motorcycle = new Motorcycle("Massimo Motor", "Warrior200", 2018, "GASOLINE", 2.1, 5);

        System.out.println("Truck Model: " + truck.getModel());
        System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance Traveled: " + truck.calculateDistanceTravelled() + " miles");
        System.out.println("Max Speed: " + truck.getMaxSpeed() + " mph\n");

        System.out.println("Car Model: " + car.getModel());
        System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance Traveled: " + car.calculateDistanceTravelled() + " miles");
        System.out.println("Max Speed: " + car.getMaxSpeed() + " mph\n");

        System.out.println("Motorcycle Model: " + motorcycle.getModel());
        System.out.println("Fuel Efficiency: " + motorcycle.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance Traveled: " + motorcycle.calculateDistanceTravelled() + " miles");
        System.out.println("Max Speed: " + motorcycle.getMaxSpeed() + " mph");
    }
}
