package JavaConstructor;

/*
Write a Java program to create a class called "Book" with attributes for title, author, and ISBN,
and methods to add and remove books from a collection.
*/

import java.util.ArrayList;
import java.util.List;

public class Zad5 {
    private String title;
    private String author;
    private int isbn;

    public Zad5(String title, String author, int isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getIsbn(){
        return isbn;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }

    private static List<Zad5> bookCollection = new ArrayList<>();

    public static void addBook(Zad5 book){
        bookCollection.add(book);
        System.out.println(book.getTitle() + " has been added to collection");
    }

    public static void removeBook(Zad5 book){
        if(bookCollection.remove(book)){
            System.out.println(book.getTitle() + " has been removed from collection");
        } else{
            System.out.println(book.getTitle() + " was not found");
        }
    }

    public static void main(String[] args) {
        Zad5 book1 = new Zad5("Special Book", "George", 123456);
        Zad5 book2 = new Zad5("Mockingbird", "Lee", 654321);
        System.out.println("Book1: " + book1.toString());
        System.out.println("Book2: " + book2.toString());
        System.out.println();

        addBook(book1);
        addBook(book2);
        removeBook(book1);
    }
}
