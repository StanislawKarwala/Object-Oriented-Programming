package JavaInterface;

/*
Write a Java program to create an interface Resizable with methods resizeWidth(int width) and resizeHeight(int height) that allow an object to be resized.
Create a class Rectangle that implements the Resizable interface and implements the resize methods.
*/

interface Resizable{
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectanglee implements Resizable{
    private int width;
    private int height;

    public Rectanglee(int width, int height){
        this.width = width;
        this.height = height;
    }

    public void resizeWidth(int width){
        this.width = width;
    }

    public void resizeHeight(int height){
        this.height = height;
    }

    public void printSize() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}

public class Zad5 {
    public static void main(String[] args) {
        Rectanglee rect = new Rectanglee(10, 20);
        System.out.println("Base size of rectangle: ");
        rect.printSize();


        System.out.println("\nResize width and height: ");
        rect.resizeWidth(15);
        rect.resizeHeight(12);
        rect.printSize();

    }
}
