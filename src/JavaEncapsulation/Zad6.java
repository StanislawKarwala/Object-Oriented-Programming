package JavaEncapsulation;

/*
Write a Java program to create a class called Car with private instance variables company_name, model_name, year, and mileage.
Provide public getter and setter methods to access and modify the company_name, model_name, and year variables.
However, only provide a getter method for the mileage variable.
*/

class Car{
    private String companyName;
    private String modelName;
    private int year;
    private double mileage;

    public String getCompanyName(){
        return companyName;
    }

    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }

    public String getModelName(){
        return modelName;
    }

    public void setModelName(String modelName){
        this.modelName = modelName;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public double getMileage(){
        return mileage;
    }
}

public class Zad6 {
    public static void main(String[] args) {
        Car car = new Car();

        car.setCompanyName("Porsche");
        car.setModelName("Carrera");
        car.setYear(2012);

        System.out.println("Company Name: " + car.getCompanyName());
        System.out.println("Model Name: " + car.getModelName());
        System.out.println("Year: " + car.getYear());
        System.out.println("Mileage: " + car.getMileage());
    }
}
