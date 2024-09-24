package JavaStaticMembers;

/*
Static Method with Static Variable
Write a Java program to create a class called "IDGenerator" with a static variable 'nextID'
and a static method "generateID()" that returns the next ID and increments 'nextID'.
Demonstrate the usage of generateID in the main method.
*/

public class Zad6 {
    private static int nextId = 1;

    public static int generateID(){
        return nextId++;
    }

    public static void main(String[] args) {
        System.out.println("Generated ID: " + generateID());
        System.out.println("Generated ID: " + generateID());
        System.out.println("Generated ID: " + generateID());
        System.out.println("Generated ID: " + generateID());
    }
}
