package JavaPolmyorphism;

/*
Write a Java program to create a base class Animal (Animal Family) with a method called Sound().
Create two subclasses Bird and Cat.
Override the Sound() method in each subclass to make a specific sound for each animal.
*/

class Animal{
    public void sound(){
        System.out.println("Animal Family sound");
    }
}

class Bird extends Animal{
    @Override
    public void sound(){
        System.out.println("Bird sound");
    }
}

class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Cat sound");
    }
}

public class Zad1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Cat cat = new Cat();

        animal.sound();
        bird.sound();
        cat.sound();
    }
}
