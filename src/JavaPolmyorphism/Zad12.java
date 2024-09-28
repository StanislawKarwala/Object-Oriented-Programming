package JavaPolmyorphism;

/*
Write a Java program to create a base class Shape with methods draw() and calculateArea().
Create two subclasses Circle and Cylinder.
Override the draw() method in each subclass to draw the respective shape.
In addition, override the calculateArea() method in the Cylinder subclass to calculate and return the total surface area of the cylinder.
*/

abstract class Shapeeee{
    public abstract void draw();
    public abstract double calculateArea();
}

class Circleeee extends Shapeeee{
    private double radius;

    public Circleeee(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    @Override
    public void draw(){
        System.out.println("Drawing circle");
    }

    @Override
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Shapeeee{
    private double radius;
    private double height;

    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    public double getRadius(){
        return radius;
    }

    public double getHeight(){
        return height;
    }

    @Override
    public void draw(){
        System.out.println("Drawing cylinder");
    }

    @Override
    public double calculateArea(){
        return (2 * Math.PI * Math.pow(radius, 2)) + (2 * Math.PI * radius * height);
    }
}

public class Zad12 {
    public static void main(String[] args) {
        Circleeee circle = new Circleeee(5);
        Cylinder cylinder = new Cylinder(5, 10);

        draw(circle);
        System.out.println("Circle radius: " + circle.getRadius());
        System.out.println("Circle area: " + circle.calculateArea());

        draw(cylinder);
        System.out.println("\nCylinder radius: " + cylinder.getRadius());
        System.out.println("Cylinder height: " + cylinder.getHeight());
        System.out.println("Cylinder area: " + cylinder.calculateArea());
    }

    public static void draw(Shapeeee shape){
        shape.draw();
    }
}
