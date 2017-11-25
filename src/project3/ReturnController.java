/**
 * Sample Skeleton for 'ReturnTickets.fxml' PurchaseController Class
 */

package project3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ReturnController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnReturnExit"
    private Button btnReturnExit; // Value injected by FXMLLoader

    @FXML // fx:id="chcReturnTicketSelector"
    private ChoiceBox<?> chcReturnTicketSelector; // Value injected by FXMLLoader

    @FXML // fx:id="txtReturnPurchaseStatus"
    private TextField txtReturnPurchaseStatus; // Value injected by FXMLLoader

    @FXML // fx:id="barReturnStatus"
    private ProgressBar barReturnStatus; // Value injected by FXMLLoader

    @FXML // fx:id="chkReturnMovieSelector"
    private ComboBox<?> chkReturnMovieSelector; // Value injected by FXMLLoader

    @FXML // fx:id="btnReturnPurchasedTickets"
    private Button btnReturnPurchasedTickets; // Value injected by FXMLLoader

    @FXML // fx:id="dateReturnSelector"
    private DatePicker dateReturnSelector; // Value injected by FXMLLoader

    @FXML
    void handleExit(ActionEvent event) {
        System.exit(0);
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnReturnExit != null : "fx:id=\"btnReturnExit\" was not injected: check your FXML file 'ReturnTickets.fxml'.";
        assert chcReturnTicketSelector != null : "fx:id=\"chcReturnTicketSelector\" was not injected: check your FXML file 'ReturnTickets.fxml'.";
        assert txtReturnPurchaseStatus != null : "fx:id=\"txtReturnPurchaseStatus\" was not injected: check your FXML file 'ReturnTickets.fxml'.";
        assert barReturnStatus != null : "fx:id=\"barReturnStatus\" was not injected: check your FXML file 'ReturnTickets.fxml'.";
        assert chkReturnMovieSelector != null : "fx:id=\"chkReturnMovieSelector\" was not injected: check your FXML file 'ReturnTickets.fxml'.";
        assert btnReturnPurchasedTickets != null : "fx:id=\"btnReturnPurchasedTickets\" was not injected: check your FXML file 'ReturnTickets.fxml'.";
        assert dateReturnSelector != null : "fx:id=\"dateReturnSelector\" was not injected: check your FXML file 'ReturnTickets.fxml'.";

    }

    public void handleReturn(ActionEvent actionEvent) {
    }

}
