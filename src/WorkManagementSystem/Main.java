/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package WorkManagementSystem;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
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
        //stage.initStyle(StageStyle.UTILITY);
        stage.setScene(scene);
        stage.setTitle("WorkManagementSystem");
        stage.getIcons().add(new Image(getClass().getResourceAsStream("../image/trello.png")));
        stage.setResizable(false);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
