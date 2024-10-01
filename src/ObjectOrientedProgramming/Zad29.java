package ObjectOrientedProgramming;

/*
Write a Java program to create a class called "Pet" with attributes for name, species, and age.
Create subclasses "Dog" and "Bird" that add specific attributes like favorite toy for dogs and wing span for birds.
Implement methods to display pet details and calculate the pet's age in human years.
*/

class Pet{
    private String name;
    private String spieces;
    private int age;

    public Pet(String name, String spieces, int age){
        this.name = name;
        this.spieces = spieces;
        this.age = age;
    }

    public void petDetails(){
        System.out.println("Name: " + name);
        System.out.println("Spieces: " + spieces);
        System.out.println("Age: " + age);
    }

    public double petAge(){
        return age;
    }
}

class Dogg extends Pet{
    private String favoriteToy;

    public Dogg(String name, int age, String favoriteToy){
        super(name, "Dog", age);
        this.favoriteToy = favoriteToy;
    }

    @Override
    public void petDetails(){
        super.petDetails();
        System.out.println("Favorite toy: " + favoriteToy);
    }

    @Override
    public double petAge(){
        if(super.petAge() == 1){
            return 15;
        } else if(super.petAge() == 2){
            return 15 + 9;
        } else{
            return 15 + 9 + (super.petAge() - 2) * 5;
        }
    }
}

class Bird extends Pet{
    private double wingSpan;

    public Bird(String name, int age, double wingSpan){
        super(name, "Bird", age);
        this.wingSpan = wingSpan;
    }

    @Override
    public void petDetails(){
        super.petDetails();
        System.out.println("Wing span: " + wingSpan);
    }

    @Override
    public double petAge(){
        return super.petAge() * 5;
    }
}

public class Zad29 {
    public static void main(String[] args) {
        Dogg dog = new Dogg("Buddy", 3, "Ball");
        Bird bird = new Bird("Kiwi", 2, 0.5);

        System.out.println("Dog details:");
        dog.petDetails();
        System.out.println("Dog age in human years: " + dog.petAge());

        System.out.println("\nBird details:");
        bird.petDetails();
        System.out.println("Bird age in human years: " + bird.petAge());
    }
}
