package inheritance;

public class Review {
    private  String rate;
    private  String author;
    private int numberOfStars;

    public Review(String rate , String author , int starsNum){
        this.rate = rate;
        this.author = author;

        if(starsNum >= 5){
            this.numberOfStars =5;
        }else if(starsNum < 0){
            this.numberOfStars = 0;
        }else {
            this.numberOfStars = starsNum;
        }

    }

    public int getStarsNum(){
        return numberOfStars;
    }

    public String toString(){
        return "The author : " + " " + author +  "," + " The rates : " + " " + numberOfStars + "," + " The notes: " + rate;
    }
}
