package JavaEncapsulation;

/*
Write a Java program to create a class called Person with private instance variables name, age. and country.
Provide public getter and setter methods to access and modify these variables.
*/

class Person{
    private String name;
    private int age;
    private String country;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getCountry(){
        return country;
    }

    public void setCountry(String country){
        this.country = country;
    }
}

public class Zad1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setCountry("Krakow");
        person.setAge(15);
        person.setName("Stanley");

        System.out.println("Name: " + person.getName());
        System.out.println("Country: " + person.getCountry());
        System.out.println("Age: " + person.getAge());

    }
}
