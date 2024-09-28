package ObjectOrientedProgramming;

/*
Write a Java program to create a class called "Dog" with a name and breed attribute.
Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.
*/

class Dog{
    private String name;
    private String breed;

    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }
    public void print(){
        System.out.println("\nDog's name: " + name);
        System.out.println("Dog's breed: " + breed);
    }
}

public class Zad2 {
    public static void main(String[] args) {
        Dog dog = new Dog("Kongo", "Beagle");
        Dog dog1 = new Dog("Bongo", "German Shepherd");

        dog.setName("Daisy");
        dog.setBreed("Dalmatian");
        dog.print();

        dog1.setName("John");
        dog1.setBreed("Bloodhound");
        dog1.print();
    }
}
