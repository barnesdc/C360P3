package project3;

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
                new SimpleDateFormat("hh:mm:ss a zzz");
        numSeats = 0;
    }

    public boolean theaterFull(){
        if(numSeats == 0)
        return true;

        else return false;
    }

    public void purchaseTicket(){

    }
}
