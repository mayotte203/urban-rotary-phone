package com.bsuir.lab2.application;

import com.bsuir.lab2.application.controller.Controller;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class LabApplication extends javafx.application.Application {
    final private Integer windowDefaultWidth = 940;
    final private Integer windowDefaultHeight = 340;
    final private String windowName = "Lab 2";
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