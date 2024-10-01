package ObjectOrientedProgramming;

/*
Write a Java program to create a class called "Event" with attributes for event name, date, and location.
Create subclasses "Seminar" and "MusicalPerformance" that add specific attributes like number of speakers for seminars and performer list for concerts.
Implement methods to display event details and check for conflicts in the event schedule.
*/

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Event{
    private String name;
    private LocalDate date;
    private String location;

    public Event(String name, LocalDate date, String location){
        this.name = name;
        this.date = date;
        this.location = location;
    }

    public void displayEventDetails(){
        System.out.println("\nEvent name: " + name);
        System.out.println("Event date: " + date);
        System.out.println("Event location: " + location);
    }

    public boolean isConflict(Event otherEvent){
        return date.equals(otherEvent.date) && location.equals(otherEvent.location);
    }
}

class Seminar extends Event{
    private int numberOfSpeakers;

    public Seminar(String name, LocalDate date, String location, int numberOfSpeakers){
        super(name, date, location);
        this.numberOfSpeakers = numberOfSpeakers;
    }

    @Override
    public void displayEventDetails(){
        super.displayEventDetails();
        System.out.println("Number of speakers: " + numberOfSpeakers);
    }
}

class MusicalPerformance extends Event{
    private List<String> performerList;

    public MusicalPerformance(String name, LocalDate date, String location){
        super(name, date, location);
        this.performerList = new ArrayList<>();
    }

    public void addPerformer(String name){
        performerList.add(name);
    }

    public void removePerformer(String name){
        performerList.remove(name);
    }

    @Override
    public void displayEventDetails(){
        super.displayEventDetails();
        System.out.println("Performer list: ");
        if(performerList.isEmpty()){
            System.out.println("There are no performers");
        } else{
            for(String performer : performerList){
                System.out.println(performer);
            }
        }
    }
}

public class Zad26 {
    public static void main(String[] args) {
        MusicalPerformance musical = new MusicalPerformance("Linkin Park", LocalDate.of(2024, 10, 30), "USA");
        Seminar seminar = new Seminar("Chop Suey", LocalDate.of(2024,10,30), "Warsaw", 20);

        musical.addPerformer("Chester Bennington");
        musical.displayEventDetails();
        seminar.displayEventDetails();

        System.out.println("\nAre these events in conflict of date and location?: " + musical.isConflict(seminar));
    }
}
