package JavaAbstractClasses;

/*
Write a Java program to create an abstract class Bird with abstract methods fly() and makeSound().
Create subclasses Eagle and Hawk that extend the Bird class and implement the respective methods to describe how each bird flies and makes a sound.
*/

abstract class Bird{
    public abstract void fly();
    public abstract void makeSound();
}

class Eagle extends Bird{
    @Override
    public void fly(){
        System.out.println("Eagle is flying");
    }

    @Override
    public void makeSound(){
        System.out.println("Eagle is making a sound");
    }
}

class Hawk extends Bird{
    @Override
    public void fly(){
        System.out.println("Hawk is flying");
    }

    @Override
    public void makeSound(){
        System.out.println("Hawk is making a sound");
    }
}

public class Zad11 {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird hawk = new Hawk();

        eagle.fly();
        eagle.makeSound();

        System.out.println();

        hawk.fly();
        hawk.makeSound();
    }
}
