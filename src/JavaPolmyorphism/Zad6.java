package JavaPolmyorphism;

/*
Write a Java program to create a class Shape with methods getArea() and getPerimeter().
Create three subclasses: Circle, Rectangle, and Triangle.
Override the getArea() and getPerimeter() methods in each subclass to calculate and return the area and perimeter of the respective shapes.
*/

class Shapee{
    public double getArea(){
        return 0.0;
    }

    public double getPerimeter(){
        return 0.0;
    }
}

class Circlee extends Shapee{
    private double radius;

    public Circlee(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    @Override
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
}

class Rectanglee extends Shapee{
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
    public double getArea(){
        return width * length;
    }

    @Override
    public double getPerimeter(){
        return width + width + length + length;
    }
}

class Trianglee extends Shapee{
    private double side1;
    private double side2;
    private double side3;

    public Trianglee(double side1, double side2, double side3){
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
    public double getArea(){
        double halfPerimeter = (side1 + side2 + side3) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
    }

    @Override
    public double getPerimeter(){
        return side1 + side2 + side3;
    }
}

public class Zad6 {
    public static void main(String[] args) {
        Circlee crc = new Circlee(5);
        Rectanglee rct = new Rectanglee(4, 5);
        Trianglee trg = new Trianglee(5, 10, 14);

        System.out.println("Circle radius: " + crc.getRadius());
        System.out.println("Circle area: " + crc.getArea());
        System.out.println("Circle perimeter: " + crc.getPerimeter());

        System.out.println("\nRectangle length: " + rct.getLength() + ", and width: " + rct.getWidth());
        System.out.println("Rectangle area: " + rct.getArea());
        System.out.println("Rectangle perimeter: " + rct.getPerimeter());

        System.out.println("\nTriangle sides: " + trg.getSide1() + ", " + trg.getSide2() + ", " + trg.getSide3());
        System.out.println("Triangle area: " + trg.getArea());
        System.out.println("Triangle perimeter: " + trg.getPerimeter());
    }
}
