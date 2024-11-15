package Oops.Constructors.Movie;

public class Main {
    public static void main(String[] args) {
        
        Cinema cinema = new Cinema();
        
        cinema.addMovie("Inception", "Christopher Nolan", "Sci-Fi", 2010);
        cinema.addMovie("The Godfather", "Francis Ford Coppola", "Crime", 1972);
        
        cinema.displayMovies();
    }
}
