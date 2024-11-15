package Oops.Constructors.Movie;

import java.util.ArrayList;

public class Cinema {
    private ArrayList<Movie> movies = new ArrayList<>();

    // Method to add a Movie using the constructor
    public void addMovie(String title, String director, String genre, int releaseYear) {
        Movie movie = new Movie(title, director, genre, releaseYear);
        movies.add(movie);
    }

    // Method to display all movies
    public void displayMovies() {
        System.out.println("Movies in the Cinema:");
        for (Movie movie : movies) {
            movie.display();
        }
    }
}
