package com.bsuir.lab3.application;

import com.bsuir.lab3.application.controller.Controller;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class LabApplication extends javafx.application.Application {
    final private Integer windowDefaultWidth = 1340;
    final private Integer windowDefaultHeight = 380;
    final private String windowName = "Lab 3";
    private Controller controller = new Controller();
    @Override
    public void start(Stage stage) {
        Pane mainPane = new Pane();
        controller.setViewPane(mainPane);
        Group root = new Group(mainPane);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle(windowName);
        stage.setWidth(windowDefaultWidth);
        stage.setHeight(windowDefaultHeight);
        stage.show();
    }
}