package JavaInterface;

/*
Write a Java program to create an interface Playable with a method play() that takes no arguments and returns void.
Create three classes Football, Volleyball, and Basketball that implement the Playable interface and override the play() method to play the respective sports.
*/

interface Playable{
    void play();
}

class Football implements Playable{
    @Override
    public void play(){
        System.out.println("Playing football");
    }
}

class Volleyball implements Playable{
    @Override
    public void play(){
        System.out.println("Playing volleyball");
    }
}

class Basketball implements Playable{
    @Override
    public void play(){
        System.out.println("Playing basketball");
    }
}

public class Zad8 {
    public static void main(String[] args) {
        Football foot = new Football();
        Volleyball voll = new Volleyball();
        Basketball bask = new Basketball();

        foot.play();
        voll.play();
        bask.play();
    }
}
