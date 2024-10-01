package ObjectOrientedProgramming;

/*
Write a Java program to create a class called "Reservation" with attributes for reservation ID, customer name, and date.
Create subclasses "ResortReservation" and "RailwayReservation" that add specific attributes like room number for hotels and seat number for flights.
Implement methods to check reservation status and modify reservation details.
*/

import java.time.LocalDate;

class Reservation{
    private int id;
    private String customerName;
    private LocalDate date;

    public Reservation(int id, String customerName, LocalDate date){
        this.id = id;
        this.customerName = customerName;
        this.date = date;
    }

    public void reservationStatus(String status){
        System.out.println("\nReservation " + id + ", status: " + status);
    }

    public void modifyReservationDetails(String newCustomerName, LocalDate newDate){
        this.customerName = newCustomerName;
        this.date = newDate;
        System.out.println("\nReservation modified successfully");
    }

    public void displayInfo(){
        System.out.println("\nReservation id: " + id);
        System.out.println("Reservation customer name: " + customerName);
        System.out.println("Reservation date: " + date);
    }
}

class ResortReservation extends Reservation{
    private int roomNumber;

    public ResortReservation(int id, String customerName, LocalDate date, int roomNumber){
        super(id, customerName, date);
        this.roomNumber = roomNumber;
    }

    public void modifyReservationDetails(String newCustomerName, LocalDate newDate, int newRoomNumber){
        super.modifyReservationDetails(newCustomerName, newDate);
        this.roomNumber = newRoomNumber;
        System.out.println("Room number updated successfully");
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Resort room number: " + roomNumber);
    }
}

class RailwayReservation extends Reservation{
    private int seatNumber;

    public RailwayReservation(int id, String customerName, LocalDate date, int seatNumber){
        super(id, customerName, date);
        this.seatNumber = seatNumber;
    }

    public void modifyReservationDetails(String newCustomerName, LocalDate newDate, int newSeatNumber){
        super.modifyReservationDetails(newCustomerName, newDate);
        this.seatNumber = newSeatNumber;
        System.out.println("New seat number updated successfully");
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Train seat number: " + seatNumber);
    }
}

public class Zad28 {
    public static void main(String[] args) {
        ResortReservation resort = new ResortReservation(1, "John", LocalDate.of(2023, 10, 11), 5);
        RailwayReservation railway = new RailwayReservation(2, "Andriej", LocalDate.of(2024,5, 5), 2);

        resort.displayInfo();
        railway.displayInfo();

        resort.modifyReservationDetails("Amelia", LocalDate.of(2024, 2, 10), 1);
        resort.displayInfo();
        resort.reservationStatus("Active");
    }
}
