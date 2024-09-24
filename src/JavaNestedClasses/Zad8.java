package JavaNestedClasses;

/*
Anonymous Class Implementing Abstract Class:
Write a Java program to create an abstract class called Animal with an abstract method makeSound().
In the main method, create an anonymous class that extends Animal and override the makeSound() method to print "Meow" for a cat.
Call the makeSound() method.
*/

abstract class Animal{
    abstract void makeSound();
}

public class Zad8 {
    public static void main(String[] args) {
        Animal cat = new Animal(){
            @Override
            void makeSound(){
                System.out.println("Meow");
            }
        };
        cat.makeSound();
    }
}
