package com.bsuir.lab4.application.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;

import java.util.ArrayList;
import java.util.List;

public class View{
    private static final Integer queueLayoutX = 20;
    private static final Integer airportLayoutX = 300;
    private static final Integer buttonOffsetY = 240;
    private static final Integer listViewMaxHeight = 200;
    private static final Integer listViewLayoutY = 20;
    private static final Integer labelLayoutY = 5;

    private static final String addPlaneButtonString = "Add plane";
    private static final String airstripLabelEmptyString = "Empty";
    private static final String planesQueueString = "Queue";
    private static final String airportLabelString = "Airport";

    private ListView planesQueueListView = new ListView();
    private Button addPlaneToQueueButton = new Button();
    private Label airstrip1Status = new Label();
    private Label airstrip2Status = new Label();
    private Label airstrip3Status = new Label();
    private Label airstrip4Status = new Label();
    private Label airstrip5Status = new Label();
    private List<Label> airstripsList = new ArrayList<>();
    private Label queueLabel = new Label();
    private Label airportLabel = new Label();
    public View() {
        queueLabel.setLayoutX(queueLayoutX);
        queueLabel.setLayoutY(labelLayoutY);
        queueLabel.setText(planesQueueString);
        airportLabel.setLayoutX(airportLayoutX);
        airportLabel.setLayoutY(labelLayoutY);
        airportLabel.setText(airportLabelString);
        planesQueueListView.setLayoutX(queueLayoutX);
        planesQueueListView.setLayoutY(listViewLayoutY);
        planesQueueListView.setMaxHeight(listViewMaxHeight);
        addPlaneToQueueButton.setLayoutX(queueLayoutX);
        addPlaneToQueueButton.setLayoutY(buttonOffsetY);
        addPlaneToQueueButton.setText(addPlaneButtonString);
        airstrip1Status.setLayoutX(airportLayoutX);
        airstrip1Status.setLayoutY(20);
        airstrip1Status.setText(airstripLabelEmptyString);
        airstrip2Status.setLayoutX(airportLayoutX);
        airstrip2Status.setLayoutY(50);
        airstrip2Status.setText(airstripLabelEmptyString);
        airstrip3Status.setLayoutX(airportLayoutX);
        airstrip3Status.setLayoutY(80);
        airstrip3Status.setText(airstripLabelEmptyString);
        airstrip4Status.setLayoutX(airportLayoutX);
        airstrip4Status.setLayoutY(110);
        airstrip4Status.setText(airstripLabelEmptyString);
        airstrip5Status.setLayoutX(airportLayoutX);
        airstrip5Status.setLayoutY(140);
        airstrip5Status.setText(airstripLabelEmptyString);
        airstripsList.add(airstrip1Status);
        airstripsList.add(airstrip2Status);
        airstripsList.add(airstrip3Status);
        airstripsList.add(airstrip4Status);
        airstripsList.add(airstrip5Status);
    }
    public void setListView(List<String> strings){
        planesQueueListView.getItems().clear();
        for (String string: strings) {
            planesQueueListView.getItems().add(string);
        }
    }
    public void setAirstripsLabels(List<String> list){
        int i = 0;
        for(; i < list.size(); i++){
            airstripsList.get(i).setText(list.get(i));
        }
        for(; i < 5; i++){
            airstripsList.get(i).setText(airstripLabelEmptyString);
        }
    }
    public void setPane(Pane pane) {
        pane.getChildren().addAll(planesQueueListView, addPlaneToQueueButton, airstrip1Status, airstrip2Status, airstrip3Status, airstrip4Status, airstrip5Status);
    }

    public void setAddPlaneToQueueButtonHandler(EventHandler<ActionEvent> handler){
        addPlaneToQueueButton.setOnAction(handler);
    }
}
