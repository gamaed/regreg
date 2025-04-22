package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        TextField colorField = new TextField();
        colorField.setPromptText("Нажмите кнопку...");

        Button redButton = new Button("Красный");
        redButton.setStyle("-fx-background-color: red; -fx-text-fill: white;");

        Button blueButton = new Button("Синий");
        blueButton.setStyle("-fx-background-color: blue; -fx-text-fill: white;");

        Button yellowButton = new Button("Жёлтый");
        yellowButton.setStyle("-fx-background-color: yellow; -fx-text-fill: black;");

        Button purpleButton = new Button("Фиолетовый");
        purpleButton.setStyle("-fx-background-color: purple; -fx-text-fill: white;");
        redButton.setOnAction(e -> colorField.setText("Красный"));
        blueButton.setOnAction(e -> colorField.setText("Синий"));
        yellowButton.setOnAction(e -> colorField.setText("Жёлтый"));
        purpleButton.setOnAction(e -> colorField.setText("Фиолетовый"));

        HBox buttonBox = new HBox(10, redButton, blueButton, yellowButton, purpleButton);
        VBox root = new VBox(10, buttonBox, colorField);

        Scene scene = new Scene(root, 400, 150);
        primaryStage.setTitle("Цветовые кнопки");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
