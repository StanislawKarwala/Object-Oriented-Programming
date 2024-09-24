package JavaStaticMembers;

/*
Static Block for Complex Initialization
Write a Java program to create a class called "ComplexInitializer"
with a static block that initializes multiple static variables (x, y, z) using complex logic.
Print the values of these variables in the main method.
*/

public class Zad7 {
    private static int x;
    private static int y;
    private static int z;

    static{
        x = 100;
        y = 200;
        z = calculateZ(x, y);
    }

    private static int calculateZ(int a, int b){
        return a / b + a * b;
    }

    public static void main(String[] args) {
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        System.out.println("Z: " + z);
    }
}
