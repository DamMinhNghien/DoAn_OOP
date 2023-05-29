/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controller;

import Card.MainCard;
import Conection.ConnectionDB;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.sql.ResultSet;


 import javafx.scene.control.TextField;

 import java.sql.PreparedStatement;
import java.sql.SQLException;

 import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.image.Image;




/**
 * FXML Controller class
 *
 * @author admin
 */
public class CardController implements Initializable {
    private MainCard card;
    private Connection conn = null;
    private PreparedStatement pat = null;
    @FXML
    private Label label = new Label();
    @FXML
    private AnchorPane CardPane;
    @FXML
    private Button AddTitle;
    @FXML
    private TextField TextField1;
    
     public void setCard(MainCard card) {
        this.card = card;
    }

    @FXML
    private void addTitle(MouseEvent e) throws SQLException {
        String text = TextField1.getText();
        if (!text.isEmpty()) {
           
           card.setTitle(text);
            label.setText(card.title);
           card.TitleDB(card.title, card.IDCard);
            label.prefHeight(26);
            label.prefWidth(107);
            label.setLayoutX(36);
            label.setLayoutY(26);
            CardPane.getChildren().add(label);
            label.setStyle("-fx-text-fill: black;");
            AddTitle.setVisible(false);
            TextField1.setVisible(false);
        }

      
    }
    public void UpTitleDB(){
        if(card.checkTitle()==true){
         label.setText(card.title);
         label.prefHeight(26);
            label.prefWidth(107);
            label.setLayoutX(36);
            label.setLayoutY(26);
            CardPane.getChildren().add(label);
            label.setStyle("-fx-text-fill: black;");
             AddTitle.setVisible(false);
            TextField1.setVisible(false);
   }
    }
    public void newscene(MouseEvent e) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../FXML/newScene.fxml"));
        AnchorPane newScenePane = loader.load();
       NewSceneController newSceneController = loader.getController();
       newSceneController.setCard(card);
        String labelText = label.getText();
         newSceneController.setLabelText(labelText);
         newSceneController.setCardController(this); 
        Stage newStage = new Stage();
        newStage.initModality(Modality.APPLICATION_MODAL);
        newStage.initOwner(CardPane.getScene().getWindow()); // Nếu primaryStage là stage chính của ứng dụng
        newStage.setTitle("Chỉnh Sửa Thẻ");
        newStage.getIcons().add(new Image(getClass().getResourceAsStream("../image/trello.png")));
        Scene newScene = new Scene(newScenePane);
        newStage.setScene(newScene);
        newStage.showAndWait();
        newStage.setOnCloseRequest(event -> {
            label.setVisible(true);
        });
    }
    public void updateLabel(String newTitle) {
    label.setText(newTitle);
}
 
    /**
     * Initializes the controller class.
     */
        @Override
public void initialize(URL url, ResourceBundle rb) {
    
   
}

    
}
