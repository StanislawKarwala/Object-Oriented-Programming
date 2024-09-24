package JavaNestedClasses;

/*
Static Nested Class:
Write a Java program to create an outer class called University with a static nested class Department.
The Department class should have a method "displayInfo()" that prints the department name and the number of faculty members.
Instantiate the Department class from the main method and call the "displayInfo()" method
*/

public class Zad2 {
    static class Department{
        private String departmentName;
        private int facultyMembers;

        public Department(String departmentName, int facultyMembers){
            this.departmentName = departmentName;
            this.facultyMembers = facultyMembers;
        }

        public void displayInfo(){
            System.out.println("Department: " + departmentName);
            System.out.println(facultyMembers + " members");
        }
    }
    public static void main(String[] args) {
        Department department = new Department("IT", 20);
        department.displayInfo();
    }
}
