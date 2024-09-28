package ObjectOrientedProgramming;

/*
Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add and remove books from a collection.
*/

import java.util.ArrayList;
import java.util.List;

class Book{
    private String title;
    private String author;
    private int ISBN;

    public Book(String title, String author, int ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getISBN(){
        return ISBN;
    }

    @Override
    public String toString() {
        return "Book{Title='" + title + "', Author='" + author + "', ISBN=" + ISBN + "}";
    }
}

class Library{
    private List<Book> books;

    public Library(){
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void removeBook(int ISBN){
        Book bookToRemove = null;
        for(Book book : books){
            if(book.getISBN() == ISBN){
                bookToRemove = book;
                break;
            }
        }
        if (bookToRemove != null) {
            books.remove(bookToRemove);
            System.out.println("\nBook removed: " + bookToRemove.getTitle());
        } else{
            System.out.println("Book with ISBN: " + ISBN + " not found.");
        }
    }

    public void displayBooks(){
        if(books.isEmpty()){
            System.out.println("No books in the library");
        } else{
            System.out.println("\nBooks in the library: ");
            for(Book book : books){
                System.out.println(book);
            }
        }
    }
}

public class Zad5 {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Effective Java", "Joshua Bloch", 123456);
        Book book2 = new Book("Clean Code", "Robert C. Martin", 234567);

        library.addBook(book1);
        library.addBook(book2);
        library.displayBooks();

        library.removeBook(234567);
        library.displayBooks();
    }
}
