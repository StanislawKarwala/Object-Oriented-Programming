package JavaNestedClasses;

/*
Inner Class with Constructor:
Write a Java program to create an outer class called Person with an inner class Address.
The Address class should have a constructor that takes parameters city and state.
Create an instance of Address from the Person class and print the address details.
*/

public class Zad9 {
    class Address{
        String city;
        String state;

        Address(String city, String state){
            this.city = city;
            this.state = state;
        }

        void displayAddress(){
            System.out.println("City: " + city + "\nState: " + state);
        }
    }

    public static void main(String[] args) {
        Zad9 person = new Zad9();
        Address address = person.new Address("Big City", "Arizona");
        address.displayAddress();
    }
}
