package JavaInheritance;

/*
Write a Java program to create a class called Shape with a method called getArea().
Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.
*/

class Shape{
    double getArea(){
        return 0.0;
    }
}

class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea(){
        return length * width;
    }
}

public class Zad3 {
    public static void main(String[] args) {
        int length = 15;
        int width = 20;
        Rectangle rect = new Rectangle(length, width);

        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Rectangle area: " + rect.getArea());
    }
}
