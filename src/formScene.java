import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class formScene {
    @FXML
    private ComboBox<String> comboBox;

    public void initialize(){
        comboBox.getItems().addAll("08.00", "10.00", "12.00", "14.00", "16.00");
    }

    @FXML
    private TextArea textInput;
    
    Stage primaryStage;

    // Set primaryStage dari luar (misalnya dalam metode start() pada kelas aplikasi utama)
    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @FXML
    void onClickBack(ActionEvent event) {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("/resources/bookScene.fxml"));
            Scene scene = new Scene(root);
            Stage appStage = (Stage)((Node)event.getSource()).getScene().getWindow();

            appStage.setTitle("Patient");
            appStage.setScene(scene);
            appStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    void setAppointment(ActionEvent event) {

    }

}