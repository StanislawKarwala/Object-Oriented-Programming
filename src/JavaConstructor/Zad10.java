package JavaConstructor;

/*
Constructor for Singleton Pattern
Write a Java program to create a class called Singleton that ensures only one instance of the class can be created.
Implement a private constructor and a public static method to get the single instance of the class.
Print a message indicating the creation of the instance.
*/

public class Zad10 {
    private static Zad10 instance;

    private Zad10(){
        System.out.println("Singleton instance created");
    }

    public static Zad10 getInstance(){
        if(instance == null){
            instance = new Zad10();
        }
        return instance;
    }

    public static void main(String[] args) {
        Zad10 firstInstance = Zad10.getInstance();
        Zad10 secondInstance = Zad10.getInstance();

        if(firstInstance == secondInstance){
            System.out.println("Both are the same instances");
        }
    }
}
