package JavaAbstractClasses;

/*
Write a Java program to create an abstract class Person with abstract methods eat() and exercise().
Create subclasses Athlete and LazyPerson that extend the Person class and implement the respective methods to describe how each person eats and exercises.
*/

abstract class Person{
    public abstract void eat();
    public abstract void exercise();
}

class Athlete extends Person{
    @Override
    public void eat(){
        System.out.println("Athlete is eating healthy");
    }

    @Override
    public void exercise(){
        System.out.println("Athlete is exercising a lot");
    }
}

class LazyPerson extends Person{
    @Override
    public void eat(){
        System.out.println("Lazy person eats unhealthy");
    }

    @Override
    public void exercise(){
        System.out.println("Lazy person is not exercising a lot");
    }
}

public class Zad8 {
    public static void main(String[] args) {
        Person athlete = new Athlete();
        Person lazyPerson = new LazyPerson();

        athlete.eat();
        athlete.exercise();

        System.out.println();

        lazyPerson.eat();
        lazyPerson.exercise();
    }
}
