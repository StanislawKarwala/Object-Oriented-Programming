package ObjectOrientedProgramming;

/*
Write a Java program to create class called "TrafficLight" with attributes for color and duration, and methods to change the color and check for red or green.
*/

enum TrafficColor{
    RED,
    GREEN
}

class TrafficLight{
    private TrafficColor color;
    private double duration;

    public TrafficLight(TrafficColor color, double duration) {
        this.color = color;
        this.duration = duration;
    }

    public TrafficLight(){
        this.color = TrafficColor.RED;
        this.duration = 10;
    }

    public TrafficColor getColor(){
        return color;
    }

    public void setColor(TrafficColor color){
        this.color = color;
    }

    public boolean isRed(){
        return color == TrafficColor.RED;
    }

    public boolean isGreen(){
        return color == TrafficColor.GREEN;
    }
}

public class Zad8 {
    public static void main(String[] args) {
        TrafficLight trf = new TrafficLight();
        System.out.println("Traffic light color: " + trf.getColor());
        System.out.println("Is traffic light red? " + trf.isRed());
        System.out.println("Is traffic light green? " + trf.isGreen());

        System.out.println("\nChanging traffic light color to green");
        trf.setColor(TrafficColor.GREEN);
        System.out.println("Traffic light color: " + trf.getColor());
        System.out.println("Is traffic light green? " + trf.isGreen());
        System.out.println("Is traffic light red? " + trf.isRed());
    }
}
