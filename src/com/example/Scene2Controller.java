package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Scene2Controller{
    @FXML
    ImageView productimage;
    @FXML
    Label MobileName;
    @FXML
    Label MobilePrice;

    @FXML
    private AnchorPane finalScene;

    Stage stage;
    public void setText(String sName , String sPrice)
    {
        MobileName.setText(sName);
        MobilePrice.setText(sPrice);
        String imagePath = "E:\\project\\dsa\\images\\" + MobileName.getText()+ ".png";
        productimage.setImage(new Image("file:" + imagePath));
    }

    public void close(ActionEvent event) {
        // Getting confirmation before closing window
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Close");
        alert.setContentText("Do you want to close?");

        if(alert.showAndWait().get()== ButtonType.OK) {
            stage = (Stage) finalScene.getScene().getWindow();
            stage.close();
        }
    }
// public void back(ActionEvent event) {
//     try {
//         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
//         Parent root = fxmlLoader.load();
        
//         // Get the current stage
//         Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        
//         // Set the scene with the hello-view.fxml
//         stage.setScene(new Scene(root));
//         stage.show();
//     } catch (IOException e) {
//         System.out.println("eoor"); // Handle the exception appropriately
//     }
// }

}
