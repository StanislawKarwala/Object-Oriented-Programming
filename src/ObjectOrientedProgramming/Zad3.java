package ObjectOrientedProgramming;

/*
Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the calculateArea and perimeter of the rectangle.
*/

class Rectangle{
    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double calculateArea(){
        return width * height;
    }

    public double calculatePerimeter(){
        return 2 * width + 2 * height;
    }
}

public class Zad3 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 4);
        System.out.println("Rectangle area: " + rect.calculateArea());
        System.out.println("Rectangle perimeter " + rect.calculatePerimeter());
    }
}
