package Oops.Classes_and_objects;

public class Movie {
    // Instance Variables
    private String title;
    private String genre;
    private double rating;
    private int duration;

    // Static Variable
    private static String productionHouse = "Default Production House";

    public Movie(String title, String genre, double rating, int duration) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public static String getProductionHouse() {
        return productionHouse;
    }

    public static void setProductionHouse(String productionHouse) {
        Movie.productionHouse = productionHouse;
    }

}
