package JavaPolmyorphism;

/*
Write a Java program to create a class Employee with a method called calculateSalary().
Create two subclasses Manager and Programmer.
In each subclass, override the calculateSalary() method to calculate and return the salary based on their specific roles.
*/

class Employee{
    public String name;
    public String role;

    public Employee(String name, String role){
        this.name = name;
        this.role = role;
    }

    public String getName(){
        return name;
    }

    public String getRole(){
        return role;
    }

    public double calculateSalary(){
       return 0.0;
    }
}

class Manager extends Employee{
    private double baseSalary;
    private double bonus;

    public Manager(String name, double baseSalary, double bonus){
        super(name, "Manager");
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary(){
        return baseSalary + bonus;
    }
}

class Programmer extends Employee{
    private double baseSalary;
    private double overtimePay;

    public Programmer(String name, double baseSalary, double overtimePay){
        super(name, "Programmer");
        this.baseSalary = baseSalary;
        this.overtimePay = overtimePay;
    }

    @Override
    public double calculateSalary(){
        return baseSalary + overtimePay;
    }
}


public class Zad4 {
    public static void main(String[] args) {
        Manager manager = new Manager("John", 5000, 1000);
        Programmer programmer = new Programmer("Adnriu", 6000, 500);

        System.out.println("Name: " + manager.getName());
        System.out.println("Role: " + manager.getRole());
        System.out.println("Salary: " + manager.calculateSalary());

        System.out.println("\nName: " + programmer.getName());
        System.out.println("Role: " + programmer.getRole());
        System.out.println("Salary: " + programmer.calculateSalary());
    }
}
