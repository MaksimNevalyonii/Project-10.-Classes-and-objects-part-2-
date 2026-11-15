package clworkk11;

interface Playable {
    void play();
}

class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Strumming the guitar");
    }
}

class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the piano");
    }
}

public class Task2 {
    public static void main(String[] args) {
        Playable p;

        p = new Guitar();
        p.play();

        p = new Piano();
        p.play();
    }
}