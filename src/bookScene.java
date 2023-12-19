import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class bookScene {
    Stage primaryStage;

    // Set primaryStage dari luar (misalnya dalam metode start() pada kelas aplikasi utama)
    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @FXML
    void onClickBack(ActionEvent event) {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("/resources/patientScene.fxml"));
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
    void onClickBook1(ActionEvent event) {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("/resources/formScene.fxml"));
            Scene scene = new Scene(root);
            Stage appStage = (Stage)((Node)event.getSource()).getScene().getWindow();        

            appStage.setTitle("Form Appointment");
            appStage.setScene(scene);
            appStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void onClickBook2(ActionEvent event) {

    }

    @FXML
    void onClickBook3(ActionEvent event) {

    }

}
