package application.journal;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class SearchWindowActionController {

    @FXML
    private Button searchButton;

    @FXML
    private Group loginIcon;

    private Stage stage;
    private Parent root;
    Scene scene;
    @FXML
    void openLoginWindow(MouseEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("login_window.fxml")));
        scene = new Scene(root);

        stage = new Stage();
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(searchButton.getScene().getWindow());
        stage.setResizable(false);
        stage.showAndWait();

        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("list_of_students_with_editing_window.fxml")));
        stage = (Stage) searchButton.getScene().getWindow();
        stage.setTitle("Admin Page");
        stage.setScene(new Scene(root));
        stage.show();
    }

}
