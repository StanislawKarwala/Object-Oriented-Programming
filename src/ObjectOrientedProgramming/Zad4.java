package ObjectOrientedProgramming;

/*
Write a Java program to create a class called "Circle" with a radius attribute.
You can access and modify this attribute. Calculate the area and circumference of the circle.
*/

class Circle{
    private double radius;

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculateCircumference(){
        double diameter = 2 * radius;
        return diameter * Math.PI;
    }
}

public class Zad4 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5);

        System.out.println("Circle radius: " + circle.getRadius());
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle circumference: " + circle.calculateCircumference());
    }
}
