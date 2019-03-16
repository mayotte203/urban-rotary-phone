package com.bsuir.lab2.application.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class View{
    final private String humanNameString = "Human";
    final private String humanSetNameString = "Set name";
    final private String humanPourLiquidToCupString = "Pour liquid(Bottle -> Cup";
    final private String humanPourLiquidToBottleString = "Pour liquid(Cup -> Bottle)";
    final private String humanDrinkFromCupString = "Drink from cup";
    final private String humanDrinkFromBottleString ="Drink from bottle";

    final private Integer humanColumnLayoutX = 20;
    final private Integer humanNameLabelLayoutY = 20;
    final private Integer humanNameFieldLayoutY = 50;
    final private Integer humanSetNameButtonLayoutY = 90;
    final private Integer humanPourLiquidToBottleButtonLayoutY = 130;
    final private Integer humanPourLiquidToCupButtonLayoutY = 170;
    final private Integer humanDrinkFromBottleLayoutY = 210;
    final private Integer humanDrinkFromCupLayoutY = 250;

    private Label humanNameLabel = new Label(humanNameString);
    private TextField humanNameField = new TextField();
    private Button humanSetNameButton = new Button(humanSetNameString);
    private Button humanPourLiquidToCupButton = new Button(humanPourLiquidToCupString);
    private Button humanPourLiquidToBottleButton = new Button(humanPourLiquidToBottleString);
    private Button humanDrinkFromCupButton = new Button(humanDrinkFromCupString);
    private Button humanDrinkFromBottleButton = new Button(humanDrinkFromBottleString);

    final private String juiceString = "Juice";
    final private String juiceVolumeString = "Volume:";
    final private String juiceTasteString = "Taste:";

    final private Integer juiceColumnLayoutX = 200;
    final private Integer juiceLabelLayoutY = 20;
    final private Integer juiceVolumeLabelLayoutY = 50;
    final private Integer juiceVolumeFieldLayoutY = 70;
    final private Integer juiceTasteLabelLayoutY = 100;
    final private Integer juiceTasteFieldLayoutY = 120;

    private Label juiceLabel = new Label(juiceString);
    private Label juiceVolumeLabel = new Label(juiceVolumeString );
    private Label juiceTasteLabel = new Label(juiceTasteString);
    private TextField juiceVolumeField = new TextField();
    private TextField juiceTasteField = new TextField();

    final private String waterString = "Water";
    final private String waterVolumeString = "Volume:";

    final private Integer waterColumnLayoutX = 380;
    final private Integer waterLabelLayoutY = 20;
    final private Integer waterVolumeLabelLayoutY = 50;
    final private Integer waterVolumeFieldLayoutY = 70;

    private Label waterLabel = new Label(waterString);
    private Label waterVolumeLabel = new Label(waterVolumeString);
    private TextField waterVolumeField = new TextField();

    final private String cupString = "Cup";
    final private String cupVolumeString = "Volume:";
    final private String cupPourWaterString = "Pour water";
    final private String cupPourJuiceString = "Pour juice";
    final private String cupPourOutString = "Pour out";

    final private Integer cupColumnLayoutX = 560;
    final private Integer cupLabelLayoutY = 20;
    final private Integer cupVolumeLabelLayoutY = 50;
    final private Integer cupVolumeFieldLayoutY = 70;
    final private Integer cupPourWaterButtonLayoutY = 110;
    final private Integer cupPourJuiceButtonLayoutY = 150;
    final private Integer cupPourOutButtonLayoutY = 190;
    final private Integer cupContentLabelLayoutY = 230;

    private Label cupLabel = new Label(cupString);
    private Label cupVolumeLabel = new Label(cupVolumeString);
    private TextField cupVolumeField = new TextField();
    private Button cupPourWaterButton = new Button(cupPourWaterString);
    private Button cupPourJuiceButton = new Button(cupPourJuiceString);
    private Button cupPourOutButton = new Button(cupPourOutString);
    private Label cupContentLabel= new Label();

    final private String bottleString = "Bottle";
    final private String bottleVolumeString = "Volume:";
    final private String bottlePourWaterString = "Pour water";
    final private String bottlePourJuiceString = "Pour juice";
    final private String bottlePourOutString = "Pour out";

    final private Integer bottleColumnLayoutX = 740;
    final private Integer bottleLabelLayoutY = 20;
    final private Integer bottleVolumeLabelLayoutY = 50;
    final private Integer bottleVolumeFieldLayoutY = 70;
    final private Integer bottlePourWaterButtonLayoutY = 110;
    final private Integer bottlePourJuiceButtonLayoutY = 150;
    final private Integer bottlePourOutButtonLayoutY = 190;
    final private Integer bottleContentLabelLayoutY = 230;

    private Label bottleLabel = new Label(bottleString);
    private Label bottleVolumeLabel = new Label(bottleVolumeString);
    private TextField bottleVolumeField = new TextField();
    private Button bottlePourWaterButton = new Button(bottlePourWaterString);
    private Button bottlePourJuiceButton = new Button(bottlePourJuiceString);
    private Button bottlePourOutButton = new Button(bottlePourOutString);
    private Label bottleContentLabel= new Label();

    public View()
    {
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

    public void setHumanSetNameButtonHandler(EventHandler<ActionEvent> handler)
    {
        humanSetNameButton.setOnAction(handler);
    }
    public void setHumanPourLiquidToCupButtonHandler(EventHandler<ActionEvent> handler)
    {
        humanPourLiquidToCupButton.setOnAction(handler);
    }
    public void setHumanPourLiquidToBottleButtonHandler(EventHandler<ActionEvent> handler)
    {
        humanPourLiquidToBottleButton.setOnAction(handler);
    }
    public void setHumanDrinkFromBottleButtonHandler(EventHandler<ActionEvent> handler)
    {
        humanDrinkFromBottleButton.setOnAction(handler);
    }
    public void setHumanDrinkFromCupButtonHandler(EventHandler<ActionEvent> handler)
    {
        humanDrinkFromCupButton.setOnAction(handler);
    }
    public void setCupPourJuiceButtonHandler(EventHandler<ActionEvent> handler)
    {
        cupPourJuiceButton.setOnAction(handler);
    }
    public void setCupPourWaterButtonHandler(EventHandler<ActionEvent> handler)
    {
        cupPourWaterButton.setOnAction(handler);
    }
    public void setCupPourOutButtonHandler(EventHandler<ActionEvent> handler)
    {
        cupPourOutButton.setOnAction(handler);
    }
    public void setBottlePourJuiceButtonHandler(EventHandler<ActionEvent> handler)
    {
        bottlePourJuiceButton.setOnAction(handler);
    }
    public void setBottlePourWaterButtonHandler(EventHandler<ActionEvent> handler)
    {
        bottlePourWaterButton.setOnAction(handler);
    }
    public void setBottlePourOutButtonHandler(EventHandler<ActionEvent> handler)
    {
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
    public void setPane(Pane pane)
    {
        pane.getChildren().addAll(humanNameLabel, humanNameField, humanSetNameButton, humanPourLiquidToBottleButton, humanPourLiquidToCupButton, humanDrinkFromBottleButton, humanDrinkFromCupButton);
        pane.getChildren().addAll(juiceLabel, juiceVolumeLabel, juiceTasteField, juiceTasteLabel, juiceVolumeField);
        pane.getChildren().addAll(waterLabel, waterVolumeField, waterVolumeLabel);
        pane.getChildren().addAll(cupContentLabel, cupLabel, cupPourJuiceButton, cupPourWaterButton, cupVolumeField, cupVolumeLabel,cupPourOutButton);
        pane.getChildren().addAll(bottleContentLabel, bottleLabel, bottlePourJuiceButton, bottlePourWaterButton, bottleVolumeField, bottleVolumeLabel, bottlePourOutButton);
    }
}
