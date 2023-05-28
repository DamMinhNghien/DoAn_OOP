/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package Controller;





import Card.MainCard;
import java.io.IOException;
import javafx.scene.input.MouseEvent;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    private Connection conn = null;
    private PreparedStatement pat = null;

    @FXML
    private ListView<AnchorPane> container1; // Khai báo và chú thích biến container với @FXML
//    @FXML
//private Button myButton;
     @FXML
   private AnchorPane CardPane;

   
@FXML
public void TaoCard(MouseEvent event) throws IOException, SQLException {
     MainCard NewCard1=new MainCard();
    
     int maxId=NewCard1.MaxID();
     NewCard1.IDCard=maxId+1;
     NewCard1.IDCarDB(NewCard1.IDCard);
     createNewCard(NewCard1);
}
  
@FXML
private void createNewCard(MainCard NewCard) throws SQLException {
    try {
        conn = (Connection) Conection.ConnectionDB.dbConn();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../FXML/Card.fxml"));
        AnchorPane cardPane = loader.load();
        CardController cardController = loader.getController();
        cardController.setCard(NewCard);
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
   
    //190,518
    //3 38
    }
}