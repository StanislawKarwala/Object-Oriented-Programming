package JavaStaticMembers;

/*
Static Final Variables
Write a Java program to create a class called Constants with a static final variable 'PI' initialized to 3.14159.
Create a method to calculate the area of a circle given its radius, using the 'PI' constant.
Demonstrate the method in the main method.
*/

public class Zad4 {
    private final static double PI = 3.14159;

    public static double circleArea(double PI, double radius){
        return PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        double radius = 10;

        System.out.println("Radius: " + radius);
        System.out.println("Area: " + circleArea(PI, radius));
    }
}
