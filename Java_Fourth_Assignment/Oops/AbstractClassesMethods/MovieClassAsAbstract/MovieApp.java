package Oops.AbstractClassesMethods.MovieClassAsAbstract;

public class MovieApp {
    public static void main(String[] args) {
        Movie actionMovie = new ActionMovie("Mad Max", "Action", "R", "2h 30m");
        Movie comedyMovie = new ComedyMovie("The Mask", "Comedy", "PG", "1h 45m");

        actionMovie.getDetails();
        System.out.println("Rating: " + actionMovie.getRating());
        System.out.println("Duration: " + actionMovie.getDuration());

        System.out.println();

        comedyMovie.getDetails();
        System.out.println("Rating: " + comedyMovie.getRating());
        System.out.println("Duration: " + comedyMovie.getDuration());
    }
}
