package JavaInterface;

/*
Write a Java program to create an interface Drawable with a method draw() that takes no arguments and returns void.
Create three classes Circle, Rectangle, and Triangle that implement the Drawable interface and override the draw() method to draw their respective shapes.
*/

import javax.swing.*;
import java.awt.*;

interface Drawable{
    void draw();
}

class Circlee implements Drawable{
    @Override
    public void draw(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Set the drawing color to red and fill an oval
                g.setColor(Color.RED);
                g.fillOval(100, 100, 200, 200);
            }
        };
        frame.add(panel);
    }
}

class Rectangleee implements Drawable{
    @Override
    public void draw(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLUE);
                g.fillRect(100, 100, 200, 200);
            }
        };
        frame.add(panel);
    }
}

class Trianglee implements Drawable{
    @Override
    public void draw(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.GREEN);
                int[] xPoints = {
                        200,
                        100,
                        300
                };
                int[] yPoints = {
                        100,
                        300,
                        300
                };
                g.fillPolygon(xPoints, yPoints, 3);
            }
        };
        frame.add(panel);
    }
}

public class Zad6 {
    public static void main(String[] args) {
        Circlee circle = new Circlee();
        Rectangleee rectangle = new Rectangleee();
        Trianglee triangle = new Trianglee();

        circle.draw();
        rectangle.draw();
        triangle.draw();
    }
}
