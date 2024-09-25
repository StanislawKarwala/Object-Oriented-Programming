package JavaAbstractClasses;

/*
Write a Java program to create an abstract class Employee with abstract methods calculateSalary() and displayInfo().
Create subclasses Manager and Programmer that extend the Employee class and implement the respective methods to calculate salary and display information for each role.
*/

abstract class Employee{
    private String name;
    private double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public abstract double calculateSalary();
    public abstract void displayInfo();
}

class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, double bonus){
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary(){
        return getSalary() + bonus;
    }

    @Override
    public void displayInfo(){
        System.out.println("Manager Name: " + getName());
        System.out.println("Base Salary: $" + getSalary());
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Salary: $" + calculateSalary());
    }
}

class Programmer extends Employee{
    private double bonus;

    public Programmer(String name, double salary, double bonus){
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary(){
        return getSalary() + bonus;
    }

    @Override
    public void displayInfo(){
        System.out.println("\nProgrammer Name: " + getName());
        System.out.println("Base Salary: $" + getSalary());
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Salary: $" + calculateSalary());
    }
}

public class Zad5 {
    public static void main(String[] args) {
        Manager manager = new Manager("Andrzej", 5000, 300);
        manager.displayInfo();

        Programmer programmer = new Programmer("John", 6000, 1000);
        programmer.displayInfo();
    }
}
