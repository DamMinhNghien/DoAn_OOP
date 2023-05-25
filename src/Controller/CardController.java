/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controller;

import WorkManagementSystem.Main;
import java.beans.EventHandler;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;


/**
 * FXML Controller class
 *
 * @author admin
 */
public class CardController implements Initializable {
 
    @FXML
    private Label label=new Label();
    @FXML
    private AnchorPane CardPane;
     @FXML
    private Button AddTitle;
    @FXML
    private TextField TextField1;
    @FXML
private void addTitle(MouseEvent e) {
    String text = TextField1.getText();
    if (!text.isEmpty()) {
        label.setText(text);
        label.prefHeight(26);
        label.prefWidth(107);
        label.setLayoutX(36);
        label.setLayoutY(26);
        CardPane.getChildren().add(label);
        AddTitle.setVisible(false);
    
    }
    
    TextField1.setVisible(false);
}
public void newscene(MouseEvent e) throws IOException {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("../FXML/newScene.fxml"));
    AnchorPane newScenePane = loader.load();

    Stage newStage = new Stage();
    newStage.initModality(Modality.APPLICATION_MODAL);
    newStage.initOwner(CardPane.getScene().getWindow()); // Nếu primaryStage là stage chính của ứng dụng

    Scene newScene = new Scene(newScenePane);
    newStage.setScene(newScene);
    newStage.showAndWait();
    newStage.setOnCloseRequest(event->{
    label.setVisible(true);
    });
}



    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
