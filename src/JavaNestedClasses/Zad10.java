package JavaNestedClasses;

/*
Static Nested Class and Non-static Methods:
Write a Java program to create an outer class called School with a static nested class Student.
The Student class should have a non-static method displayStudentInfo() that prints the student's name and grade.
Instantiate the Student class from the main method and call the displayStudentInfo() method.
*/

public class Zad10 {
    static class Student{
        String name;
        int grade;

        Student(String name, int grade){
            this.name = name;
            this.grade = grade;
        }

        void displayStudentInfo(){
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }

    public static void main(String[] args) {
        Student student = new Student("Stanley", 3);
        student.displayStudentInfo();
    }
}
