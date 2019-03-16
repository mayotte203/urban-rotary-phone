package com.bsuir.lab2.application;

import com.bsuir.lab2.application.controller.Controller;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class LabApplication extends javafx.application.Application {
    private Controller controller = new Controller();
    @Override
    public void start(Stage stage) {
        Pane mainPane = new Pane();
        controller.setViewPane(mainPane);
        Group root = new Group(mainPane);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Lab 2");
        stage.setWidth(940);
        stage.setHeight(340);
        stage.show();
    }
}