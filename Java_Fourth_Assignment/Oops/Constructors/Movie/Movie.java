package Oops.Constructors.Movie;

public class Movie {
    private static int movieCount = 0;

    // Instance variables
    private String title;
    private String director;
    private String genre;
    private int releaseYear;

    public Movie(String title, String director, String genre, int releaseYear) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.releaseYear = releaseYear;

        movieCount++;
    }

    // Method to display movie details
    public void display() {
        System.out.println("Title: " + title + ", Director: " + director + 
                           ", Genre: " + genre + ", Release Year: " + releaseYear);
    }

    // Static method to get movie count
    public static int getMovieCount() { 
        return movieCount; 
    }
}
