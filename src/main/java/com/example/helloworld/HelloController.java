package com.example.helloworld;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloController {

    @FXML
    private Label welcomeText;

    @FXML
    private void onHelloButtonClick(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("start-game.fxml"));
            Scene secondScene = new Scene(fxmlLoader.load(), 1920, 1080);

            // Add the CSS file to the second scene's stylesheets
            secondScene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("style.css")).toExternalForm());

            // Get the stage information from the ActionEvent source (button)
            Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();

            // Set the new scene on the stage
            stage.setScene(secondScene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
