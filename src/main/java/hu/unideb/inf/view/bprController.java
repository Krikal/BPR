package hu.unideb.inf.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import jdk.swing.interop.SwingInterOpUtils;


import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;


public class bprController implements Initializable {

    @FXML
    private Label startOfRental;

    @FXML
    private Label endOfRental;

    @FXML
    private Label placeOfTakeover;

    @FXML
    private DatePicker datePickerOfStart;

    @FXML
    private DatePicker datePickerOfEnd;



    private void getDateValues(){
        LocalDate startDate = datePickerOfStart.getValue();
        LocalDate endDate = datePickerOfEnd.getValue();

        System.out.println(startDate + "--- " + endDate);
    }
    public void testButton() {
        getDateValues();

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
