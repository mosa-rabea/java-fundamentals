/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {


//        Restaurant restaurant = new Restaurant("Mac" , 5,5);
//        System.out.println(restaurant);
//
//
//        Review firstReview = new Review("good","Mosa",5);
//        Review secondReview = new Review("good","Ahmad",4);
//
//        restaurant.addReviews(firstReview);
//        restaurant.addReviews(secondReview);
//
//        System.out.println(restaurant.getReviews());
//


        // Shop
        Shop shop = new Shop("Alban AL Rabea" ,5,5,"Clean and Clear");


        Review ahmadReview = new Review(" great","Ahmad",5);


        shop.addReviews(ahmadReview);




        System.out.println(shop);

        // Theater

        Theater theater = new Theater("AL Hamra" ,4,3);


        theater.addMovie("Twilight");


        Review mosaReview = new Review("I love the place more than story ^_^","Mosa",5);


        theater.addReviews(mosaReview);

        System.out.println(theater);





    }

}
