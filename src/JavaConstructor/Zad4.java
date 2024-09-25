package JavaConstructor;

/*
Chaining Constructors
Write a Java program to create a class called Student with instance variables studentId, studentName, and grade.
Implement a default constructor and a parameterized constructor that takes all three instance variables.
Use constructor chaining to initialize the variables. Print the values of the variables.
*/

public class Zad4 {
    private int studentId;
    private String studentName;
    private int grade;

    public Zad4(){
        this(0, "Null", 0);
    }

    public Zad4(int studentId, String studentName, int grade){
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }

    public static void main(String[] args) {
        Zad4 student = new Zad4();
        System.out.println("Student ID: " + student.studentId);
        System.out.println("Student name: " + student.studentName);
        System.out.println("Student grade: " + student.grade);

        Zad4 student1 = new Zad4(69, "Andrzej", 4);
        System.out.println("\nStudent 2 ID: " + student1.studentId);
        System.out.println("Student 2 name: " + student1.studentName);
        System.out.println("Student 2 grade: " + student1.grade);

    }
}
