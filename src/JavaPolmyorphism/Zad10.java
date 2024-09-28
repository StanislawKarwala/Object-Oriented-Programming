package JavaPolmyorphism;

/*
Write a Java program to create a base class Animal with methods eat() and sound().
Create three subclasses: Lion, Tiger, and Panther. Override the eat() method in each subclass to describe what each animal eats.
In addition, override the sound() method to make a specific sound for each animal.
*/

class Animalll{
    public void eat(){
        System.out.println("Animal eats");
    }

    public void sound(){
        System.out.println("Animal is making a sound");
    }
}

class Lion extends Animalll{
    @Override
    public void eat(){
        System.out.println("Lion eats");
    }

    @Override
    public void sound(){
        System.out.println("Lion is making a sound");
    }
}

class Tiger extends Animalll{
    @Override
    public void eat(){
        System.out.println("Tiger eats");
    }

    @Override
    public void sound(){
        System.out.println("Tiger is making a sound");
    }
}

class Panther extends Animalll{
    @Override
    public void eat(){
        System.out.println("Panther eats");
    }

    @Override
    public void sound(){
        System.out.println("Panther is making a sound");
    }
}

public class Zad10 {
    public static void main(String[] args) {

    }
}
