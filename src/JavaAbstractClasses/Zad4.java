package JavaAbstractClasses;

/*
Write a Java program to create an abstract class Animal with abstract methods eat() and sleep().
Create subclasses Lion, Tiger, and Deer that extend the Animal class and implement the eat() and sleep() methods differently based on their specific behavior.
*/

abstract class Animall{
    public abstract void eat();
    public abstract void sleep();
}

class Lionn extends Animall{
    @Override
    public void eat(){
        System.out.println("Lion eats");
    }

    @Override
    public void sleep(){
        System.out.println("Lion sleeps");
    }
}

class Tigerr extends Animall{
    @Override
    public void eat(){
        System.out.println("Tiger eats");
    }

    @Override
    public void sleep(){
        System.out.println("Tiger sleeps");
    }
}

class Deer extends Animall{
    @Override
    public void eat(){
        System.out.println("Deer eats");
    }

    @Override
    public void sleep(){
        System.out.println("Deer sleeps");
    }
}

public class Zad4 {
    public static void main(String[] args) {
        Lionn lion = new Lionn();
        lion.eat();
        lion.sleep();

        Tigerr tiger = new Tigerr();
        tiger.eat();
        tiger.sleep();

        Deer deer = new Deer();
        deer.eat();
        deer.sleep();
    }
}
