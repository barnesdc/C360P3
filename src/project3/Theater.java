package project3;

/*
Objective:
    Use exceptions to increase the reliability of software products and handling unexpected errors
    Apply object-oriented techniques

Assignment:
    - Implement a Theater Management System for the tickets of "I Love Minnie"
    - The "Holiday Theater" has 30 seats with associated seat numbers on them
    - On Nov 23, there will be two showings:
        --10:00am
        -- 8:00pm
Requirements:
    -Constructor to set:
        --date
        --time
        --number of seats
    -Methods:
        --theaterFull
            +Checks if there are any seats available
             for the customer requested ticket
        --PurchaseTicket
    -If customer tries to buy a ticket, but all tickets were sold,
          a "NoTicket" exception should be displayed
    -If a customer returned a ticket, THAT ticket will be available

*/

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Theater {

    private int numSeats;
    private String movieName;

    public Theater(){
        Date date = new Date();
        SimpleDateFormat df =
                new SimpleDateFormat("dd.MMM.yy");
        //usage --> df.format(date);
        Date time = new Date();
        SimpleDateFormat tf =
                new SimpleDateFormat("hh:mm a zzz");
        numSeats = 0;

    }

    public boolean theaterFull(){
        if(numSeats == 0)
        return true;

        else return false;
    }

    public void purchaseTicket(){

        if(theaterFull()){
            // date and time of movie is sold out.
            // prompt to chose other movie UNLESS sold out
        }
        else{
            // purchase tickets
            // basically decrement or use another index of the array
        }

    }
}
