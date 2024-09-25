package JavaEncapsulation;

/*
Write a Java program to create a class called Smartphone with private instance variables brand, model, and storageCapacity.
Provide public getter and setter methods to access and modify these variables.
Add a method called increaseStorage() that takes an integer value and increases the storageCapacity by that value.
*/

class Smartphone{
    private String brand;
    private String model;
    private double storageCapacity;

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public double getStorageCapacity(){
        return storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity){
        this.storageCapacity = storageCapacity;
    }

    public void increaseStorage(int value){
        if(value > 0){
            this.storageCapacity += value;
        }
    }
}

public class Zad9 {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone();
        int value = 40;
        phone.setBrand("SmartMobile");
        phone.setModel("W1000");
        phone.setStorageCapacity(60);

        System.out.println("Brand: " + phone.getBrand());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Storage Capacity: " + phone.getStorageCapacity() + "GB");
        phone.increaseStorage(value);
        System.out.println("Increased storage apacity by: " + value + "GB equals: " + phone.getStorageCapacity() + "GB");
    }
}
