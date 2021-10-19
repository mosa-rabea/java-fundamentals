package inheritance;
import java.util.ArrayList;
import java.util.List;
public class Restaurant {
    private String name;
    private float stars;
    private float priceCat;
    private float starsSum=0;
    private int reviewscounter=0;
    private ArrayList<Review> reviews= new ArrayList<Review>();



    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getStars() {
        return stars;
    }

    public void setStars(float stars) {
        this.stars = stars;
    }

    public float getPriceCat() {
        return priceCat;
    }

    public void setPriceCat(float priceCat) {
        this.priceCat = priceCat;
    }



}
