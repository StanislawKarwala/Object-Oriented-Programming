package JavaEncapsulation;

/*
Write a Java program to create a class called Employee with private instance variables employee_id, employee_name, and employee_salary.
Provide public getter and setter methods to access and modify the id and name variables, but provide a getter method for the salary variable that returns a formatted string.
*/

class Employee{
    private int employeeId;
    private String employeeName;
    private double employeeSalary;

    public int getEmployeeId(){
        return employeeId;
    }

    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }

    public String getEmployeeName(){
        return employeeName;
    }

    public void setEmployeeName(String employee_name){
        this.employeeName = employee_name;
    }

    public double getEmployeeSalary(){
        return employeeSalary;
    }

    public void setEmployeeSalary(double employee_salary){
        this.employeeSalary = employee_salary;
    }

    public String getFormattedSalary(){
        return String.format("$%.2f", employeeSalary);
    }
}

public class Zad4 {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setEmployeeId(69);
        employee.setEmployeeName("John Doe");
        employee.setEmployeeSalary(5500.25);

        System.out.println("Employee Details:");
        System.out.println("ID: " + employee.getEmployeeId());
        System.out.println("Name: " + employee.getEmployeeName());
        System.out.println("Salary: " + employee.getFormattedSalary());
    }
}
