
package com.example;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static com.example.HelloApplication.*;

public class HelloController implements Initializable {
    @FXML
    TextField textField;
    @FXML
    Button searchItem;
    @FXML
    private ChoiceBox<String> InitialCategory=new ChoiceBox<>(FXCollections.observableArrayList());
    @FXML
    //creating category/choices
    private final String[] choices ={"Vehicles","Mobile","Wearables", "Books"};

    private Stage stage;
    private Scene scene;

    // This Method is for(1st window) search button when it is clicked
    String searchhData;

    com.example.Node temp = null;

    Parent root;
    @FXML
    public void click(ActionEvent event) throws IOException {
        searchhData=textField.getText();// Getting Text from Search bar

        FXMLLoader loader= new FXMLLoader(getClass().getResource("searchResult.fxml"));
        root =loader.load();
        //String varImages= "E:\\project\\dsa\\images";

        Scene2Controller result = loader.getController();

        if (InitialCategory.getValue().equals("Vehicles"))
        {
            Vehicles.ReadALLData(Vehicles.root,"E:\\project\\DSA\\src\\com\\example\\Vehicles.txt");
            
            temp=Vehicles.searchData(Vehicles.root, searchhData);
            // varImages=varImages+"\\Vehicles";
            
        }
        else if (InitialCategory.getValue().equals("Wearables"))
        {
            wearable.ReadALLData(wearable.root,"E:\\project\\DSA\\src\\com\\example\\wearables.txt");
            temp=wearable.searchData(wearable.root, searchhData);
            // varImages=varImages+"\\Wearables";
        } else if (InitialCategory.getValue().equals("Books"))
        {
            Books.ReadALLData(Books.root,"E:\\project\\DSA\\src\\com\\example\\BOOks.txt");
            temp=Books.searchData(Books.root, searchhData);
            // varImages=varImages+"\\Books";
        } else if (InitialCategory.getValue().equals("Mobile"))
        {
            MobilePhpones.ReadALLData(MobilePhpones.root,"E:\\project\\DSA\\src\\com\\example\\Mobile phone.txt");
            temp=MobilePhpones.searchData(MobilePhpones.root, searchhData);
            // varImages=varImages+"\\Mobile phone";
        }
        if (temp!=null)
            result.setText(temp.product_name, String.valueOf(temp.price));
        // varImages=varImages+"\\"+temp.product_name+".png";
        //  System.out.println(varImages);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        InitialCategory.getItems().addAll(choices);

    }

}
