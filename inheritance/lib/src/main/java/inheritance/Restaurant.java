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

    public Restaurant(String name , float priceCat){
        this.name = name;
        this.priceCat = priceCat;
    }

    public void addReview(String auther ,String body, float stars){
        Review newReview = new Review(auther ,body, stars);
        this.starsSum+= newReview.getStars();
        this.reviewscounter+=1;
        this.stars = this.starsSum/this.reviewscounter;

        this.reviews.add(newReview);


    }

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


    @Override
    public String toString() {
        return "Restaurant{" +
                "Name='" + name + '\'' +
                ",Rate out of 5 stars=" + stars +
                ", Price Category=" + priceCat+"$" +
                ", reviews=" + reviews +
                '}';
    }
}
