package ObjectOrientedProgramming;

/*
Write a Java program to create a class called "Student" with a name, grade, and courses attributes, and methods to add and remove courses.
*/

import java.util.ArrayList;
import java.util.List;

class Student{
    private String name;
    private int grade;
    private List<String> courses;

    public Student(String name, int grade){
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public List<String> getCourses(){
        return courses;
    }

    public void addCourse(String course){
        courses.add(course);
    }

    public void removeCourse(String course){
        courses.remove(course);
    }

    public void getInfo(){
        System.out.println("\nStudent's name: " + name);
        System.out.println("Student's grade: " + grade);
        System.out.println("Student's courses: " + courses);
    }
}


public class Zad10 {
    public static void main(String[] args) {
        Student student = new Student("John", 4);
        Student student1 = new Student("Adnriejev", 2);
        student.addCourse("Math");
        student.addCourse("Physics");
        student.addCourse("Geography");
        student.getInfo();
        student.removeCourse("Math");
        System.out.println("Courses after deleting Math course: " + student.getCourses());

        student1.addCourse("PE");
        student1.getInfo();
    }
}
