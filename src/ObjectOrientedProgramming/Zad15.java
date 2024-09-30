package ObjectOrientedProgramming;

/*
Write a Java program to create a class called "MusicLibrary" with a collection of songs and methods to add and remove songs, and to play a random song.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class MusicLibrary{
    private List<Song> songs;

    public MusicLibrary(){
        this.songs = new ArrayList<>();
    }

    public void addSongs(Song song){
        songs.add(song);
    }

    public void removeSongs(Song song){
        songs.remove(song);
    }

    public List<Song> getSongs(){
        return songs;
    }

    public void playRandomSong(){
        if(songs.isEmpty()){
            System.out.println("There are no songs in Music Library");
            return;
        }
        Random random = new Random();
        int randomIndex = random.nextInt(songs.size());
        Song randomSong = songs.get(randomIndex);
        System.out.println("\nPlaying random song: " + randomSong.getName() + " (" + randomSong.getGenre() + "), Artist: "
                + randomSong.getArtist() + ", Length: " + randomSong.getLength() + " seconds.");

    }
}

class Song{
    private String name;
    private String genre;
    private String artist;
    private int length;

    public Song(String name, String genre, String artist, int length){
        this.name = name;
        this.genre = genre;
        this.artist = artist;
        this.length = length;
    }

    public String getName(){
        return name;
    }

    public String getGenre(){
        return genre;
    }

    public String getArtist(){
        return artist;
    }

    public int getLength(){
        return length;
    }
}

public class Zad15 {
    public static void main(String[] args) {
        MusicLibrary library = new MusicLibrary();
        Song song = new Song("The way i am", "Hip-Hop", "Eminem", 200);
        Song song1 = new Song("No love", "Hip-Hop", "Eminem", 250);
        Song song2 = new Song("Despicable", "Hip-Hop", "Eminem", 140);

        library.addSongs(song);
        library.addSongs(song1);
        library.addSongs(song2);

        System.out.println("All songs: ");
        for(Song sg : library.getSongs()){
            System.out.println(sg.getName() + ", Artist: " + sg.getArtist());
        }

        library.playRandomSong();
    }
}
