package Oops.AbstractClassesMethods.MovieClassAsAbstract;

abstract class Movie {
    String title;
    String genre;

    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public abstract String getRating();
    public abstract String getDuration();

    public void getDetails() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
    }
}
