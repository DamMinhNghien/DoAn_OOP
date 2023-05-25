/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package Controller;





import java.io.IOException;
import javafx.scene.input.MouseEvent;
import java.net.URL;

import java.util.ResourceBundle;
import javafx.collections.ObservableList;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import javafx.scene.layout.AnchorPane;



/**
 *
 * @author admin
 */

public class FXMLDocumentController implements Initializable {
    
 
    @FXML
    private Button ThemThe;
    @FXML
    private ListView<AnchorPane> container1; // Khai báo và chú thích biến container với @FXML
//    @FXML
//private Button myButton;
     @FXML
   private AnchorPane CardPane;

   
@FXML
public void TaoCard(MouseEvent event) throws IOException {
    createNewCard();
  
}
@FXML
private void createNewCard() {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../FXML/Card.fxml"));
        AnchorPane cardPane = loader.load();

        // Thực hiện các thao tác tùy chỉnh cho cardPane nếu cần
         ObservableList<AnchorPane> items = container1.getItems();
        // Thêm cardPane vào danh sách mục
        items.add(cardPane);
    } catch (IOException e) {
        e.printStackTrace();
    }
}


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
}
