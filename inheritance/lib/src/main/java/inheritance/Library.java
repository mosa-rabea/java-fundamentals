/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {

        Restaurant newRestaurant = new Restaurant("mosa",7);

        newRestaurant.addReview("thaer" ,"great", 5);


        System.out.println(newRestaurant);



        Shop newShop = new Shop("mosa" ,"lost man" , 6);

        newShop.shopReview("thaer" , "nice" , 5);
        System.out.println(newShop);



        Theater newTheater = new Theater("ali");
        newTheater.addMovie("ali movie");
        newTheater.addMovie("avengers");
        newTheater.addReview("mosa", "nice",5 , "action" );

        System.out.println(newTheater);
    }

}
