
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class patientScene {
    Stage primaryStage;

    // Set primaryStage dari luar (misalnya dalam metode start() pada kelas aplikasi utama)
    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @FXML
    void btnAppointmentClick(ActionEvent event) {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("/resources/bookScene.fxml"));
            Scene scene = new Scene(root);
            Stage appStage = (Stage)((Node)event.getSource()).getScene().getWindow();

            

            appStage.setTitle("Appointment");
            appStage.setScene(scene);
            appStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    void btnHistoryClick(ActionEvent event) {

    }

}
