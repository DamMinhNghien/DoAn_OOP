/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WorkManagementSystem;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;

/**
 *
 * @author admin
 */
public class CardOverlayDialog extends Dialog<String> {
    public CardOverlayDialog() {
        // Thiết lập tiêu đề và nút lưu, nút hủy bỏ cho scene đè
        setTitle("Chi tiết thẻ");
        setHeaderText(null);
        ButtonType saveButtonType = new ButtonType("Lưu", ButtonBar.ButtonData.OK_DONE);
        ButtonType cancelButtonType = new ButtonType("Hủy bỏ", ButtonBar.ButtonData.CANCEL_CLOSE);
        getDialogPane().getButtonTypes().addAll(saveButtonType, cancelButtonType);

        // Thiết lập giao diện cho scene đè bằng FXML hoặc code JavaFX
        // Ví dụ: sử dụng FXMLLoader để tải giao diện từ file FXML
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("card_overlay.fxml"));
        try {
            Parent content = fxmlLoader.load();
            getDialogPane().setContent(content);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Xử lý sự kiện khi người dùng ấn nút lưu
        setResultConverter(buttonType -> {
            if (buttonType == saveButtonType) {
                // Xử lý lưu dữ liệu và trả về kết quả
                return "Lưu";
            }
            return null;
        });
    }
}

