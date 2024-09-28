package ObjectOrientedProgramming;

/*
Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary.
*/

class Employee{
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary){
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public void raiseSalaryByAmount(double amount){
        salary += amount;
    }

    public void raiseSalaryByPercent(double percent){
        salary = salary + salary * percent / 100;
    }

    public void print(){
        System.out.println("Employee name: " + name);
        System.out.println("Employee jobTitle: " + jobTitle);
        System.out.println("Employee salary: " + salary);
    }
}

public class Zad6 {
    public static void main(String[] args) {
        double percent = 20;
        Employee emp = new Employee("John", "Programmer", 6000);
        emp.print();

        emp.raiseSalaryByPercent(percent);
        System.out.println("\nRaising salary by " + percent + "%");
        System.out.println("New salary: " + emp.getSalary());
    }
}
