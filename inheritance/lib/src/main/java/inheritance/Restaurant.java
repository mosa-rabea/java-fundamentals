package inheritance;

import java.util.LinkedList;

public class Restaurant {

    private String name;
    private float numberOfStars;
    private float  priceCategory;



    public Restaurant(String name, float numberOfStars , float priceCategory){
        this.name = name;
        this.numberOfStars = numberOfStars;
        this.priceCategory =priceCategory;

    }

    LinkedList<Review> reviews = new LinkedList<>();

    public  LinkedList <Review> getReviews(){
        return reviews;
    }

    public void addReviews(Review reviews){
        this.reviews.add(reviews);
        update();
    }


    public void update(){
        float stars =0;
        for (int i=0; i<getReviews().size(); i++){
            stars += getReviews().get(i).getStarsNum();
        }
        stars = stars/ (getReviews().size());
        this.numberOfStars = stars;
    }

    public String toString(){
        return "The restaurant name: " +  name + " " + "The rates : " + numberOfStars + " " + " The price category: " + priceCategory + "$";
    }


}
