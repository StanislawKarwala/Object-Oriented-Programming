package JavaInterface;

/*
Write a Java program to create an interface Flyable with a method called fly_obj().
Create three classes Spacecraft, Airplane, and Helicopter that implement the Flyable interface.
Implement the fly_obj() method for each of the three classes.
*/

interface Flyable{
    void fly_obj();
}

class Spacecraft implements Flyable{
    @Override
    public void fly_obj(){
        System.out.println("Spacecraft flies");
    }
}

class Airplane implements Flyable{
    @Override
    public void fly_obj(){
        System.out.println("Airplane flies");
    }
}

class Helicopter implements Flyable{
    @Override
    public void fly_obj(){
        System.out.println("Helicopter flies");
    }
}

public class Zad3 {
    public static void main(String[] args) {
        Spacecraft space = new Spacecraft();
        Airplane air = new Airplane();
        Helicopter heli = new Helicopter();

        space.fly_obj();
        air.fly_obj();
        heli.fly_obj();

    }
}
