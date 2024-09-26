package JavaEncapsulation;

/*
Write a Java program to create a class called Desktop with private instance variables brand, processor, and ramSize.
Provide public getter and setter methods to access and modify these variables.
Add a method called upgradeRam() that takes an integer value and increases the ramSize by that value.
*/

class Desktop{
    private String brand;
    private String processor;
    private int ramSize;

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getProcessor(){
        return processor;
    }

    public void setProcessor(String processor){
        this.processor = processor;
    }

    public int getRamSize(){
        return ramSize;
    }

    public void setRamSize(int ramSize){
        this.ramSize = ramSize;
    }

    public void upgradeRam(int value){
        if(value > 0){
            this.ramSize += value;
        }
    }
}

public class Zad10 {
    public static void main(String[] args) {
        Desktop desktop = new Desktop();
        int value = 4;
        desktop.setProcessor("Fast Processor");
        desktop.setBrand("Brandino");
        desktop.setRamSize(4);

        System.out.println("Processor: " + desktop.getProcessor());
        System.out.println("Brand: " + desktop.getBrand());
        System.out.println("Value of RAM: " + desktop.getRamSize());

        desktop.upgradeRam(value);
        System.out.println("Upgraded RAM size by: " + value);
        System.out.println("New value of RAM: " + desktop.getRamSize());
    }
}
