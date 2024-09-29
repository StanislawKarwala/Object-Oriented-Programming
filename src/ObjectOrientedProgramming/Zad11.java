package ObjectOrientedProgramming;

/*
Write a Java program to create a class called "Library" with a collection of books and methods to add and remove books.
*/

import java.util.ArrayList;
import java.util.List;

class Libraryy{
    private List<Bookk> books;

    public Libraryy(){
        this.books = new ArrayList<>();
    }

    public void add(Bookk book){
        books.add(book);
    }

    public void remove(Bookk book){
        books.remove(book);
    }

    public void printAll(){
        if(books.isEmpty()){
            System.out.println("No books in library");
        } else{
            System.out.println("\nBooks in the library: ");
            for(Bookk book : books){
                System.out.println(book);
            }
        }
    }
}

class Bookk{
    private String name;
    private int ISBN;

    public Bookk(String name, int ISBN){
        this.name = name;
        this.ISBN = ISBN;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "Book name: " + name + ", ISBN: " + ISBN;
    }
}

public class Zad11 {
    public static void main(String[] args) {
        Libraryy lib = new Libraryy();
        Bookk book = new Bookk("Cat in hat", 123456);
        Bookk book1 = new Bookk("Special book", 654321);
        lib.add(book);
        lib.add(book1);
        lib.printAll();

        System.out.println("\nRemoving book: " + book.getName());
        lib.remove(book);
        lib.printAll();
    }
}
