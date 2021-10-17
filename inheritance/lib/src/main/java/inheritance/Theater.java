package inheritance;
import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
public class Theater {


    private String name;
    private ArrayList<String> reviews = new ArrayList<String>();
    private ArrayList<String> movies=new ArrayList<String>();
    private float starsSum =0;
    private float stars;

    public Theater(String name ){
        this.name= name;
    }

    public void addMovie (String movie){
        this.movies.add(movie);
    }
    public void removeMovie (String movie){
        for (int i = 0; i < this.movies.size(); i++) {
            if (movies.get(i).equals(movie)){
                movies.remove(i);
                break;
            }
        }
    }

    public void addReview(String auther , String body , float stars){
        String newRevew="";
        Review newReview = new Review(auther , body , stars);
        newRevew= newReview + "";
        this.reviews.add(newRevew);
        this.starsSum+= newReview.getStars();
        this.stars= this.starsSum/ this.reviews.size();
    }
    public void addReview(String auther , String body , float stars ,String movie){
        String newRevModified="";
        Review newReview = new Review(auther  , body , stars  ,movie);
        newRevModified =newReview +",movie name: "+ newReview.getMovie()+")";

        this.reviews.add(newRevModified);

        this.starsSum+= newReview.getStars();
        this.stars= this.starsSum/ this.reviews.size();
    }








    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", movies="+ movies+
                ", reviews=" + reviews +
                '}';
    }
}
