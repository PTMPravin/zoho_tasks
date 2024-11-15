package Oops.AbstractClassesMethods.MovieClassAsAbstract;

class ActionMovie extends Movie {
    String rating;
    String duration;

    public ActionMovie(String title, String genre, String rating, String duration) {
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
