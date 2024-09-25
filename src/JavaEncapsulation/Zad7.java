package JavaEncapsulation;

/*
Write a Java program to create a class called Student with private instance variables student_id, student_name, and grades.
Provide public getter and setter methods to access and modify the student_id and student_name variables.
However, provide a method called addGrade() that allows adding a grade to the grades variable while performing additional validation.
*/

import java.util.ArrayList;
import java.util.List;

class Student{
    private int studentId;
    private String studentName;
    private List<Double> grades;

    public Student() {
        this.grades = new ArrayList<>();
    }

    public int getStudentId(){
        return studentId;
    }

    public void setStudentId(int studentId){
        this.studentId = studentId;
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    public List<Double> getGrades(){
        return grades;
    }

    public void addGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        } else {
            System.out.println("Invalid grade. Please enter a value between 0 and 100.");
        }
    }
}

public class Zad7 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentId(1);
        student.setStudentName("John Doe");

        student.addGrade(95);
        student.addGrade(102);

        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Grades: " + student.getGrades());
    }
}
