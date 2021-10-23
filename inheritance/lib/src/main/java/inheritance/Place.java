package inheritance;

import java.util.LinkedList;

public class Place {
    private String name;
    private float stars;
    private float  priceCategory;

    public Place(String name, float stars , float  priceCategory) {
        this.name = name;
        this.stars = stars;
        this.priceCategory = priceCategory;

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


    public float getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(float priceCategory) {
        this.priceCategory = priceCategory;
    }


    LinkedList<Review> reviews = new LinkedList<>();

    public LinkedList<Review> getReviews(){
        return reviews;
    }

    public void addReviews(Review reviews){
        this.reviews.add(reviews);
        update();
    }


    public void update(){
        float totelOfStars =0;
        for (int i=0; i<getReviews().size(); i++){
            totelOfStars += getReviews().get(i).getStarsNum();
        }
        totelOfStars = totelOfStars/ (getReviews().size());
        this.stars = totelOfStars;
    }
}
