package com.bsuir.lab2.application.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Pane;
import com.bsuir.lab2.application.model.Model;
import com.bsuir.lab2.application.view.View;

public class Controller {
    private View view = new View();
    private Model model = new Model();
    EventHandler<ActionEvent> humanSetNameActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            model.setHumanName(view.getHumanNameInput());
            view.setHumanNameLabelText(model.getHumanName());
        }
    };
    EventHandler<ActionEvent> humanPourLiquidToCupButtonEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            model.humanPourLiquidToCup();
            view.setCupContentLabel(model.getCupContentString());
            view.setBottleContentLabel(model.getBottleContentString());
        }
    };
    EventHandler<ActionEvent> humanPourLiquidToBottleButtonEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            model.humanPourLiquidToBottle();
            view.setCupContentLabel(model.getCupContentString());
            view.setBottleContentLabel(model.getBottleContentString());
        }
    };
    EventHandler<ActionEvent> cupPourWaterButtonEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            model.cupPourWater();
            view.setCupContentLabel(model.getCupContentString());
        }
    };
    EventHandler<ActionEvent> cupPourJuiceButtonEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            model.setJuiceTaste(view.getJuiceTasteInput());
            model.cupPourJuice();
            view.setCupContentLabel(model.getCupContentString());
        }
    };
    EventHandler<ActionEvent> bottlePourWaterButtonEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            model.bottlePourWater();
            view.setBottleContentLabel(model.getBottleContentString());
        }
    };

    EventHandler<ActionEvent> bottlePourJuiceButtonEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            model.setJuiceTaste(view.getJuiceTasteInput());
            model.bottlePourJuice();
            view.setBottleContentLabel(model.getBottleContentString());
        }
    };
    EventHandler<ActionEvent> humanDrinkFromBottleButtonHandler = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            model.humanDrinkFromBottle();
            view.setBottleContentLabel(model.getBottleContentString());
        }
    };
    EventHandler<ActionEvent> humanDrinkFromCupButtonHandler = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            model.humanDrinkFromCup();
            view.setCupContentLabel(model.getCupContentString());
        }
    };
    EventHandler<ActionEvent> cupPourOutButtonEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            model.cupPourOut();
            view.setCupContentLabel(model.getCupContentString());
        }
    };
    EventHandler<ActionEvent> bottlePourOutButtonEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            model.bottlePourOut();
            view.setBottleContentLabel(model.getBottleContentString());
        }
    };
    public Controller()
    {
        view.setCupPourOutButtonHandler(cupPourOutButtonEvent);
        view.setBottlePourOutButtonHandler(bottlePourOutButtonEvent);
        view.setHumanDrinkFromBottleButtonHandler(humanDrinkFromBottleButtonHandler);
        view.setHumanDrinkFromCupButtonHandler(humanDrinkFromCupButtonHandler);
        view.setHumanPourLiquidToBottleButtonHandler(humanPourLiquidToBottleButtonEvent);
        view.setHumanPourLiquidToCupButtonHandler(humanPourLiquidToCupButtonEvent);
        view.setCupPourWaterButtonHandler(cupPourWaterButtonEvent);
        view.setCupPourJuiceButtonHandler(cupPourJuiceButtonEvent);
        view.setBottlePourWaterButtonHandler(bottlePourWaterButtonEvent);
        view.setBottlePourJuiceButtonHandler(bottlePourJuiceButtonEvent);
        view.setHumanSetNameButtonHandler(humanSetNameActionEvent);

        view.setBottleContentLabel(model.getBottleContentString());
        view.setCupContentLabel(model.getCupContentString());
    };
    public void setViewPane(Pane pane)
    {
        view.setPane(pane);
    }
}
