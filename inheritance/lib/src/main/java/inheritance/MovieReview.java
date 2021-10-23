package inheritance;

public class MovieReview extends Review{

    private String movie;

    public MovieReview(String rate, String author, int numberOfStars, String movie) {
        super(rate, author, numberOfStars);
        this.movie = movie;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

}
