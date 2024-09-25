package JavaAbstractClasses;

/*
Write a Java program to create an abstract class GeometricShape with abstract methods area() and perimeter().
Create subclasses Triangle and Square that extend the GeometricShape class and implement the respective methods to calculate the area and perimeter of each shape.
*/

abstract class GeometricShape{
    public abstract double area();
    public abstract double perimeter();
}

class Trianglee extends GeometricShape{
    private double side1;
    private double side2;
    private double side3;

    public Trianglee(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double area(){
        double halfPerimeter = (side1 + side2 + side3) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
    }

    @Override
    public double perimeter(){
        return side1 + side2 + side3;
    }
}

class Square extends GeometricShape{
    private double side;

    public Square(double side){
        this.side = side;
    }

    @Override
    public double area(){
        return side * side;
    }

    @Override
    public double perimeter(){
        return 4 * side;
    }
}

public class Zad12 {
    public static void main(String[] args) {
        GeometricShape triangle = new Trianglee(3, 4, 5);
        GeometricShape square = new Square(2);

        System.out.println("Triangle Area: " + triangle.area());
        System.out.println("Triangle Perimeter: " + triangle.perimeter());
        System.out.println("\nSquare Area: " + square.area());
        System.out.println("Square Perimeter: " + square.perimeter());
    }
}
