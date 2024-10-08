package JavaEncapsulation;

/*
Write a Java program to create a class called Rectangle with private instance variables length and width.
Provide public getter and setter methods to access and modify these variables.
*/

class Rectangle{
    private double length;
    private double width;

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }
}

public class Zad3 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(15.01);
        rectangle.setWidth(25.99);

        System.out.println("Rectangle length: " + rectangle.getLength());
        System.out.println("Rectangle width: " + rectangle.getWidth());
    }
}
