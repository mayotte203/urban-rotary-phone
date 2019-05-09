package com.bsuir.lab4.application.controller;

import com.bsuir.lab4.application.plane.Plane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Pane;
import com.bsuir.lab4.application.model.Model;
import com.bsuir.lab4.application.view.View;

import java.util.*;

public class Controller{
    private View view = new View();
    private Model model = new Model();
    private EventHandler<ActionEvent> addPlaneToQueueButtonHandler= new EventHandler<ActionEvent>(){
        @Override
        public void handle(ActionEvent event) {
            model.addPlaneToQueue();
            viewUpdate();
        }
    };

    public synchronized void viewUpdate(){
        List<String> listViewData = new LinkedList<String>();
        List<Plane> planesQueue = model.getPlanesQueue();
        for (Plane plane:
                planesQueue) {
            listViewData.add(plane.toString());
        }
        view.setListView(listViewData);
        List<String> airstripStatusData = new LinkedList<String>();
        List<Plane> landedPlanes = model.getLandedPlanes();
        for (Plane plane:
             landedPlanes) {
            airstripStatusData.add(plane.toString());
        }
        view.setAirstripsLabels(airstripStatusData);
    }
    public Controller() {
        view.setAddPlaneToQueueButtonHandler(addPlaneToQueueButtonHandler);
    }

    public void setViewPane(Pane pane) {
        view.setPane(pane);
    }
}
