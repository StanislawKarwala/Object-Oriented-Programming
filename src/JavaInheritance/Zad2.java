package JavaInheritance;

/*
Write a Java program to create a class called Vehicle with a method called drive().
Create a subclass called Car that overrides the drive() method to print "Repairing a car".
*/
class Vehicle{
    void drive(){
        System.out.println("Repairing a vehicle");
    }
}

class Car extends Vehicle{
    @Override
    void drive(){
        System.out.println("Repairing a car");
    }
}

public class Zad2 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.drive();

        Car car = new Car();
        car.drive();
    }
}
