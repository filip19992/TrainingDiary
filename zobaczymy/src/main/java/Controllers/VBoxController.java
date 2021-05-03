package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;

public class VBoxController {

    @FXML
    private VBox VboxDays;

    @FXML
    private ToggleButton mondayButton;

    @FXML
    private ToggleGroup daysToggleGroup;

    @FXML
    private ToggleButton thousdayButton;

    @FXML
    private ToggleButton whensdayButton;

    @FXML
    private ToggleButton thoursdayButton;

    @FXML
    private ToggleButton fridayButton;

    @FXML
    private ToggleButton saturdayButton;

    @FXML
    private ToggleButton sundayButton;

    @FXML
   private  MainPaneController mainPaneController;

    @FXML
    public void planForMonday() {
        System.out.println("plan for monday");
         mainPaneController.setRight("/FXMLFiles/mondayPane.fxml");
    }

    @FXML
    void planForThousday(ActionEvent event) {

    }

    @FXML
    void planForWhensday(ActionEvent event) {

    }

    @FXML
    void planForThoursday(ActionEvent event) {

    }


    @FXML
    void planForFriday(ActionEvent event) {

    }

    @FXML
    void planForSaturday(ActionEvent event) {

    }

    @FXML
    void planForSunday(ActionEvent event) {

    }

    public void setMainPaneController(MainPaneController mainPaneController) {
        this.mainPaneController = mainPaneController;
    }
}
