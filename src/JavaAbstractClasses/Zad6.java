package JavaAbstractClasses;

/*
Write a Java program to create an abstract class Shape3D with abstract methods calculateVolume() and calculateSurfaceArea().
Create subclasses Sphere and Cube that extend the Shape3D class and implement the respective methods to calculate the volume and surface area of each shape.
*/

abstract class Shape3D{

    public abstract double calculateVolume();
    public abstract double calculateSurfaceArea();
}

class Sphere extends Shape3D{
    private double radius;

    public Sphere(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    @Override
    public double calculateVolume(){
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double calculateSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }
}

class Cube extends Shape3D{
    private double side;

    public Cube(double side){
        this.side = side;
    }

    public double getSide(){
        return side;
    }

    @Override
    public double calculateVolume(){
        return side * side * side;
    }

    @Override
    public double calculateSurfaceArea(){
        return 6 * side * side;
    }
}

public class Zad6 {
    public static void main(String[] args) {
        double a = 10;
        double radius = 9;

        Shape3D cube = new Cube(a);
        System.out.println("Cube side: " + a);
        System.out.println("Cube volume: " + cube.calculateVolume());
        System.out.println("Cube surface area: " + cube.calculateSurfaceArea());

        Shape3D sphere = new Sphere(radius);
        System.out.println("\nSphere radius: " + radius);
        System.out.println("Sphere volume: " + sphere.calculateVolume());
        System.out.println("Sphere surface area: " + sphere.calculateSurfaceArea());
    }
}
