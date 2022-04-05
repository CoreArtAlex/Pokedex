package org.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class SecondaryController {

    public Button secondaryButton;
    public ListView<String> about = new ListView<>();

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }


}