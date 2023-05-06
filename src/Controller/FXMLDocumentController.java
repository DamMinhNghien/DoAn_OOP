/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package Controller;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;



/**
 *
 * @author admin
 */

public class FXMLDocumentController implements Initializable {
    @FXML
private Button myButton;
    
   @FXML
    private void handleButtonAction(ActionEvent event){
      
    TextInputDialog dialog = new TextInputDialog();
    dialog.setTitle("Thêm bảng mới");
    dialog.setHeaderText("Nhập tên bảng mới:");
    dialog.setX(923);
    dialog.setY(220);
    dialog.initOwner(myButton.getScene().getWindow());
    // Tạo một Label với biểu tượng cây
    Label iconLabel = new Label();
    iconLabel.setStyle("-fx-graphic: url(../image/trello.png)");

    // Đặt biểu tượng vào DialogPane
    DialogPane dialogPane = dialog.getDialogPane();
    dialogPane.setGraphic(iconLabel);
    
    Optional<String> result = dialog.showAndWait();
    if (result.isPresent()) {
        System.out.println("Input text is: " + result.get());
    } else {
        System.out.println("User did not enter anything");
    }
    
   
}
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
}
