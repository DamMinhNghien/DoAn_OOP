/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class NewSceneController implements Initializable {
    @FXML
    private TextField TextField2=new TextField();
  @FXML
    private Label dataLabel=new Label();
    @FXML
    private AnchorPane CardPane2;
@FXML
    public void setLabelText(String text) {
        if (dataLabel != null) {
            dataLabel.setText(text);
             dataLabel.prefHeight(52);
            dataLabel.prefWidth(170);
            dataLabel.setLayoutX(60);
            dataLabel.setLayoutY(72);
            CardPane2.getChildren().add(dataLabel);
            dataLabel.setOnMouseClicked(this::labelClicked);
             
        } 
    }
   @FXML
private void labelClicked(MouseEvent e) {
    dataLabel.setVisible(false);
    TextField2.setPromptText("Nhập lại tiêu đề...");
    TextField2.prefHeight(52);
    TextField2.prefWidth(378);
    TextField2.setLayoutX(60);
    TextField2.setLayoutY(72);
    CardPane2.getChildren().add(TextField2);
}
    @FXML
  private void cardPaneClicked1(MouseEvent e) {
   
        CardPane2.requestFocus();
    
  }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
  
}
    }    
    
