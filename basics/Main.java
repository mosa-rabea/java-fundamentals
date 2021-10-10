

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; 
public class Main {

    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        flipNHeads(5);
        timeZone();
    }

   


    public static String pluralize(String name, int number) {
        if (number == 1) {
            return name;
        } else if (number == 0 || number > 1) {
            return name + "s";
        }
        return name;

    }
   

    public static void flipNHeads(int n){
        int head = 0;
        int counter = 0;
        

        while (head != n){
           
            if( Math.random() >= 0.5){
                head++;
                counter ++;
                System.out.println("head");

            }else{
               head=0;
                counter ++;
                System.out.println("tail");
            }
        }
        System.out.println("It took " + counter + " flips to flip " + n + " head in a row.");

    }


   
    public static void timeZone() {
        while(true){
            LocalDateTime timeZoneNow = LocalDateTime.now();
            String LocalTimeCounter = timeZoneNow.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            System.out.println(LocalTimeCounter);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
