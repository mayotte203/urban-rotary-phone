package com.bsuir.lab2.application.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class View{
    private final static String humanNameString = "Human";
    private final static String humanSetNameString = "Set name";
    private final static String humanPourLiquidToCupString = "Pour liquid(Bottle -> Cup";
    private final static String humanPourLiquidToBottleString = "Pour liquid(Cup -> Bottle)";
    private final static String humanDrinkFromCupString = "Drink from cup";
    private final static String humanDrinkFromBottleString ="Drink from bottle";

    private final static Integer humanColumnLayoutX = 20;
    private final static Integer humanNameLabelLayoutY = 20;
    private final static Integer humanNameFieldLayoutY = 50;
    private final static Integer humanSetNameButtonLayoutY = 90;
    private final static Integer humanPourLiquidToBottleButtonLayoutY = 130;
    private final static Integer humanPourLiquidToCupButtonLayoutY = 170;
    private final static Integer humanDrinkFromBottleLayoutY = 210;
    private final static Integer humanDrinkFromCupLayoutY = 250;

    private Label humanNameLabel = new Label(humanNameString);
    private TextField humanNameField = new TextField();
    private Button humanSetNameButton = new Button(humanSetNameString);
    private Button humanPourLiquidToCupButton = new Button(humanPourLiquidToCupString);
    private Button humanPourLiquidToBottleButton = new Button(humanPourLiquidToBottleString);
    private Button humanDrinkFromCupButton = new Button(humanDrinkFromCupString);
    private Button humanDrinkFromBottleButton = new Button(humanDrinkFromBottleString);

    private final static String juiceString = "Juice";
    private final static String juiceVolumeString = "Volume:";
    private final static String juiceTasteString = "Taste:";

    private final static Integer juiceColumnLayoutX = 200;
    private final static Integer juiceLabelLayoutY = 20;
    private final static Integer juiceVolumeLabelLayoutY = 50;
    private final static Integer juiceVolumeFieldLayoutY = 70;
    private final static Integer juiceTasteLabelLayoutY = 100;
    private final static Integer juiceTasteFieldLayoutY = 120;

    private Label juiceLabel = new Label(juiceString);
    private Label juiceVolumeLabel = new Label(juiceVolumeString );
    private Label juiceTasteLabel = new Label(juiceTasteString);
    private TextField juiceVolumeField = new TextField();
    private TextField juiceTasteField = new TextField();

    private final static String waterString = "Water";
    private final static String waterVolumeString = "Volume:";

    private final static Integer waterColumnLayoutX = 380;
    private final static Integer waterLabelLayoutY = 20;
    private final static Integer waterVolumeLabelLayoutY = 50;
    private final static Integer waterVolumeFieldLayoutY = 70;

    private Label waterLabel = new Label(waterString);
    private Label waterVolumeLabel = new Label(waterVolumeString);
    private TextField waterVolumeField = new TextField();

    private final static String cupString = "Cup";
    private final static String cupVolumeString = "Volume:";
    private final static String cupPourWaterString = "Pour water";
    private final static String cupPourJuiceString = "Pour juice";
    private final static String cupPourOutString = "Pour out";

    private final static Integer cupColumnLayoutX = 560;
    private final static Integer cupLabelLayoutY = 20;
    private final static Integer cupVolumeLabelLayoutY = 50;
    private final static Integer cupVolumeFieldLayoutY = 70;
    private final static Integer cupPourWaterButtonLayoutY = 110;
    private final static Integer cupPourJuiceButtonLayoutY = 150;
    private final static Integer cupPourOutButtonLayoutY = 190;
    private final static Integer cupContentLabelLayoutY = 230;

    private Label cupLabel = new Label(cupString);
    private Label cupVolumeLabel = new Label(cupVolumeString);
    private TextField cupVolumeField = new TextField();
    private Button cupPourWaterButton = new Button(cupPourWaterString);
    private Button cupPourJuiceButton = new Button(cupPourJuiceString);
    private Button cupPourOutButton = new Button(cupPourOutString);
    private Label cupContentLabel= new Label();

    private final static String bottleString = "Bottle";
    private final static String bottleVolumeString = "Volume:";
    private final static String bottlePourWaterString = "Pour water";
    private final static String bottlePourJuiceString = "Pour juice";
    private final static String bottlePourOutString = "Pour out";

    private final static Integer bottleColumnLayoutX = 740;
    private final static Integer bottleLabelLayoutY = 20;
    private final static Integer bottleVolumeLabelLayoutY = 50;
    private final static Integer bottleVolumeFieldLayoutY = 70;
    private final static Integer bottlePourWaterButtonLayoutY = 110;
    private final static Integer bottlePourJuiceButtonLayoutY = 150;
    private final static Integer bottlePourOutButtonLayoutY = 190;
    private final static Integer bottleContentLabelLayoutY = 230;

    private Label bottleLabel = new Label(bottleString);
    private Label bottleVolumeLabel = new Label(bottleVolumeString);
    private TextField bottleVolumeField = new TextField();
    private Button bottlePourWaterButton = new Button(bottlePourWaterString);
    private Button bottlePourJuiceButton = new Button(bottlePourJuiceString);
    private Button bottlePourOutButton = new Button(bottlePourOutString);
    private Label bottleContentLabel= new Label();

    public View() {
        humanNameLabel.setLayoutX(humanColumnLayoutX);
        humanNameLabel.setLayoutY(humanNameLabelLayoutY);
        humanNameField.setLayoutX(humanColumnLayoutX);
        humanNameField.setLayoutY(humanNameFieldLayoutY);
        humanSetNameButton.setLayoutX(humanColumnLayoutX);
        humanSetNameButton.setLayoutY(humanSetNameButtonLayoutY);
        humanPourLiquidToBottleButton.setLayoutX(humanColumnLayoutX);
        humanPourLiquidToBottleButton.setLayoutY(humanPourLiquidToBottleButtonLayoutY);
        humanPourLiquidToCupButton.setLayoutX(humanColumnLayoutX);
        humanPourLiquidToCupButton.setLayoutY(humanPourLiquidToCupButtonLayoutY);
        humanDrinkFromBottleButton.setLayoutX(humanColumnLayoutX);
        humanDrinkFromBottleButton.setLayoutY(humanDrinkFromBottleLayoutY);
        humanDrinkFromCupButton.setLayoutX(humanColumnLayoutX);
        humanDrinkFromCupButton.setLayoutY(humanDrinkFromCupLayoutY );

        juiceLabel.setLayoutX(juiceColumnLayoutX);
        juiceLabel.setLayoutY(juiceLabelLayoutY);
        juiceVolumeLabel.setLayoutX(juiceColumnLayoutX);
        juiceVolumeLabel.setLayoutY(juiceVolumeLabelLayoutY);
        juiceVolumeField.setLayoutX(juiceColumnLayoutX);
        juiceVolumeField.setLayoutY(juiceVolumeFieldLayoutY);
        juiceTasteLabel.setLayoutX(juiceColumnLayoutX);
        juiceTasteLabel.setLayoutY(juiceTasteLabelLayoutY);
        juiceTasteField.setLayoutX(juiceColumnLayoutX);
        juiceTasteField.setLayoutY(juiceTasteFieldLayoutY);

        waterLabel.setLayoutX(waterColumnLayoutX);
        waterLabel.setLayoutY(waterLabelLayoutY);
        waterVolumeLabel.setLayoutX(waterColumnLayoutX);
        waterVolumeLabel.setLayoutY(waterVolumeLabelLayoutY);
        waterVolumeField.setLayoutX(waterColumnLayoutX);
        waterVolumeField.setLayoutY(waterVolumeFieldLayoutY);

        cupLabel.setLayoutX(cupColumnLayoutX);
        cupLabel.setLayoutY(cupLabelLayoutY);
        cupVolumeLabel.setLayoutX(cupColumnLayoutX);
        cupVolumeLabel.setLayoutY(cupVolumeLabelLayoutY);
        cupVolumeField.setLayoutX(cupColumnLayoutX);
        cupVolumeField.setLayoutY(cupVolumeFieldLayoutY);
        cupPourWaterButton.setLayoutX(cupColumnLayoutX);
        cupPourWaterButton.setLayoutY(cupPourWaterButtonLayoutY);
        cupPourJuiceButton.setLayoutX(cupColumnLayoutX);
        cupPourJuiceButton.setLayoutY(cupPourJuiceButtonLayoutY);
        cupPourOutButton.setLayoutX(cupColumnLayoutX);
        cupPourOutButton.setLayoutY(cupPourOutButtonLayoutY);
        cupContentLabel.setLayoutX(cupColumnLayoutX);
        cupContentLabel.setLayoutY(cupContentLabelLayoutY);

        bottleLabel.setLayoutX(bottleColumnLayoutX);
        bottleLabel.setLayoutY(bottleLabelLayoutY);
        bottleVolumeLabel.setLayoutX(bottleColumnLayoutX);
        bottleVolumeLabel.setLayoutY(bottleVolumeLabelLayoutY);
        bottleVolumeField.setLayoutX(bottleColumnLayoutX);
        bottleVolumeField.setLayoutY(bottleVolumeFieldLayoutY);
        bottlePourWaterButton.setLayoutX(bottleColumnLayoutX);
        bottlePourWaterButton.setLayoutY(bottlePourWaterButtonLayoutY);
        bottlePourJuiceButton.setLayoutX(bottleColumnLayoutX);
        bottlePourJuiceButton.setLayoutY(bottlePourJuiceButtonLayoutY);
        bottlePourOutButton.setLayoutX(bottleColumnLayoutX);
        bottlePourOutButton.setLayoutY(bottlePourOutButtonLayoutY);
        bottleContentLabel.setLayoutX(bottleColumnLayoutX);
        bottleContentLabel.setLayoutY(bottleContentLabelLayoutY);
    }

    public void setHumanSetNameButtonHandler(EventHandler<ActionEvent> handler) {
        humanSetNameButton.setOnAction(handler);
    }
    public void setHumanPourLiquidToCupButtonHandler(EventHandler<ActionEvent> handler) {
        humanPourLiquidToCupButton.setOnAction(handler);
    }
    public void setHumanPourLiquidToBottleButtonHandler(EventHandler<ActionEvent> handler) {
        humanPourLiquidToBottleButton.setOnAction(handler);
    }
    public void setHumanDrinkFromBottleButtonHandler(EventHandler<ActionEvent> handler) {
        humanDrinkFromBottleButton.setOnAction(handler);
    }
    public void setHumanDrinkFromCupButtonHandler(EventHandler<ActionEvent> handler) {
        humanDrinkFromCupButton.setOnAction(handler);
    }
    public void setCupPourJuiceButtonHandler(EventHandler<ActionEvent> handler) {
        cupPourJuiceButton.setOnAction(handler);
    }
    public void setCupPourWaterButtonHandler(EventHandler<ActionEvent> handler) {
        cupPourWaterButton.setOnAction(handler);
    }
    public void setCupPourOutButtonHandler(EventHandler<ActionEvent> handler)
    {
        cupPourOutButton.setOnAction(handler);
    }
    public void setBottlePourJuiceButtonHandler(EventHandler<ActionEvent> handler) {
        bottlePourJuiceButton.setOnAction(handler);
    }
    public void setBottlePourWaterButtonHandler(EventHandler<ActionEvent> handler) {
        bottlePourWaterButton.setOnAction(handler);
    }
    public void setBottlePourOutButtonHandler(EventHandler<ActionEvent> handler) {
        bottlePourOutButton.setOnAction(handler);
    }
    public String getHumanNameInput()
    {
        return humanNameField.getText();
    }
    public Integer getJuiceVolumeInput()
    {
        return Integer.parseInt(juiceVolumeField.getText());
    }
    public String getJuiceTasteInput()
    {
        return juiceTasteField.getText();
    }
    public Integer getWaterVolumeInput()
    {
        return Integer.parseInt(waterVolumeField.getText());
    }
    public Integer getCupVolumeInput()
    {
        return Integer.parseInt(cupVolumeField.getText());
    }
    public Integer getBottleVolumeInput()
    {
        return Integer.parseInt(bottleVolumeField.getText());
    }
    public void setHumanNameLabelText(String string)
    {
        humanNameLabel.setText(string);
    }
    public void setCupContentLabel(String string)
    {
        cupContentLabel.setText(string);
    }
    public void setBottleContentLabel(String string)
    {
        bottleContentLabel.setText(string);
    }
    public void setPane(Pane pane) {
        pane.getChildren().addAll(humanNameLabel, humanNameField, humanSetNameButton, humanPourLiquidToBottleButton, humanPourLiquidToCupButton, humanDrinkFromBottleButton, humanDrinkFromCupButton);
        pane.getChildren().addAll(juiceLabel, juiceVolumeLabel, juiceTasteField, juiceTasteLabel, juiceVolumeField);
        pane.getChildren().addAll(waterLabel, waterVolumeField, waterVolumeLabel);
        pane.getChildren().addAll(cupContentLabel, cupLabel, cupPourJuiceButton, cupPourWaterButton, cupVolumeField, cupVolumeLabel,cupPourOutButton);
        pane.getChildren().addAll(bottleContentLabel, bottleLabel, bottlePourJuiceButton, bottlePourWaterButton, bottleVolumeField, bottleVolumeLabel, bottlePourOutButton);
    }
}
