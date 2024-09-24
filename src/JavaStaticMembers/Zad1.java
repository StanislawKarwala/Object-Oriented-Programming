package JavaStaticMembers;

/*
Static Variables:
Write a Java program to create a class called "Counter" with a static variable count.
Implement a constructor that increments count every time an object is created.
Print the value of count after creating several objects.
*/

public class Zad1 {
    private static int count = 0;

    public Zad1(){
        count++;
    }
    public static int getCount(){
        return count;
    }

    public static void main(String[] args) {
        Zad1 count = new Zad1();
        Zad1 count1 = new Zad1();
        Zad1 count2 = new Zad1();
        Zad1 count3 = new Zad1();

        System.out.println("Count: " + getCount());
    }
}
