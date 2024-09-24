package JavaConstructor;

/*
Parameterized Constructor:
Write a Java program to create a class called Dog with instance variables name and color.
Implement a parameterized constructor that takes name and color as parameters and initializes the instance variables.
Print the values of the variables.
*/

public class Zad2 {
    private String name;
    private String color;

    public Zad2(String name, String color){
        this.name = name;
        this.color = color;
    }

    public static void main(String[] args) {
        Zad2 dog = new Zad2("Azor", "Black");
        System.out.println("Dog name: " + dog.name);
        System.out.println("Dog color: " + dog.color);
    }
}
