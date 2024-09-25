package JavaInheritance;

/*
Write a Java program that creates a class hierarchy for employees of a company.
The base class should be Employee, with subclasses Manager, Developer, and Programmer.
Each subclass should have properties such as name, address, salary, and job title.
Implement methods for calculating bonuses, generating performance reports, and managing projects.
*/

class Employeeee{
    private String name;
    private String address;
    private double salary;
    private String jobTitle;

    public Employeeee(String name, String address, double salary, String jobTitle){
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public double getSalary(){
        return salary;
    }
    public String getJobTitle(){
        return jobTitle;
    }
    public double calculatingBonuses(){
        return getSalary() * 0.10;
    }
    public void performanceReports(){
        System.out.println(getName() + " is a good employee");
    }
    public void managingProjects(){
        System.out.println(getName() + " is not managing any projects at this moment");
    }
}

class Manager extends Employeeee{
    private int numberOfSubordinates;

    public Manager(String name, String address, double salary, String jobTitle, int numberOfSubordinates){
        super(name, address, salary, jobTitle);
        this.numberOfSubordinates = numberOfSubordinates;
    }
    public int getNumberOfSubordinates(){
        return numberOfSubordinates;
    }
    @Override
    public double calculatingBonuses(){
        return getSalary() * 0.15;
    }
    @Override
    public void performanceReports(){
        System.out.println(getName() + " is a good employee and is managing " + getNumberOfSubordinates() + " employees");
    }
    @Override
    public void managingProjects(){
        System.out.println(getName() + " is managing IT project at this moment");
    }
}

class Developer extends Employeeee{
    private String programmingLanguage;

    public Developer(String name, String address, double salary, String jobTitle, String programmingLanguage){
        super(name, address, salary, jobTitle);
        this.programmingLanguage = programmingLanguage;
    }
    public String getProgrammingLanguage(){
        return programmingLanguage;
    }
    @Override
    public double calculatingBonuses(){
        return getSalary() * 0.20;
    }
    public void writeCode(){
        System.out.println(getName() + " is programming in " + getProgrammingLanguage() + " language");
    }
    @Override
    public void managingProjects(){
        System.out.println(getName() + " is managing " + getProgrammingLanguage() + " project at this moment");
    }
}

class Programmer extends Developer{
    public Programmer(String name, String address, double salary, String programmingLanguage){
        super(name, address, salary, "Programmer", programmingLanguage);
    }
    @Override
    public double calculatingBonuses(){
        return getSalary() * 0.25;
    }
    @Override
    public void performanceReports(){
        System.out.println("Performance report for Programmer " + getName() + ": Excellent");
    }
    public void debugCode() {
        // Printing a message indicating the programmer is debugging code
        System.out.println("Programmer " + getName() + " is debugging code in " + getProgrammingLanguage());
    }
}

public class Zad10 {
    public static void main(String[] args) {
        Manager manager = new Manager("Avril Aroldo", "1 ABC St", 80000.0, "Manager", 5);
        Developer developer = new Developer("Iver Dipali", "2 PQR St", 72000.0, "Developer", "Java");
        Programmer programmer = new Programmer("Yaron Gabriel", "3 ABC St", 76000.0, "Python");

        System.out.println("Manager's Bonus: $" + manager.calculatingBonuses());
        System.out.println("Developer's Bonus: $" + developer.calculatingBonuses());
        System.out.println("Programmer's Bonus: $" + programmer.calculatingBonuses());

        manager.performanceReports();
        developer.performanceReports();
        programmer.performanceReports();

        manager.managingProjects();
        developer.writeCode();
        programmer.debugCode();
    }
}
