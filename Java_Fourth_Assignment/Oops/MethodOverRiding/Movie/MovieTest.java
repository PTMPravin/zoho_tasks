package Oops.MethodOverRiding.Movie;

class Movie {
    protected String title;
    protected int duration;

    public Movie(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public void describe() {
        System.out.println("This is a movie titled " + title + " with a duration of " + duration + " minutes.");
    }
}

class RomComMovie extends Movie {
    public RomComMovie(String title, int duration) {
        super(title, duration);
    }

    @Override
    public void describe() {
        System.out.println("This is a romantic comedy movie titled" + title + " with a duration of " + duration + " minutes.");
    }
}

class ThrillerMovie extends Movie {
    public ThrillerMovie(String title, int duration) {
        super(title, duration);
    }

    public void describe() {
        System.out.println("This is a thriller movie titled " + title + " with a duration of " + duration + " minutes.");
    }
}

public class MovieTest {
    public static void main(String[] args) {
        Movie romCom = new RomComMovie("The Love Story", 120);
        Movie thriller = new ThrillerMovie("The Dark Secret", 130);

        romCom.describe();
        thriller.describe();
    }
}

