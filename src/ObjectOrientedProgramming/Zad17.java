package ObjectOrientedProgramming;

/*
Write a Java program to create a class called "Movie" with attributes for title, director, actors, and reviews, and methods for adding and retrieving reviews.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Movie{
    private String title;
    private String director;
    private List<String> actors;
    private List<Review> reviews;

    public Movie(String title, String director, List<String> actors){
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.reviews = new ArrayList<>();
    }

    public String getTitle(){
        return title;
    }

    public void addReview(Review review){
        reviews.add(review);
    }

    public List<Review> getReviews(){
        return reviews;
    }

    public List<String> getActors(){
        return actors;
    }
}

class Review{
    private String name;
    private String comment;
    private double rating;

    public Review(String name, String comment, double rating){
        this.name = name;
        this.comment = comment;
        this.rating = rating;
    }

    public String getName(){
        return name;
    }

    public String getComment(){
        return comment;
    }

    public double getRating(){
        return rating;
    }
}



public class Zad17 {
    public static void main(String[] args) {
        List<String> actors = new ArrayList<>(Arrays.asList("Eminem", "Kim Basinger", "Mekhi Phifer"));
        Movie movie = new Movie("8 mile", "Curtis Hanson", actors);

        Review review = new Review("John", "Very good film", 5);
        Review review1 = new Review("Andrea", "Inspirational film", 4.8);

        movie.addReview(review);
        movie.addReview(review1);

        System.out.println("Reviews for '" + movie.getTitle() + "':");
        for(Review rv : movie.getReviews()){
            System.out.println(rv.getComment() + " by " + rv.getName() + " - " + rv.getRating());
        }
    }
}
