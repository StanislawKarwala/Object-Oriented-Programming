package JavaPolmyorphism;

/*
Write a Java program to create a base class Shape with methods draw() and calculateArea().
Create three subclasses: Circle, Square, and Triangle.
Override the draw() method in each subclass to draw the respective shape, and override the calculateArea() method to calculate and return the area of each shape.
*/

class Shapeee{
    public void draw(){
        System.out.println("Drawing Shape");
    }

    public double calculateArea(){
        return 0.0;
    }
}

class Circleee extends Shapeee{
    private double radius;

    public Circleee(double radius){
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
        return Math.PI * Math.pow(radius, 2);
    }
}

class Square extends Shapeee{
    private double side;

    public Square(double side){
        this.side = side;
    }

    public double getSide(){
        return side;
    }

    @Override
    public void draw(){
        System.out.println("Drawing square");
    }

    @Override
    public double calculateArea(){
        return side * side;
    }
}

class Triangleee extends Shapeee{
    private double side1;
    private double side2;
    private double side3;

    public Triangleee(double side1, double side2, double side3){
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
    public void draw(){
        System.out.println("Drawing triangle");
    }

    @Override
    public double calculateArea(){
        double halfPerimeter = (side1 + side2 + side3) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
    }
}

public class Zad8 {
    public static void main(String[] args) {
        Circleee circle = new Circleee(5);
        Square square = new Square(4);
        Triangleee triangle = new Triangleee(2, 3, 4);

        System.out.println("Circle radius: " + circle.getRadius());
        circle.draw();
        System.out.println("Circle area: " + circle.calculateArea());

        System.out.println("\nSquare side: " + square.getSide());
        square.draw();
        System.out.println("Square area: " + square.calculateArea());

        System.out.println("\nTriangle sides: " + triangle.getSide1() + ", " + triangle.getSide2() + ", " + triangle.getSide3());
        triangle.draw();
        System.out.println("Triangle area: " + triangle.calculateArea());
    }
}
