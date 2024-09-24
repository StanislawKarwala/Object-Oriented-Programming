package JavaConstructor;

/*
Overloading Constructors with Different Data Types
Write a Java program to create a class called Point with instance variables x and y. Implement overloaded constructors:

One constructor takes int parameters.
Another constructor takes double parameters.
Print the values of the variables for each constructor.
*/

public class Zad8 {
    private int x;
    private int y;

    public Zad8(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Zad8(double x, double y){
        this.x = (int) x;
        this.y = (int) y;
    }

    public static void main(String[] args) {
        Zad8 point = new Zad8(5, 20);
        System.out.println("Point 1 x: " + point.x);
        System.out.println("Point 1 y: " + point.y);

        Zad8 point1 = new Zad8(6.23, 9.56);
        System.out.println("\nPoint 2 x: " + point1.x);
        System.out.println("Point 2 y: " + point1.y);
    }
}
