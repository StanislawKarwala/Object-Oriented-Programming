package JavaInheritance;

/*
Write a Java program to create a class called Shape with methods called getPerimeter() and getArea().
Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate the area and perimeter of a circle.
*/

class Shapee{
    public double getPerimeter(){
        return 0.0;
    }
    public double getArea(){
        return 0.0;
    }
}

class Circle extends Shapee{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    @Override
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
}

public class Zad8 {
    public static void main(String[] args) {
        double r = 5.0;
        Circle circ = new Circle(r);
        System.out.println("Radius: " + r);
        System.out.println("Area of circle: " + circ.getArea());
        System.out.println("Perimeter of circle: " + circ.getPerimeter());
    }
}
