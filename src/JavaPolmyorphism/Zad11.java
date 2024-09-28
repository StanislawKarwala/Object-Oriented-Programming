package JavaPolmyorphism;

/*
Write a Java program to create a base class Vehicle with methods startEngine() and stopEngine().
Create two subclasses Car and Motorcycle.
Override the startEngine() and stopEngine() methods in each subclass to start and stop the engines differently.
*/

abstract class Vehiclee{
    public abstract void startEngine();
    public abstract void stopEngine();
}

class Carr extends Vehiclee{
    @Override
    public void startEngine(){
        System.out.println("Car starts an engine");
    }

    @Override
    public void stopEngine(){
        System.out.println("Car stops an engine");
    }
}

class Motorcyclee extends Vehiclee{
    @Override
    public void startEngine(){
        System.out.println("Motorcycle starts an engine");
    }

    @Override
    public void stopEngine(){
        System.out.println("Motorcycle stops an engine");
    }
}

public class Zad11 {
    public static void main(String[] args) {
        Carr car = new Carr();
        Motorcyclee motor = new Motorcyclee();

        startAndStopEngine(car);
        startAndStopEngine(motor);
    }

    public static void startAndStopEngine(Vehiclee vehicle){
        vehicle.startEngine();
        vehicle.stopEngine();
    }
}
