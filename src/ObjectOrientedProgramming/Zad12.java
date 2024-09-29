package ObjectOrientedProgramming;

/*
Write a Java program to create a class called "Airplane" with a flight number, destination, and departure time attributes, and methods to check flight status and delay.
*/

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

class Airplane{
    private int flightNumber;
    private String destination;
    private LocalTime departureTime;
    private int delayTime;

    public Airplane(int flightNumber, String destination, LocalTime departureTime){
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.delayTime = 0;
    }

    public int getFlightNumber(){
        return flightNumber;
    }

    public int getDelayTime(){
        return delayTime;
    }

    public void delay(int minutes){
        this.delayTime = minutes;
        this.departureTime = this.departureTime.plusMinutes(minutes);
    }

    public void checkStatus(){
        if(delayTime == 0){
            System.out.println("Flight: " + flightNumber + " to " + destination + " is on time.");
        } else{
            System.out.println("Flight: " + flightNumber + " to " + destination + " is delayed by " + delayTime + " minutes.");
        }
    }
}

public class Zad12 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane(1, "Italy", LocalTime.of(10,30));
        Airplane airplane1 = new Airplane(2, "Spain", LocalTime.of(20,10));

        List<Airplane> airplanes = new ArrayList<>();
        airplanes.add(airplane);
        airplanes.add(airplane1);

        checkFlights(airplanes);

        airplane1.delay(100);
        System.out.println("\nAirplane " + airplane1.getFlightNumber() + " will be delayed by: " + airplane1.getDelayTime() + " minutes");
        checkFlights(airplanes);
    }

    public static void checkFlights(List<Airplane> airplanes) {
        System.out.println("\nFlight status:");
        for (Airplane airplane : airplanes) {
            airplane.checkStatus();
        }
    }
}
