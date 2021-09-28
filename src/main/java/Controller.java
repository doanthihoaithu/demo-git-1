import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    static int count = 0;

    @FXML
    public Button btSearch;

    @FXML
    public TextField tfInput;

    @FXML
    public TextArea taMeaning;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tfInput.setText("Moi ban nhap tu can tim kiem");
        taMeaning.setText("Hello World");
        btSearch.setOnMouseClicked(mouseEvent -> {
            count++;
            taMeaning.setText("Ban vua click lan: " + count);
        });
    }
}
