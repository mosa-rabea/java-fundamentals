package inheritance;

public class Review {
    private  String rate;
    private  String author;
    private int numberOfStars;

    public Review(String rate , String author , int numberOfStars){
        this.rate = rate;
        this.author = author;

        if(numberOfStars >= 5){
            this.numberOfStars =5;
        }else if(numberOfStars < 0){
            this.numberOfStars = 0;
        }else {
            this.numberOfStars = numberOfStars;
        }

    }

    public int getStarsNum(){
        return numberOfStars;
    }

    public String toString(){
        return "The author : " + " " + author +  "," + " The rates : " + " " + numberOfStars + "," + " The notes: " + rate;
    }
}
