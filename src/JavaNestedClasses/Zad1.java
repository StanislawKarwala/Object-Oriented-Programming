package JavaNestedClasses;

/*
Inner Class:
Write a Java program to create an outer class called  Computer with an inner class Processor.
The Processor class should have a method "displayDetails()" that prints the details of the processor (e.g., brand and speed).
Create an instance of Processor from the Computer class and call the "displayDetails()" method.
*/

public class Zad1 {
    class Processor{
        void displayDetails(){
            System.out.println("Processor: Intel");
            System.out.println("Speed: Fast");
        }
    }

    void showDetails(){
        Processor processor = new Processor();
        processor.displayDetails();
    }

    public static void main(String[] args) {
        Zad1 computer = new Zad1();
        computer.showDetails();
    }
}
