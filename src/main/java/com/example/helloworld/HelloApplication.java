package com.example.helloworld;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1920, 1080);

        // Set id of the most top control (VBox) in the scene
        scene.getRoot().setId("pane");

        // Load CSS file into the scene
        URL cssFile = HelloApplication.class.getResource("style.css");
        if (cssFile != null) {
            scene.getStylesheets().add(cssFile.toExternalForm());
        } else {
            System.err.println("CSS file not found");
        }

        stage.setTitle("Snake Game!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
