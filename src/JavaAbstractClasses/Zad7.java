package JavaAbstractClasses;

/*
Write a Java program to create an abstract class Vehicle with abstract methods startEngine() and stopEngine().
Create subclasses Car and Motorcycle that extend the Vehicle class and implement the respective methods to start and stop the engines for each vehicle type.
*/

abstract class Vehicle{
    public abstract void startEngine();
    public abstract void stopEngine();
}

class Car extends Vehicle{
    @Override
    public void startEngine(){
        System.out.println("Car starting engine");
    }

    @Override
    public void stopEngine(){
        System.out.println("Car stopping engine");
    }
}

class Motorcycle extends Vehicle{
    @Override
    public void startEngine(){
        System.out.println("Motorcycle starting engine");
    }

    @Override
    public void stopEngine(){
        System.out.println("Motorcycle stopping engine");
    }
}

public class Zad7 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        car.startEngine();
        car.stopEngine();

        System.out.println();

        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}
