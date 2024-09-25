package JavaInterface;

/*
Write a Java program to create an interface Shape with the getArea() method.
Create three classes Rectangle, Circle, and Triangle that implement the Shape interface.
Implement the getArea() method for each of the three classes.
*/

import org.w3c.dom.css.Rect;

interface Shape{
    double getArea();
}

class Rectangle implements Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea(){
        return length * width;
    }
}

class Circle implements Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
}

class Triangle implements Shape{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea(){
        double halfPerimeter = (side1 + side2 + side3) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
    }
}

public class Zad1 {
    public static void main(String[] args) {
        double length = 15;
        double width = 3.5;
        double a = 4.3;
        double b = 2.3;
        double c = 5;

        Rectangle rectangle = new Rectangle(length, width);
        Triangle triangle = new Triangle(a, b, c);

        System.out.println("Rectangle length: " + length + " and width: " + width);
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("\nTriangle sides: " + a + ", " + b + ", " + c);
        System.out.println("Triangle area: " + triangle.getArea());
    }
}
