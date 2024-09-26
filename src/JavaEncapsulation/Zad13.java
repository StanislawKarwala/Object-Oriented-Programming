package JavaEncapsulation;

/*
Write a Java program to create a class called Movie with private instance variables title, director, and duration.
Provide public getter and setter methods to access and modify these variables.
Add a method called getMovieDetails() that returns a formatted string containing the movie details.
*/

class Movie{
    private String title;
    private String director;
    private int duration;

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getDirector(){
        return director;
    }

    public void setDirector(String director){
        this.director = director;
    }

    public int getDuration(){
        return duration;
    }

    public void setDuration(int duration){
        this.duration = duration;
    }

    public String getMovieDetails(){
        return "Title: " + title + "\nDirector: " + director + "\nDuration: " + duration + " minutes";
    }
}

public class Zad13 {
    public static void main(String[] args) {
        Movie movie = new Movie();

        movie.setTitle("Cat in Big Boots");
        movie.setDirector("Christopher Nolan");
        movie.setDuration(200);

        System.out.println(movie.getMovieDetails());
    }
}
