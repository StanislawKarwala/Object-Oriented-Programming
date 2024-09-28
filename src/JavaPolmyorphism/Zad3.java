package JavaPolmyorphism;

/*
Write a Java program to create a base class Shape with a method called calculateArea().
Create three subclasses: Circle, Rectangle, and Triangle.
Override the calculateArea() method in each subclass to calculate and return the shape's area.
*/

class Shape{
    public double calculateArea(){
        return 0;
    }
}

class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateArea(){
        return width * length;
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

    @Override
    public double calculateArea(){
        double halfPerimeter = (side1 + side2 + side3) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
    }
}

public class Zad3 {
    public static void main(String[] args) {
        double radius = 5;
        double width = 2;
        double length = 3;
        double side1 = 2.5;
        double side2 = 5;
        double side3 = 3;

        Circle circle = new Circle(radius);
        Rectangle rectangle = new Rectangle(width, length);
        Triangle triangle = new Triangle(side1, side2, side3);

        System.out.println("Circle radius: " + radius);
        System.out.println("Circle area: " + circle.calculateArea());

        System.out.println("\nRectangle width: " + width + ", length: " + length);
        System.out.println("Rectangle area: " + rectangle.calculateArea());

        System.out.println("\nTriangle sides: " + side1 + ", " + side2 + ", " + side3);
        System.out.println("Triangle area: " + triangle.calculateArea());
    }
}
