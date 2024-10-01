package ObjectOrientedProgramming;

/*
Write a Java program to create a class called "Building" with attributes for address, number of floors, and total area.
Create subclasses "ResidentialBuilding" and "CommercialBuilding" that add specific attributes
like number of apartments for residential and office space for commercial buildings.
Implement a method to calculate the total rent for each subclass.
*/

class Building{
    private String address;
    private int numOfFloors;
    private double totalArea;

    public Building(String address, int numOfFloors, double totalArea){
        this.address = address;
        this.numOfFloors = numOfFloors;
        this.totalArea = totalArea;
    }

    public double getTotalArea(){
        return totalArea;
    }

    public void displayInfo(){
        System.out.println("Address: " + address);
        System.out.println("Number of floors: " + numOfFloors);
        System.out.println("Total area: " + totalArea);
    }
}

class ResidentialBuilding extends Building{
    private int numOfApartments;
    private double rentPerApartment;

    public ResidentialBuilding(String address, int numOfFloors, double totalArea, int numOfApartments, double rentPerApartment){
        super(address, numOfFloors, totalArea);
        this.numOfApartments = numOfApartments;
        this.rentPerApartment = rentPerApartment;
    }

    public double totalRent(){
        return numOfApartments * rentPerApartment;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Number of apartments: " + numOfApartments);
        System.out.println("Rent cost per apartment: " + rentPerApartment);
        System.out.println("Total rent cost: " + totalRent() + "$");
    }
}

class CommercialBuilding extends Building{
    private double officeSpace;
    private double rentPerSquareMeter;

    public CommercialBuilding(String address, int numOfFloors, double totalArea, double officeSpace, double rentPerSquareMeter){
        super(address, numOfFloors, totalArea);
        this.officeSpace = officeSpace;
        this.rentPerSquareMeter = rentPerSquareMeter;
    }

    public double calculateArea(){
        return officeSpace * rentPerSquareMeter;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Office space: " + officeSpace);
        System.out.println("Rent cost per square meter: " + rentPerSquareMeter);
        System.out.println("Total rent cost: " + calculateArea() + "$");
    }
}

public class Zad25 {
    public static void main(String[] args) {
        ResidentialBuilding res = new ResidentialBuilding("Krakow", 4, 1230.5, 30, 1000);
        CommercialBuilding comm = new CommercialBuilding("Warszawa", 5, 2000, 1000, 500);

        res.displayInfo();
        System.out.println();
        comm.displayInfo();
    }
}
