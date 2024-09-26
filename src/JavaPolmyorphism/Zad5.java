package JavaPolmyorphism;

/*
Write a Java program to create a base class Sports with a method called play().
Create three subclasses: Football, Basketball, and Rugby.
Override the play() method in each subclass to play a specific statement for each sport.
*/

class Sports{
    public void play(){
        System.out.println("Playing a sport");
    }
}

class Football extends Sports{
    @Override
    public void play(){
        System.out.println("Playing a football");
    }
}

class Basketball extends Sports{
    @Override
    public void play(){
        System.out.println("Playing a basketball");
    }
}

class Rugby extends Sports{
    @Override
    public void play(){
        System.out.println("Playing a rugby");
    }
}

public class Zad5 {
    public static void main(String[] args) {
        Sports sports = new Sports();
        Football football = new Football();
        Basketball basketball = new Basketball();
        Rugby rugby = new Rugby();

        sports.play();
        football.play();
        basketball.play();
        rugby.play();
    }
}
