/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controller;

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




/**
 * FXML Controller class
 *
 * @author admin
 */
public class CardController implements Initializable {
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

    @FXML
    private void addTitle(MouseEvent e) throws SQLException {
        String text = TextField1.getText();
        if (!text.isEmpty()) {
            label.setText(text);
            label.prefHeight(26);
            label.prefWidth(107);
            label.setLayoutX(36);
            label.setLayoutY(26);
            CardPane.getChildren().add(label);
            AddTitle.setVisible(false);
            TextField1.setVisible(false);
    
            // Lấy giá trị IDCard lớn nhất hiện có trong            /
            String sql = "SELECT MAX(IDCard) FROM The;";
            try {
                pat = conn.prepareStatement(sql);
                ResultSet rs = pat.executeQuery();
                int maxId = 0;
                if (rs.next()) {
                    maxId = rs.getInt(1);
                }
                int newId = maxId + 1;
                String TieuDe=label.getText();
                // Thêm thẻ mới vào cơ sở dữ liệu với giá trị IDCard mới được tạo
                String sql1 = "INSERT INTO The(IDCard,title) VALUES (?,?);";
                pat = conn.prepareStatement(sql1);
                pat.setInt(1, newId);
                pat.setString(2,TieuDe);
             int i= pat.executeUpdate();
                if(i==1){
                    System.out.println("OK");
                }
  

            } catch (SQLException ex) {
                Logger.getLogger(CardController.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally{
                pat.close();
            }
        }

      
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
        newStage.setOnCloseRequest(event -> {
            label.setVisible(true);
        });
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        conn = (Connection) Conection.ConnectionDB.dbConn();
    }
}