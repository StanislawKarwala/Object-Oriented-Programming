package JavaAbstractClasses;

/*
Write a Java program to create an abstract class Instrument with abstract methods play() and tune().
Create subclasses for Glockenspiel and Violin that extend the Instrument class and implement the respective methods to play and tune each instrument.
*/

abstract class Instrument{
    public abstract void play();
    public abstract void tune();
}

class Glockenspiel extends Instrument{
    @Override
    public void play(){
        System.out.println("Glockenspiel playing");
    }

    @Override
    public void tune(){
        System.out.println("Glockenspiel is tuned");
    }
}

class Violin extends Instrument{
    @Override
    public void play(){
        System.out.println("Violin playing");
    }

    @Override
    public void tune(){
        System.out.println("Violin is tuned");
    }
}

public class Zad9 {
    public static void main(String[] args) {
        Instrument glockenspiel = new Glockenspiel();
        Instrument violin = new Violin();

        glockenspiel.play();
        glockenspiel.tune();

        System.out.println();

        violin.play();
        violin.tune();
    }
}
