package JavaInheritance;

/*
Write a Java program to create a class known as Person with methods called getFirstName() and getLastName().
Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() method to include the employee's job title.
*/

class Person{
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }
}

class Employeee extends Person{
    private int employeeId;
    private String jobTitle;

    public Employeee(String firstName, String lastName, int employeeId, String jobTitle){
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId(){
        return employeeId;
    }

    @Override
    public String getLastName(){
        return super.getLastName() + ", Job: " + jobTitle;
    }
}

public class Zad7 {
    public static void main(String[] args) {
        Employeee employee1 = new Employeee("Adam", "Priot", 987, "Clueless");
        System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + ", EmployeeId: (" + employee1.getEmployeeId() + ")");

        Employeee employee2 = new Employeee("Andriej", "Lavinsky", 123, "Cleaner");
        System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + ", EmployeeId: (" + employee2.getEmployeeId() + ")");

    }
}
