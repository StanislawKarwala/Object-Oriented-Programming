package ObjectOrientedProgramming;

/*
Write a Java program to create a class called "Shape" with abstract methods for calculating area and perimeter, and subclasses for "Rectangle", "Circle", and "Triangle".
*/

abstract class Shape{
     public abstract double calculateArea();
     public abstract double calculatePerimeter();
}

class Rectanglee extends Shape{
    private double length;
    private double width;

    public Rectanglee(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    @Override
    public double calculateArea(){
        return length * width;
    }

    @Override
    public double calculatePerimeter(){
        return 2 * length + 2 * width;
    }
}

class Circlee extends Shape{
    private double radius;

    public Circlee(double radius){
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
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1(){
        return side1;
    }

    public double getSide2(){
        return side2;
    }

    public double getSide3(){
        return side3;
    }

    @Override
    public double calculateArea(){
        double halfPerimeter = (side1 + side2 + side3) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
    }

    @Override
    public double calculatePerimeter(){
        return side1 + side2 + side3;
    }
}

public class Zad16 {
    public static void main(String[] args) {
        Rectanglee rect = new Rectanglee(10, 15);
        Circlee circle = new Circlee(4);
        Triangle triangle = new Triangle(2, 6, 5);

        System.out.println("Rectangle length: " + rect.getLength() + ", width: " + rect.getWidth());
        System.out.println("Rectangle area: " + rect.calculateArea());
        System.out.println("Rectangle perimeter: " + rect.calculatePerimeter());

        System.out.println("\nCircle radius: " + circle.getRadius());
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle perimeter: " + circle.calculatePerimeter());

        System.out.println("\nTriangle sides: " + triangle.getSide1() + ", " + triangle.getSide2() + ", " + triangle.getSide3());
        System.out.println("Triangle area: " + triangle.calculateArea());
        System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());
    }
}
