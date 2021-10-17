package inheritance;
import java.util.ArrayList;
public class Shop {
    private String name;
    private String description;
    private String dollarSigns="";
    private  float stars;
    private float starsSum=0;
    private ArrayList<Review> reviews= new ArrayList<Review>();


    public Shop(String name , String description , int dollarSigns){
        this.name = name;
        this.description = description;
        for (int i = 0; i < dollarSigns; i++) {
            this.dollarSigns+="$";
        }
    }

    public void shopReview(String auther , String body , float stars){
        Review newReview = new Review(auther , body , stars);
        this.reviews.add(newReview);
        this.starsSum+= newReview.getStars();
        this.stars= this.starsSum/ this.reviews.size();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDollarSigns() {
        return dollarSigns;
    }

    public void setDollarSigns(String dollarSigns) {
        this.dollarSigns = dollarSigns;
    }


    public float getStars() {
        return stars;
    }

    public void setStars(float stars) {
        this.stars = stars;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", stars=" + stars +
                ", dollarSigns='" + dollarSigns + '\'' +
                ", reviews=" + reviews +
                '}';
    }


}
