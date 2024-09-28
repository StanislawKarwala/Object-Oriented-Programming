package ObjectOrientedProgramming;

/*
Write a Java program to create a class called "Person" with a name and age attribute.
Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.
*/

class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void print(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Zad1 {
    public static void main(String[] args) {
        Person person = new Person("John", 25);
        Person person1 = new Person("Endriu", 56);

        person.print();
        person1.print();
    }
}
