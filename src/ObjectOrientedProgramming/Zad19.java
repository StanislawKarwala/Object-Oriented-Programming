package ObjectOrientedProgramming;

/*
Write a Java program to create a class with methods to search for flights and hotels, and to book and cancel reservations.
*/

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Travel{
    private List<Flight> flights;
    private List<Hotel> hotels;

    public Travel(){
        this.flights = new ArrayList<>();
        this.hotels = new ArrayList<>();
    }

    public void searchFlights(String origin, String destination, LocalDate date, int numPassengers) {
        System.out.println("Searching for flights from " + origin + " to " + destination + " on " + date + " for " + numPassengers + " passengers");
    }

    public void searchHotels(String location, LocalDate checkIn, LocalDate checkOut, int numGuests){
        System.out.println("Searching for hotels in " + location + " from " + checkIn + " to " + checkOut + " for " + numGuests + " guests");
    }

    private int generateConfirmationNumber(){
        Random random = new Random();
        return random.nextInt(900000) + 100000;
    }

    public void bookFlight(int flightNumber, String passengerName, String origin, String destination, LocalDate date, int numPassengers, double price){
        Flight flight = new Flight(origin, destination, date, numPassengers, flightNumber, passengerName, price);
        int confirmationNumber = generateConfirmationNumber();
        flight.setConfirmationNumber(confirmationNumber);
        flights.add(flight);
        System.out.println("Flight booked! Confirmation number: " + confirmationNumber);
    }

    public void bookHotel(int hotelId, String guestName, String location, LocalDate checkIn, LocalDate checkOut, int numGuests, double price){
        Hotel hotel = new Hotel(hotelId, guestName, location, checkIn, checkOut, numGuests, price);
        int confirmationNumber = generateConfirmationNumber();
        hotel.setConfirmationNumber(confirmationNumber);
        hotels.add(hotel);
        System.out.println("Hotel booked! Confirmation number: " + confirmationNumber);
    }

    public void cancelReservation(int confirmationNumber){
        for(Flight flight : flights){
            if(flight.getConfirmationNumber() == confirmationNumber){
                flights.remove(flight);
                System.out.println("Flight reservation with confirmation number " + confirmationNumber + " cancelled.");
                return;
            }
        }

        for(Hotel hotel : hotels){
            if(hotel.getConfirmationNumber() == confirmationNumber){
                hotels.remove(hotel);
                System.out.println("Hotel reservation with confirmation number " + confirmationNumber + " cancelled.");
                return;
            }
        }
        System.out.println("No reservation found with confirmation number " + confirmationNumber + ".");
    }
}

class Flight{
    private String origin;
    private String destination;
    private LocalDate date;
    private int numPassengers;
    private int flightNumber;
    private String passengerName;
    private double price;
    private int confirmationNumber;

    public Flight(String origin, String destination, LocalDate date, int numPassengers, int flightNumber, String passengerName, double price){
        this.origin = origin;
        this.destination = destination;
        this.date = date;
        this.numPassengers = numPassengers;
        this.flightNumber = flightNumber;
        this.passengerName = passengerName;
        this.price = price;
    }

    public int getConfirmationNumber(){
        return confirmationNumber;
    }

    public void setConfirmationNumber(int confirmationNumber){
        this.confirmationNumber = confirmationNumber;
    }
}

class Hotel{
    private int hotelId;
    private String guestName;
    private String location;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private int numGuests;
    private double price;
    private int confirmationNumber;

    public Hotel(int hotelId, String guestName, String location, LocalDate checkIn, LocalDate checkOut, int numGuests, double price){
        this.hotelId = hotelId;
        this.guestName = guestName;
        this.location = location;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.numGuests = numGuests;
        this.price = price;
    }

    public int getConfirmationNumber(){
        return confirmationNumber;
    }

    public void setConfirmationNumber(int confirmationNumber){
        this.confirmationNumber = confirmationNumber;
    }
}

public class Zad19 {
    public static void main(String[] args) {
        LocalDate lc = LocalDate.of(2013,10,20);
        LocalDate lc1 = LocalDate.of(2013,10,22);
        LocalDate lc2 = LocalDate.of(2013,10,24);

        Travel travel = new Travel();

        travel.searchFlights("WW", "KRK", lc, 12);
        travel.searchHotels("Rzesz", lc, lc1, 1);

        travel.bookFlight(12345670, "Martin", "New York", "London", lc2, 1, 700.00);
        travel.bookHotel(12, "Andriej", "WWa", lc1, lc2, 1, 1000);

        // Will always not be found, because we can't guess random generated confirmationNumber, but users should have them.
        travel.cancelReservation(12345670);
    }
}
