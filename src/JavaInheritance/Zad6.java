package JavaInheritance;

/*
Write a Java program to create a class called Animal with a method named move().
Create a subclass called Cheetah that overrides the move() method to run.
*/

class Animall{
    void move(){
        System.out.println("Animal moving");
    }
}

class Cheetah extends Animall{
    @Override
    void move(){
        System.out.println("Cheetah running");
    }
}

public class Zad6 {
    public static void main(String[] args) {
        Animall animal = new Animall();
        animal.move();

        Cheetah cheetah = new Cheetah();
        cheetah.move();
    }
}
