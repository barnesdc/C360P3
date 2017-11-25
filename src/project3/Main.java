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
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("initialPage.fxml"));
        primaryStage.setTitle("Theater Management System 1.0");
        primaryStage.setScene(new Scene(root, 409, 426));
        primaryStage.show();
    }


}
