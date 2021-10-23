package inheritance;

import java.util.ArrayList;

public class Theater extends Place{
    private ArrayList<String> movies = new ArrayList<String>();

    public Theater(String name, float stars , float priceCategory){
        super(name,stars,priceCategory);
    }

    public ArrayList<String> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<String> movies) {
        this.movies = movies;
    }

    public void addMovie (String nameOfMovie){
        movies.add(nameOfMovie);
    }

    public void removeMovie (String nameOfMovie){
        movies.remove(nameOfMovie);
    }

    @Override
    public String toString() {
        return "\nTheater Name : " + getName() + "\n" + ",The Rates : " + getStars() + "\n" +
                "The Movies for today : "  + movies + "\n" + "Review :" + getReviews() + "\n";
    }



}
