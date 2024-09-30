package ObjectOrientedProgramming;

/*
Write a Java program to create a class called "School" with attributes for students, teachers,
and schoolClasses, and methods to add and remove students and teachers, and to create schoolClasses.
*/

import java.util.ArrayList;
import java.util.List;

class School{
    private List<Studentt> students;
    private List<Teacher> teachers;
    private List<SchoolClass> schoolClasses;

    public School() {
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.schoolClasses = new ArrayList<>();
    }

    public void addStudent(Studentt student){
        students.add(student);
    }

    public void removeStudent(Studentt student){
        students.remove(student);
    }

    public void addTeachers(Teacher teacher){
        teachers.add(teacher);
    }

    public void removeTeachers(Teacher teacher){
        teachers.remove(teacher);
    }

    public void addClasses(SchoolClass clas){
        schoolClasses.add(clas);
    }

    public void removeClasses(SchoolClass clas){
        schoolClasses.remove(clas);
    }

    public List<Studentt> getStudents(){
        return students;
    }

    public List<Teacher> getTeachers(){
        return teachers;
    }

    public List<SchoolClass> getClasses(){
        return schoolClasses;
    }
}

class Studentt{
    private String name;
    private String surname;
    private int age;

    public Studentt(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString(){
        return "\nStudent name: " + name + ", surname: " + surname + ", age: " + age;
    }
}

class Teacher{
    private String name;
    private String subject;

    public Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }

    public String getName(){
        return name;
    }

    public String getSubject(){
        return subject;
    }

    @Override
    public String toString(){
        return "\nTeacher name: " + name + ", subject: " + subject;
    }
}

class SchoolClass{
    private String className;
    private Teacher teacher;
    private List<Studentt> students;

    public SchoolClass(String className, Teacher teacher){
        this.className = className;
        this.teacher = teacher;
        this.students = new ArrayList<Studentt>();
    }

    public String getClassName(){
        return className;
    }

    public void setClassName(String className){
        this.className = className;
    }

    public Teacher getTeacher(){
        return teacher;
    }

    public void setTeacher(Teacher teacher){
        this.teacher = teacher;
    }

    public List<Studentt> getStudents(){
        return students;
    }

    public void addStudent(Studentt student){
        students.add(student);
    }

    public void removeStudent(Studentt student){
        students.remove(student);
    }
}

public class Zad14 {
    public static void main(String[] args) {
        School school = new School();
        Studentt student = new Studentt("John", "Wick", 20);
        Studentt student1 = new Studentt("Krystian", "Kolzoch", 18);
        Studentt student2 = new Studentt("Julia", "Pysno", 19);
        Teacher teacher = new Teacher("Amelia", "Physics");
        Teacher teacher1 = new Teacher("Pieter", "Math");
        SchoolClass mathClass = new SchoolClass("Math", teacher);
        SchoolClass physicsClass = new SchoolClass("Physics", teacher1);

        school.addStudent(student);
        school.addStudent(student1);
        school.addStudent(student2);

        school.addTeachers(teacher);
        school.addTeachers(teacher1);

        school.addClasses(mathClass);
        school.addClasses(physicsClass);

        mathClass.addStudent(student);
        physicsClass.addStudent(student1);
        physicsClass.addStudent(student2);

        System.out.println("School information:");
        System.out.println("Number of students: " + school.getStudents().size());
        System.out.println("Number of teachers: " + school.getTeachers().size());
        System.out.println("Number of classes: " + school.getClasses().size());

        System.out.println("\n"+ mathClass.getClassName() + " class information: ");
        System.out.println("Teacher's name: " + mathClass.getTeacher().getName());
        System.out.println("Number of students: " + mathClass.getStudents().size());

        System.out.println("\n"+ physicsClass.getClassName() + " class information: ");
        System.out.println("Teacher's name: " + physicsClass.getTeacher().getName());
        System.out.println("Number of students: " + physicsClass.getStudents().size());

        school.removeStudent(student);
        school.removeTeachers(teacher);

        System.out.println("\nSchool information after removing 1 teacher and 1 student:");
        System.out.println("Number of students: " + school.getStudents().size());
        System.out.println("Number of teachers: " + school.getTeachers().size());
        System.out.println("Number of classes: " + school.getClasses().size());

        System.out.println();
        System.out.println(school.getStudents());
        System.out.println(school.getTeachers());
    }
}
