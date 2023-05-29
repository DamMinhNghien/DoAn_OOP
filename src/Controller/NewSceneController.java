/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controller;

import Card.MainCard;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class NewSceneController implements Initializable {

    private CardController cardController;
    private MainCard card;
    @FXML
    private TextField TextField2 = new TextField();
    @FXML
    private Label dataLabel = new Label();
    @FXML
    private AnchorPane CardPane2;
    @FXML
    private Button XacNhan = new Button();

    @FXML
    public void setLabelText(String text) {
        dataLabel.setText(text);
        dataLabel.prefHeight(52);
        dataLabel.prefWidth(170);
        dataLabel.setLayoutX(73);
        dataLabel.setLayoutY(69);
        dataLabel.setFont(new Font(20));

        TextField2.setPromptText("Nhập lại tiêu đề...");
        TextField2.setPrefHeight(40);
        TextField2.setPrefWidth(300);
        TextField2.setFont(Font.font("Arial", 20));
        TextField2.setLayoutX(60);
        TextField2.setLayoutY(64);

        XacNhan.setPrefHeight(30);
        XacNhan.setPrefWidth(38);
        XacNhan.setLayoutX(370);
        XacNhan.setLayoutY(67);
        XacNhan.setText("OK");
        if (!text.isEmpty()) {

            CardPane2.getChildren().add(dataLabel);

            TextField2.setVisible(false);
            CardPane2.getChildren().add(TextField2);

            XacNhan.setVisible(false);
            CardPane2.getChildren().add(XacNhan);
            XacNhan.setOnMouseClicked(this::XacNhanClicked);
            dataLabel.setOnMouseClicked(this::labelClicked);
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Lỗi");
            alert.setHeaderText(null);
            alert.setContentText("Vui lòng nhập tiêu đề thẻ!");

        }
    }

    @FXML
    private void labelClicked(MouseEvent e) {
        // hiển thị TextField để cho phép người dùng nhập lại tên thẻ
        TextField2.setText(dataLabel.getText());
        TextField2.setVisible(true);
        TextField2.requestFocus();
        dataLabel.setVisible(false);
        XacNhan.setVisible(true);

    }

    @FXML
    private void CardClicked() {
        CardPane2.requestFocus();

    }

    @FXML
    private void XacNhanClicked(MouseEvent e) {
        if (!TextField2.getText().isEmpty()) {
            dataLabel.setText(TextField2.getText());
            try {
                card.TitleDB(TextField2.getText(), card.IDCard);
            } catch (SQLException ex) {
                Logger.getLogger(NewSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
            dataLabel.setVisible(true);
            TextField2.setVisible(false);
            XacNhan.setVisible(false);

            if (cardController != null) {
                cardController.updateLabel(TextField2.getText()); // Gọi phương thức updateLabel() của CardController để cập nhật label
            }
            CardClicked();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Lỗi");
            alert.setHeaderText(null);
            alert.setContentText("Vui lòng nhập tiêu đề thẻ!");
            alert.showAndWait();
        }
    }

    public void setCard(MainCard card) {
        this.card = card;
    }

    public void setCardController(CardController cardController) {
        this.cardController = cardController;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
}
