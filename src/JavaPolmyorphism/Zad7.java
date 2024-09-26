package JavaPolmyorphism;

/*
Write a Java program to create a base class Animal with methods move() and makeSound().
Create two subclasses Bird and Panthera. Override the move() method in each subclass to describe how each animal moves.
Also, override the makeSound() method in each subclass to make a specific sound for each animal.
*/

class Animall{
    public void move(){
        System.out.println("Animal moves");
    }

    public void makeSound(){
        System.out.println("Animal's sound");
    }
}

class Birdd extends Animall{
    @Override
    public void move(){
        System.out.println("Bird flies");
    }

    @Override
    public void makeSound(){
        System.out.println("Bird's sound");
    }
}

class Panthera extends Animall{
    @Override
    public void move(){
        System.out.println("Panthera runs");
    }

    @Override
    public void makeSound(){
        System.out.println("Panthera's sound");
    }
}

public class Zad7 {
    public static void performAction(Animall animal){
        animal.move();
        animal.makeSound();
    }

    public static void main(String[] args) {
        Animall bird = new Birdd();
        Animall panthera = new Panthera();

        performAction(bird);
        performAction(panthera);
    }
}
