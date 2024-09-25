package JavaInheritance;

/*
Write a Java program to create a class called Animal with a method called makeSound().
Create a subclass called Cat that overrides the makeSound() method to bark.
*/

class Animal{
    void makeSound(){
        System.out.println("Animal sound");
    }
}

class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Cat sound");
    }
}

public class Zad1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        Cat cat = new Cat();
        cat.makeSound();
    }
}
