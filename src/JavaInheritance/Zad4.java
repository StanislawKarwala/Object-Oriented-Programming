package JavaInheritance;

/*
Write a Java program to create a class called Employee with methods called work() and getSalary().
Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().
*/

class Employee{
    private int salary;

    public Employee(int salary){
        this.salary = salary;
    }

    public void work(){
        System.out.println("Employee work");
    }

    public int getSalary(){
        return salary;
    }
}

class HRManager extends Employee{
    public HRManager(int salary){
        super(salary);
    }

    @Override
    public void work(){
        System.out.println("\nHRManager work");
    }

    public void addEmployee(){
        System.out.println("Employe added");
    }
}

public class Zad4 {
    public static void main(String[] args) {
        Employee emp = new Employee(5000);
        emp.work();
        System.out.println("Salary: " + emp.getSalary());

        HRManager hr = new HRManager(6000);
        hr.work();
        System.out.println("Salary: " + hr.getSalary());
    }
}
