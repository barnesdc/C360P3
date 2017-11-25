/**
 * Sample Skeleton for 'initialPage.fxml' PurchaseController Class
 */

package project3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;



public class initController  {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnInitReturnTickets"
    private Button btnInitReturnTickets; // Value injected by FXMLLoader

    @FXML // fx:id="btnInitExit"
    private Button btnInitExit; // Value injected by FXMLLoader

    @FXML // fx:id="btnInitPurchaseTickets"
    private Button btnInitPurchaseTickets; // Value injected by FXMLLoader

    @FXML
    void handleExit(ActionEvent event) {
        System.exit(0);
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnInitReturnTickets != null : "fx:id=\"btnInitReturnTickets\" was not injected: check your FXML file 'initialPage.fxml'.";
        assert btnInitExit != null : "fx:id=\"btnInitExit\" was not injected: check your FXML file 'initialPage.fxml'.";
        assert btnInitPurchaseTickets != null : "fx:id=\"btnInitPurchaseTickets\" was not injected: check your FXML file 'initialPage.fxml'.";

    }

    public void handlePurchase(ActionEvent actionEvent) {
        //self.getStage().allScene(PurchaseController.class);

    }

    public void handleReturn(ActionEvent actionEvent) {
    }
}

