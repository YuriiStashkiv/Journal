package application.journal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class LoginWindowController {

    @FXML
    private PasswordField passwordLogin;

    @FXML
    private Button buttonLogin;

    @FXML
    private TextField usernameLogin;

    private Parent root;
    private Stage stage;
    private Scene scene;

    @FXML
    void loadAdminPage(ActionEvent event) throws IOException {
        if (Objects.equals(usernameLogin.getText(), "Admin") && Objects.equals(passwordLogin.getText(), "admin")){
            stage = (Stage) buttonLogin.getScene().getWindow();
            stage.close();

        } else {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ann_wrong_login.fxml")));
            scene = new Scene(root);
            stage = new Stage();
            stage.setTitle("Login");
            stage.setScene(scene);
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(buttonLogin.getScene().getWindow());
            stage.setResizable(false);
            stage.showAndWait();
        }
    }

}
