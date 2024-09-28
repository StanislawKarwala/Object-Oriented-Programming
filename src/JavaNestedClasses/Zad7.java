package JavaNestedClasses;

/*
Local Class Accessing Local Variables:
Write a Java program to create a class called House with a method calculateArea().
Inside this method, define a local class Room with a method getArea() that calculates and returns the calculateArea of the room (length * width).
Instantiate the Room class and call the getArea() method from within calculateArea().
*/

public class Zad7 {
    public void calculateArea(){
        double length = 15.25;
        double width = 10.50;

        class Room{
            public double getArea(){
                return length * width;
            }
        }
        Room room = new Room();
        double area = room.getArea();
        System.out.println("Area of the room: " + area);
    }

    public static void main(String[] args) {
        Zad7 room = new Zad7();
        room.calculateArea();
    }
}
