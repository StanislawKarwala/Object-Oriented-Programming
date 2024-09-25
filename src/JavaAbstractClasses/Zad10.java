package JavaAbstractClasses;

/*
Write a Java program to create an abstract class Shape2D with abstract methods draw() and resize().
Create subclasses Rectangle and Circle that extend the Shape2D class and implement the respective methods to draw and resize each shape.
*/

abstract class Shape2D{
    public abstract void draw();
    public abstract void resize();
}

class Rectangle extends Shape2D{
    @Override
    public void draw(){
        System.out.println("Drawing rectangle");
    }

    @Override
    public void resize(){
        System.out.println("Resizing rectangle");
    }
}

class Circlee extends Shape2D{
    @Override
    public void draw(){
        System.out.println("Drawing circle");
    }

    @Override
    public void resize(){
        System.out.println("Resizing circle");
    }
}

public class Zad10 {
    public static void main(String[] args) {
        Shape2D rectangle = new Rectangle();
        Shape2D circle = new Circlee();

        rectangle.draw();
        rectangle.resize();

        System.out.println();

        circle.draw();
        circle.resize();
    }
}
