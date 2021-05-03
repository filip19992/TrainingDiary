package FXMLs;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;

import java.io.IOException;


public class FXMLutils {

    public static Parent fxmlLoader(String fxmlPath) {
        FXMLLoader loader = new FXMLLoader(FXMLutils.class.getResource(fxmlPath));
        Parent parent = null;
        try {
            parent = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parent;

//    public static Node getLoader(String fxmlPath) {
//        FXMLLoader loader = new FXMLLoader(FXMLutils.class.getResource(fxmlPath));
//        try {
//            return loader.load();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
    }
}