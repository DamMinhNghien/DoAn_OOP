/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class SceneDesController implements Initializable {

    private NewSceneController newSceneController;
    @FXML
    private Button CloseButton;

    @FXML
    private void handleCloseButtonAction(ActionEvent event) {
        Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        stage.close();
        newSceneController.IconBack();
    }

    /**
     * Initializes the controller class.
     */
    public void setNewSceneController(NewSceneController newSceneController) {
        this.newSceneController = newSceneController;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
