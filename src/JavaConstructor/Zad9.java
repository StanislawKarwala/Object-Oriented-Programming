package JavaConstructor;

/*
Constructor with Array Initialization
Write a Java program to create a class called Classroom with instance variables className and students (an array of strings).
Implement a parameterized constructor that initializes these variables. Print the values of the variables.
*/

public class Zad9 {
    private String className;
    private String[] students;

    public Zad9(String className, String[] students){
        this.className = className;
        this.students = students;
    }

    public void printClassroom(){
        System.out.println("Class name: " + className);
        System.out.println("Students: ");
        for(String students : students){
            System.out.println(students + " ");
        }
    }

    public static void main(String[] args) {
        String[] array = {"Andrzej", "Pawel", "Gawel"};
        Zad9 classroom = new Zad9("Class 10", array);
        classroom.printClassroom();
    }
}
