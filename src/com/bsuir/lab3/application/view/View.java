package com.bsuir.lab3.application.view;

import com.bsuir.lab3.human.Human;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class View{
    private final static String humanNameString = "None";
    private final static String humanSetNameString = "Set name";
    private final static String humanPourLiquidToCupString = "Pour liquid(Bottle -> Cup";
    private final static String humanPourLiquidToBottleString = "Pour liquid(Cup -> Bottle)";
    private final static String humanDrinkFromCupString = "Drink from cup";
    private final static String humanDrinkFromBottleString ="Drink from bottle";

    private final static int humanColumnLayoutX = 20;
    private final static int humanNameLabelLayoutY = 20;
    private final static int humanNameFieldLayoutY = 50;
    private final static int humanSetNameButtonLayoutY = 90;
    private final static int humanPourLiquidToBottleButtonLayoutY = 130;
    private final static int humanPourLiquidToCupButtonLayoutY = 170;
    private final static int humanDrinkFromBottleLayoutY = 210;
    private final static int humanDrinkFromCupLayoutY = 250;

    private Label humanNameLabel = new Label(humanNameString);
    private TextField humanNameField = new TextField();
    private Button humanSetNameButton = new Button(humanSetNameString);
    private Button humanPourLiquidToCupButton = new Button(humanPourLiquidToCupString);
    private Button humanPourLiquidToBottleButton = new Button(humanPourLiquidToBottleString);
    private Button humanDrinkFromCupButton = new Button(humanDrinkFromCupString);
    private Button humanDrinkFromBottleButton = new Button(humanDrinkFromBottleString);
    private Label humanLastLiquidLabel = new Label("None");

    private final static String juiceString = "Juice";
    private final static String juiceVolumeString = "Volume:";
    private final static String juiceTasteString = "Taste:";

    private final static int juiceColumnLayoutX = 200;
    private final static int juiceLabelLayoutY = 20;
    private final static int juiceVolumeLabelLayoutY = 50;
    private final static int juiceVolumeFieldLayoutY = 70;
    private final static int juiceTasteLabelLayoutY = 100;
    private final static int juiceTasteFieldLayoutY = 120;

    private Label juiceLabel = new Label(juiceString);
    private Label juiceVolumeLabel = new Label(juiceVolumeString );
    private Label juiceTasteLabel = new Label(juiceTasteString);
    private TextField juiceVolumeField = new TextField();
    private TextField juiceTasteField = new TextField();

    private final static String waterString = "Water";
    private final static String waterVolumeString = "Volume:";

    private final static int waterColumnLayoutX = 380;
    private final static int waterLabelLayoutY = 20;
    private final static int waterVolumeLabelLayoutY = 50;
    private final static int waterVolumeFieldLayoutY = 70;

    private Label waterLabel = new Label(waterString);
    private Label waterVolumeLabel = new Label(waterVolumeString);
    private TextField waterVolumeField = new TextField();

    private final static String cupString = "Cup";
    private final static String cupVolumeString = "Volume:";
    private final static String cupPourWaterString = "Pour water";
    private final static String cupPourJuiceString = "Pour juice";
    private final static String cupPourOutString = "Pour out";

    private final static int cupColumnLayoutX = 560;
    private final static int cupLabelLayoutY = 20;
    private final static int cupVolumeLabelLayoutY = 50;
    private final static int cupVolumeFieldLayoutY = 70;
    private final static int cupPourWaterButtonLayoutY = 110;
    private final static int cupPourJuiceButtonLayoutY = 150;
    private final static int cupPourOutButtonLayoutY = 190;
    private final static int cupContentLabelLayoutY = 230;

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

    private final static int bottleColumnLayoutX = 740;
    private final static int bottleLabelLayoutY = 20;
    private final static int bottleVolumeLabelLayoutY = 50;
    private final static int bottleVolumeFieldLayoutY = 70;
    private final static int bottlePourWaterButtonLayoutY = 110;
    private final static int bottlePourJuiceButtonLayoutY = 150;
    private final static int bottlePourOutButtonLayoutY = 190;
    private final static int bottleContentLabelLayoutY = 230;

    private Label bottleLabel = new Label(bottleString);
    private Label bottleVolumeLabel = new Label(bottleVolumeString);
    private TextField bottleVolumeField = new TextField();
    private Button bottlePourWaterButton = new Button(bottlePourWaterString);
    private Button bottlePourJuiceButton = new Button(bottlePourJuiceString);
    private Button bottlePourOutButton = new Button(bottlePourOutString);
    private Label bottleContentLabel= new Label();

    private final static String shopLabelString = new String("Shop");
    private final static String buyWaterButtonString= new String("Buy water");
    private final static String buyCoffeeButtonString = new String("Buy coffee");
    private final static String buyTeaButtonString = new String("Buy tea");
    private final static String buyJuiceButtonString = new String("Buy juice");
    private final static String shopJuiceTasteLabelString = new String("Taste");

    private final static int shopColumnLayoutX = 920;
    private final static int shopLabelLayoutY = 20;
    private final static int buyCoffeeButtonLayoutY = 50;
    private final static int buyTeaButtonLayoutY = 80;
    private final static int buyWaterButtonLayoutY = 110;
    private final static int buyJuiceButtonLayoutY = 140;
    private final static int shopJuiceTasteLabelLayoutY = 170;
    private final static int shopJuiceTasteFieldLayoutY = 200;

    private final static int humansViewListLayoutX = 1100;
    private final static int humansViewListLayoutY = 20;
    private final static int addHumanLayoutY = 240;
    private final static int removeHumanLayoutY = 290;

    private final static int humansListViewMaxHeight = 180;
    private final static int humansListViewMaxWidth = 200;

    private final static String addHumanButtonString = "Add human";
    private final static String removeHumanButtonString = "Remove human";

    private Label shopLabel = new Label(shopLabelString);
    private Button buyWaterButton = new Button(buyWaterButtonString);
    private Button buyCoffeeButton = new Button(buyCoffeeButtonString);
    private Button buyTeaButton = new Button(buyTeaButtonString);
    private Button buyJuiceButton = new Button(buyJuiceButtonString);
    private Label shopJuiceTasteLabel = new Label(shopJuiceTasteLabelString);
    private TextField shopJuiceTasteField = new TextField();

    private ListView<Human> humansListView = new ListView<Human>();
    private Button addHumanButton = new Button(addHumanButtonString);
    private Button removeHumanButton = new Button(removeHumanButtonString);

    public View() {

        humansListView.setLayoutX(humansViewListLayoutX);
        humansListView.setLayoutY(humansViewListLayoutY);
        humansListView.setMaxSize(humansListViewMaxWidth, humansListViewMaxHeight);

        addHumanButton.setLayoutX(humansViewListLayoutX);
        addHumanButton.setLayoutY(addHumanLayoutY);
        removeHumanButton.setLayoutX(humansViewListLayoutX);
        removeHumanButton.setLayoutY(removeHumanLayoutY);

        shopLabel.setLayoutX(shopColumnLayoutX);
        shopLabel.setLayoutY(shopLabelLayoutY);
        buyCoffeeButton.setLayoutX(shopColumnLayoutX);
        buyCoffeeButton.setLayoutY(buyCoffeeButtonLayoutY);
        buyTeaButton.setLayoutX(shopColumnLayoutX);
        buyTeaButton.setLayoutY(buyTeaButtonLayoutY);
        buyWaterButton.setLayoutX(shopColumnLayoutX);
        buyWaterButton.setLayoutY(buyWaterButtonLayoutY);
        buyJuiceButton.setLayoutX(shopColumnLayoutX);
        buyJuiceButton.setLayoutY(buyJuiceButtonLayoutY);
        shopJuiceTasteLabel.setLayoutX(shopColumnLayoutX);
        shopJuiceTasteLabel.setLayoutY(shopJuiceTasteLabelLayoutY);
        shopJuiceTasteField.setLayoutX(shopColumnLayoutX);
        shopJuiceTasteField.setLayoutY(shopJuiceTasteFieldLayoutY);

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
        humanLastLiquidLabel.setLayoutX(humanColumnLayoutX);
        humanLastLiquidLabel.setLayoutY(280);

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

    public void setHumansListVeiwList(ObservableList<Human> list) {
        if(list == null)
        {
            throw new NullPointerException();
        }
        humansListView.setItems(list);
    }

    public void setBuyWaterButtonHandler(EventHandler<ActionEvent> handler) {
        buyWaterButton.setOnAction(handler);
    }
    public void setBuyJuiceButtonHandler(EventHandler<ActionEvent> handler) {
        buyJuiceButton.setOnAction(handler);
    }
    public void setBuyTeaButtonHandler(EventHandler<ActionEvent> handler) {
        buyTeaButton.setOnAction(handler);
    }
    public void setBuyCoffeeButtonHandler(EventHandler<ActionEvent> handler) {
        buyCoffeeButton.setOnAction(handler);
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
    public void setAddHumanButtonHandler(EventHandler<ActionEvent> handler){
        addHumanButton.setOnAction(handler);
    }
    public void setRemoveHumanButtonHandler(EventHandler<ActionEvent> handler){
        removeHumanButton.setOnAction(handler);
    }
    public int getSelectedHuman(){
        return humansListView.getSelectionModel().getSelectedIndex();
    }
    public void setHumansListViewOnMouseClickedEvent(EventHandler<MouseEvent> event){
        humansListView.setOnMouseClicked(event);
    }
    public String getShopJuiceTasteFieldString(){ return shopJuiceTasteField.getText();}
    public String getHumanNameInput()
    {
        return humanNameField.getText();
    }
    public int getJuiceVolumeInput()
    {
        return Integer.parseInt(juiceVolumeField.getText());
    }
    public String getJuiceTasteInput()
    {
        return juiceTasteField.getText();
    }
    public int getWaterVolumeInput()
    {
        return Integer.parseInt(waterVolumeField.getText());
    }
    public int getCupVolumeInput()
    {
        return Integer.parseInt(cupVolumeField.getText());
    }
    public int getBottleVolumeInput()
    {
        return Integer.parseInt(bottleVolumeField.getText());
    }
    public void refreshHumansListView(){
        humansListView.refresh();
    }
    public void setHumanNameLabelText(String string)    {
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
    public void setHumanLastLiquidLabelText(String string) { humanLastLiquidLabel.setText(string);}
    public void setPane(Pane pane) {
        pane.getChildren().addAll(humanNameLabel, humanNameField, humanSetNameButton, humanPourLiquidToBottleButton, humanPourLiquidToCupButton, humanDrinkFromBottleButton, humanDrinkFromCupButton, humanLastLiquidLabel);
        pane.getChildren().addAll(juiceLabel, juiceVolumeLabel, juiceTasteField, juiceTasteLabel, juiceVolumeField);
        pane.getChildren().addAll(waterLabel, waterVolumeField, waterVolumeLabel);
        pane.getChildren().addAll(cupContentLabel, cupLabel, cupPourJuiceButton, cupPourWaterButton, cupVolumeField, cupVolumeLabel,cupPourOutButton);
        pane.getChildren().addAll(bottleContentLabel, bottleLabel, bottlePourJuiceButton, bottlePourWaterButton, bottleVolumeField, bottleVolumeLabel, bottlePourOutButton);
        pane.getChildren().addAll(shopLabel, shopJuiceTasteField, shopJuiceTasteLabel, buyCoffeeButton, buyJuiceButton, buyTeaButton, buyWaterButton);
        pane.getChildren().addAll(humansListView, addHumanButton, removeHumanButton);
    }
}
