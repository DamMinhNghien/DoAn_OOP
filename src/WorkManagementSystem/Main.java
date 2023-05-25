/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package WorkManagementSystem;



import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.ObservableList;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;

import javafx.stage.Stage;

/**
 *
 * @author admin
 */

public class Main extends Application {

        
    @Override
    public void start(Stage stage) throws Exception {
        
        Parent root = FXMLLoader.load(getClass().getResource("../FXML/FXMLDocument.fxml"));
   

        Scene scene = new Scene(root);
        
        stage.setScene(scene);
       
        stage.show();
     
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
