package ObjectOrientedProgramming;

/*
Write a Java program to create a class called "Employee" with a name, salary, and hire date attributes, and a method to calculate years of service.
*/

import java.time.LocalDate;
import java.time.Period;

class Employeee{
    private String name;
    private double salary;
    private LocalDate hire;

    public Employeee(String name, double salary, LocalDate hire){
        this.name = name;
        this.salary = salary;
        this.hire = hire;
    }

    public int calculateYearsOfService(){
        LocalDate currentDate = LocalDate.now();
        return Period.between(hire, currentDate).getYears();
    }

    public LocalDate getHire(){
        return hire;
    }
}

public class Zad9 {
    public static void main(String[] args) {
        LocalDate hireDate = LocalDate.of(2000,2,23);
        Employeee emp = new Employeee("John", 5000, hireDate);

        System.out.println("Hired: " + emp.getHire());
        System.out.println("Today's date: " + LocalDate.now());
        System.out.println("Years of service: " + emp.calculateYearsOfService());
    }
}
