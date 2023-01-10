package application.journal;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class TableController implements Initializable {

    @FXML
    private TableView<Student> table;

    @FXML
    private TableColumn<Student, Integer> gradeClass;

    @FXML
    private TableColumn<Student, Integer> phoneNumber;

    @FXML
    private TableColumn<Student, String> fullName;

    @FXML
    private TableColumn<Student, String> teacher;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        fullName.setCellValueFactory(new PropertyValueFactory<Student, String>("fullName"));
        gradeClass.setCellValueFactory(new PropertyValueFactory<Student, Integer>("gradeClass"));
        phoneNumber.setCellValueFactory(new PropertyValueFactory<Student, Integer>("phoneNumber"));
        teacher.setCellValueFactory(new PropertyValueFactory<Student, String>("teacher"));

    }

}
