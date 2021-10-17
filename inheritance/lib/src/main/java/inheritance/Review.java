package inheritance;

public class Review {
    private String body;
    private String auther;
    private float stars;
    private String movie;


    public Review(String auther , String body , float stars ){
        if (stars > 5){
            this.stars = 5;
        }else if (stars < 0){
            this.stars=0;
        }else{
            this.stars = stars;
        }

        this.auther = auther;
        this.body = body;
    }
    public Review(String auther  ,String body , float stars ,String movie){
        if (stars > 5){
            this.stars = 5;
        }else if (stars < 0){
            this.stars=0;
        }else{
            this.stars = stars;
        }

        this.auther = auther;
        this.body = body;
        this.movie =movie;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public float getStars() {
        return stars;
    }

    public void setStars(float stars) {
        this.stars = stars;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return auther+" ( said: "+body+", "+
                "and rate it with =" + stars+" stars " ;
    }
}
