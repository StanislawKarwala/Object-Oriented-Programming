package JavaConstructor;

/*
Default Constructor:
Write a Java program to create a class called "Cat" with instance variables name and age.
Implement a default constructor that initializes the name to "Unknown" and the age to 0. Print the values of the variables.
*/

public class Zad1 {
    private String name;
    private int age;

    public Zad1() {
        this.name = "Unknown";
        this.age = 10;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        Zad1 cat = new Zad1();
        System.out.println("Cat name: " + cat.name);
        System.out.println("Cat age: " + cat.age);
    }
}


