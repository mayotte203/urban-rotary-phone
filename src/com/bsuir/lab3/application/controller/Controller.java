package com.bsuir.lab3.application.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import com.bsuir.lab3.application.model.Model;
import com.bsuir.lab3.application.view.View;

public class Controller {
    private final static String humanNameNone = "None";
        private final static String liquidNameNone = "None";

    private View view = new View();
    private Model model = new Model();
    EventHandler<ActionEvent> humanSetNameActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            model.setHumanName(view.getHumanNameInput());
            if(model.getHumanName() == null) {
                view.setHumanNameLabelText(humanNameNone);
            }
            else {
                view.setHumanNameLabelText(model.getHumanName());
            }
            view.refreshHumansListView();
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
    EventHandler<ActionEvent> buyWaterButtonEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            model.humanBuyWater();
            if(model.getHumanLiquidString() == null) {
                view.setHumanLastLiquidLabelText(liquidNameNone);
            }
            else {
                view.setHumanLastLiquidLabelText(model.getHumanLiquidString());
            }
        }
    };
    EventHandler<ActionEvent> buyTeaButtonEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            model.humanBuyTea();
            if(model.getHumanLiquidString() == null) {
                view.setHumanLastLiquidLabelText(liquidNameNone);
            }
            else {
                view.setHumanLastLiquidLabelText(model.getHumanLiquidString());
            }
        }
    };
    EventHandler<ActionEvent> buyCoffeeButtonEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            model.humanBuyCoffee();
            if(model.getHumanLiquidString() == null) {
                view.setHumanLastLiquidLabelText(liquidNameNone);
            }
            else {
                view.setHumanLastLiquidLabelText(model.getHumanLiquidString());
            }
        }
    };
    EventHandler<ActionEvent> buyJuiceButtonEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            model.humanBuyJuice(view.getShopJuiceTasteFieldString());
            if(model.getHumanLiquidString() == null) {
                view.setHumanLastLiquidLabelText(liquidNameNone);
            }
            else {
                view.setHumanLastLiquidLabelText(model.getHumanLiquidString());
            }
        }
    };
    EventHandler<ActionEvent> addHumanButtonHandler = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            model.addHuman();
            view.refreshHumansListView();
        }
    };
    EventHandler<ActionEvent> removeHumanButtonHandler = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            if(view.getSelectedHuman() != -1) {
                model.removeHuman(view.getSelectedHuman());
                view.refreshHumansListView();
            }
            model.setCurrentHuman(view.getSelectedHuman());
            if(model.getHumanLiquidString() == null) {
                view.setHumanLastLiquidLabelText(liquidNameNone);
            }
            else {
                view.setHumanLastLiquidLabelText(model.getHumanLiquidString());
            }
            if(model.getHumanName() == null) {
                view.setHumanNameLabelText(humanNameNone);
            }
            else {
                view.setHumanNameLabelText(model.getHumanName());
            }
        }
    };
    EventHandler<MouseEvent> humansListVeiwOnMouseClickedEventHandler = new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent event) {
            if(view.getSelectedHuman() != -1) {
                model.setCurrentHuman(view.getSelectedHuman());
                if(model.getHumanLiquidString() == null) {
                    view.setHumanLastLiquidLabelText(liquidNameNone);
                }
                else {
                    view.setHumanLastLiquidLabelText(model.getHumanLiquidString());
                }
                if(model.getHumanName() == null) {
                    view.setHumanNameLabelText(humanNameNone);
                }
                else {
                    view.setHumanNameLabelText(model.getHumanName());
                }
            }
        }
    };
    public Controller() {
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
        view.setBuyWaterButtonHandler(buyWaterButtonEvent);
        view.setBuyCoffeeButtonHandler(buyCoffeeButtonEvent);
        view.setBuyTeaButtonHandler(buyTeaButtonEvent);
        view.setBuyJuiceButtonHandler(buyJuiceButtonEvent);
        view.setBottleContentLabel(model.getBottleContentString());
        view.setCupContentLabel(model.getCupContentString());
        view.setHumansListVeiwList(model.getHumansList());
        view.setAddHumanButtonHandler(addHumanButtonHandler);
        view.setRemoveHumanButtonHandler(removeHumanButtonHandler);
        view.setHumansListViewOnMouseClickedEvent(humansListVeiwOnMouseClickedEventHandler);
    };
    public void setViewPane(Pane pane) {
        view.setPane(pane);
    }
}
