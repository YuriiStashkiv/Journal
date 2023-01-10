package application.journal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class WrongOKPage {

    @FXML
    private Button buttonWrongOk;

    @FXML
    void closeWrongOKPage(ActionEvent event) {
        Stage stage = (Stage) buttonWrongOk.getScene().getWindow();
        stage.close();
    }

}

