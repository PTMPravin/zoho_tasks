package Oops.AbstractClassesMethods.MovieClassAsAbstract;

class ComedyMovie extends Movie {
    private String rating;
    private String duration;

    public ComedyMovie(String title, String genre, String rating, String duration) {
        super(title, genre);
        this.rating = rating;
        this.duration = duration;
    }

    @Override
    public String getRating() {
        return rating;
    }

    @Override
    public String getDuration() {
        return duration;
    }
}
