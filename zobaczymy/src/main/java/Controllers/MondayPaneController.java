package Controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Pane;
import sun.tools.jar.Main;

public class MondayPaneController {


    @FXML
    private Pane mondayPaneController;

    @FXML
    public ComboBox<String> chooseTrainingCombobox;
    @FXML
    public ComboBox<String> chooseTrainingCombobox2;
    @FXML
    public ComboBox<String> chooseTrainingCombobox3;
    @FXML
    public ComboBox<String> chooseTrainingCombobox4;
    @FXML
    public ComboBox<String> chooseTrainingCombobox5;
    @FXML
    public ComboBox<String> chooseTrainingCombobox6;




    ObservableList<String> exerciseChoice = FXCollections.observableArrayList(
    "Bench press", "Push up", "Pull up", "Shoulder Press", "Squat", "Dead lift");

    @FXML
    public void initialize() {
        chooseTrainingCombobox.setItems(exerciseChoice);
        chooseTrainingCombobox2.setItems(exerciseChoice);
        chooseTrainingCombobox3.setItems(exerciseChoice);
        chooseTrainingCombobox4.setItems(exerciseChoice);
        chooseTrainingCombobox5.setItems(exerciseChoice);
        chooseTrainingCombobox6.setItems(exerciseChoice);

    }

}
