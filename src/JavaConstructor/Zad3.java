package JavaConstructor;

/*
Constructor Overloading
Write a Java program to create a class called "Book" with instance variables title, author, and price.
Implement a default constructor and two parameterized constructors:

One constructor takes title and author as parameters.
The other constructor takes title, author, and price as parameters.
Print the values of the variables for each constructor.
*/

public class Zad3 {
    private String title;
    private String author;
    private double price;

    public Zad3(){
    }
    public Zad3(String title, String author){
        this.title = title;
        this.author = author;
    }
    public Zad3(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }


    public static void main(String[] args) {
        Zad3 book = new Zad3();
        System.out.println("1st book");
        System.out.println("Book 1 title: " + book.title);
        System.out.println("Book 1 author: " + book.author);
        System.out.println("Book 1 price: " + book.price);

        Zad3 book1 = new Zad3("Snow White and the Seven Dwarfs", "Jacob and Wilhelm Grimm");
        System.out.println("\n2nd book");
        System.out.println("Book 2 title: " + book1.title);
        System.out.println("Book 2 author: " + book1.author);
        System.out.println("Book 2 price: " + book1.price);

        Zad3 book2 = new Zad3("RandomBook", "AuthorRandom", 18.19);
        System.out.println("\n3rd book");
        System.out.println("Book 3 title: " + book2.title);
        System.out.println("Book 3 author: " + book2.author);
        System.out.println("Book 3 price: " + book2.price);
    }
}
