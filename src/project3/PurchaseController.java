/**
 * Skeleton for 'tms.fxml' PurchaseController Class
 */

package project3;
// ChoiceBox cb = new ChoiceBox(FXCollections.observableArrayList(
//         "First", "Second", "Third")
//         );

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;

    public class PurchaseController {

        @FXML // ResourceBundle that was given to the FXMLLoader
        private ResourceBundle resources;

        @FXML // URL location of the FXML file that was given to the FXMLLoader
        private URL location;

        @FXML // fx:id="chkMovieSelector"
        private ComboBox<?> chkMovieSelector; // Value injected by FXMLLoader

        @FXML // fx:id="txPurchaseStatus"
        private TextField txPurchaseStatus; // Value injected by FXMLLoader

        @FXML // fx:id="barStatus"
        private ProgressBar barStatus; // Value injected by FXMLLoader

        @FXML // fx:id="btnPurchaseTickets"
        private Button btnPurchaseTickets; // Value injected by FXMLLoader

        @FXML // fx:id="dateSelector"
        private DatePicker dateSelector; // Value injected by FXMLLoader

        @FXML // fx:id="btnExit"
        private Button btnExit; // Value injected by FXMLLoader

        @FXML // fx:id="chcTicketSelector"
        private ChoiceBox<?> chcTicketSelector; // Value injected by FXMLLoader

        @FXML // This method is called by the FXMLLoader when initialization is complete
        void initialize() {
            assert chkMovieSelector != null : "fx:id=\"chkMovieSelector\" was not injected: check your FXML file 'tms.fxml'.";
            assert txPurchaseStatus != null : "fx:id=\"txPurchaseStatus\" was not injected: check your FXML file 'tms.fxml'.";
            assert barStatus != null : "fx:id=\"barStatus\" was not injected: check your FXML file 'tms.fxml'.";
            assert btnPurchaseTickets != null : "fx:id=\"btnPurchaseTickets\" was not injected: check your FXML file 'tms.fxml'.";
            assert dateSelector != null : "fx:id=\"dateSelector\" was not injected: check your FXML file 'tms.fxml'.";
            assert btnExit != null : "fx:id=\"btnExit\" was not injected: check your FXML file 'tms.fxml'.";
            assert chcTicketSelector != null : "fx:id=\"chcTicketSelector\" was not injected: check your FXML file 'tms.fxml'.";

        }
        @FXML
        void handleExit(ActionEvent event) {
            System.exit(0);
        }
    }
