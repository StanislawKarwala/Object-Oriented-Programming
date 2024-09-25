package JavaAbstractClasses;

/*
Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter().
Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area and perimeter of each shape.
*/

abstract class Shape{
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    @Override
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
    @Override
    public double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape{
    private double a;
    private double b;
    private double c;

    Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double calculatePerimeter(){
        return a + b + c;
    }
    @Override
    public double calculateArea(){
        double halfPerimeter = (a + b + c) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    }
}

public class Zad2 {
    public static void main(String[] args) {
        double r = 15;
        double side1 = 5;
        double side2 = 10;
        double side3 = 11;
        Circle circle = new Circle(r);
        System.out.println("Circle radius: " + r);
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle perimeter: " + circle.calculatePerimeter());

        Triangle triangle = new Triangle(side1, side2, side3);
        System.out.println("\nSides of the triangle: " + side1 + ", " + side2 + ", " + side3);
        System.out.println("Triangle area: " + triangle.calculateArea());
        System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());
    }
}
