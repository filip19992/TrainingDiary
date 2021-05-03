package Controllers;

import FXMLs.FXMLutils;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class MainPaneController {


@FXML
private MondayPaneController mondayPaneController;
    @FXML
    private VBoxController vBoxController;

    @FXML
    private BorderPane mainBorderPane;



    @FXML
    private void initialize() {
        vBoxController.setMainPaneController(this);
    }


    public void setRight(String fxmlPath) {
        Parent parent = FXMLutils.fxmlLoader(fxmlPath);
        mainBorderPane.setRight(parent);
    }


}
